/*
 * Busca cita y regresa un arraylist y lo pone en una jtable*/
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.*;
import Modelo.*;

import java.sql.Connection;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ContBusCita implements ActionListener{
	PagBusCita pBusC = new PagBusCita();
	Connection conn;
	public ContBusCita(PagBusCita pBusC, Connection conn){
		this.pBusC = pBusC;
		this.conn = conn;
		this.pBusC.Buscar.addActionListener(this);
	}

	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource() == pBusC.Buscar){
			Empleado emp = new Empleado();
			ArrayList<Cita> citArr = new ArrayList<Cita>();
			Buscar bus = new Buscar(conn);
			String[] paramsE = new String[3];
			int flag = 1;
			//Validar nombre
			try {
				String temp = pBusC.tNombre.getText().toString();
				if(!temp.matches("^[a-zA-Z]+ ?([a-zA-Z]+)?$"))
					throw new Exception();
				paramsE[0] = temp;
			}
			catch(Exception e1) {
				flag=0;
				pBusC.tNombre.setText("");
				JOptionPane.showMessageDialog(pBusC, "Favor de ingresar un nombre valido");
			}
			//Validar apaterno
			try {
				String temp = pBusC.tApaterno.getText().toString();
				if(!temp.matches("^[a-zA-Z]+ ?([a-zA-Z]+)?$"))
					throw new Exception();
				paramsE[1] = temp;
			}
			catch(Exception e1) {
				flag=0;
				pBusC.tApaterno.setText("");
				JOptionPane.showMessageDialog(pBusC, "Favor de ingresar un a. paterno valido");
			}
			//Validar amaterno
			try {
				String temp = pBusC.tAmaterno.getText().toString();
				if(!temp.matches("^[a-zA-Z]+ ?([a-zA-Z]+)?$"))
					throw new Exception();
				paramsE[2] = temp;
			}
			catch(Exception e1) {
				flag=0;
				pBusC.tAmaterno.setText("");
				JOptionPane.showMessageDialog(pBusC, "Favor de ingresar un a. materno valido");
			}
			
			emp = bus.bEmpleado(paramsE);
			if(emp.getId_empleado() == -1){
				JOptionPane.showMessageDialog(pBusC, "Medico no encontrado");
				flag = 0;
			}else if(!emp.getOcupacion().toString().equals("medico")){
				JOptionPane.showMessageDialog(pBusC, "El empleado no es medico");
				flag = 0;
			}
			
			if(flag == 1){
				citArr = bus.bCita(paramsE);
				String col[] = {"Fecha", "Nombre", "A paterno", "A materno"};
				DefaultTableModel tableModel = new DefaultTableModel(col, 0);
				for(Cita citaTemp : citArr){
					Paciente pacTemp = new Paciente();
					pacTemp = bus.bPaciente(citaTemp.getId_paciente());
					Object[] objs = {citaTemp.getFecha().toString(), pacTemp.getB1_3(), pacTemp.getB1_1(), pacTemp.getB1_2()};
					tableModel.addRow(objs);
				}
				JTable tablaRes = new JTable(tableModel);
				JScrollPane tableContainer = new JScrollPane(tablaRes);
				pBusC.pRes.removeAll();
				pBusC.pRes.add(tableContainer);
				pBusC.pRes.updateUI();
				pBusC.pRes.repaint();
				
			}else{
				JOptionPane.showMessageDialog(pBusC, "Favor de arreglar datos");
			}
			
		}
		
	}
	

}
