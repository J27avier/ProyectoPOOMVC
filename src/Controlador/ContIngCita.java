package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import Vista.*;
import Modelo.*;

import java.sql.Connection;

import javax.swing.JOptionPane;

public class ContIngCita implements ActionListener{
	PagIngCita pIngC = new PagIngCita();
	Connection conn;
	public ContIngCita(PagIngCita pIngC, Connection conn){
		this.pIngC = pIngC;
		this.conn = conn;
		this.pIngC.Ingresar.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource() == pIngC.Ingresar){
			String[] paramsP = new String[3];
			String[] paramsE = new String[3];
			int flag = 1;
			Insertar ins = new Insertar(conn);
			Buscar bus = new Buscar(conn);
			Empleado emp = new Empleado();
			Paciente pac = new Paciente();
			Cita cit = new Cita();
			//Validar NombreP
			try{
				String temp = pIngC.tNombreP.getText().toString(); //
				if(!temp.matches("^[a-zA-Z]+ ?([a-zA-Z]+)?$"))
					throw new Exception();
				paramsP[0]= temp; //
			}catch(Exception e1){
				flag = 0;
				pIngC.tNombreP.setText(""); //
				JOptionPane.showMessageDialog(pIngC, "Favor de ingresar nombre del paciente valido"); //
			}
			//Validar ApaternoP
			try{
				String temp = pIngC.tApaternoP.getText().toString(); //
				if(!temp.matches("^[a-zA-Z]+$"))
					throw new Exception();
				paramsP[1]= temp; //
			}catch(Exception e1){
				flag = 0;
				pIngC.tApaternoP.setText(""); //
				JOptionPane.showMessageDialog(pIngC, "Favor de ingresar a. paterno del paciente valido"); //
			}
			//Validar AMaternoP
			try{
				String temp = pIngC.tAmaternoP.getText().toString(); //
				if(!temp.matches("^[a-zA-Z]+$"))
					throw new Exception();
				paramsP[2]= temp; //
			}catch(Exception e1){
				flag = 0;
				pIngC.tAmaternoP.setText(""); //
				JOptionPane.showMessageDialog(pIngC, "Favor de ingresar a. materno del paciente valido"); //
			}
			//Validar nombreD
			try{
				String temp = pIngC.tNombreD.getText().toString(); //
				if(!temp.matches("^[a-zA-Z]+ ?([a-zA-Z]+)?$"))
					throw new Exception();
				paramsE[0]= temp; //
			}catch(Exception e1){
				flag = 0;
				pIngC.tNombreD.setText(""); //
				JOptionPane.showMessageDialog(pIngC, "Favor de ingresar nombre del medico valido"); //
			}
			//Validar APaternoD
			try{
				String temp = pIngC.tApaternoD.getText().toString(); //
				if(!temp.matches("^[a-zA-Z]+$"))
					throw new Exception();
				paramsE[1]= temp; //
			}catch(Exception e1){
				flag = 0;
				pIngC.tApaternoD.setText(""); //
				JOptionPane.showMessageDialog(pIngC, "Favor de ingresar a. paterno del medico valido"); //
			}
			//Validar AMaternoD
			try{
				String temp = pIngC.tAmaternoD.getText().toString(); //
				if(!temp.matches("^[a-zA-Z]+$"))
					throw new Exception();
				paramsE[2]= temp; //
			}catch(Exception e1){
				flag = 0;
				pIngC.tAmaternoD.setText(""); //
				JOptionPane.showMessageDialog(pIngC, "Favor de ingresar a. materno del medico valido"); //
			}
			if(pIngC.dateChooser.getDate() != null){
				String Fecha = String.format("%d-%d-%d %s:%s:%s", (1900 + pIngC.dateChooser.getDate().getYear()), 
						(pIngC.dateChooser.getDate().getMonth()+1), pIngC.dateChooser.getDate().getDate(), 
						pIngC.Dhora.getSelectedItem().toString(), 
						pIngC.Dminuto.getSelectedItem().toString(), "00");
				
				//Agregar hora y min
				cit.setFecha(Fecha);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngC, "Favor de ingresar una fecha");
			}
			
			//Buscar paciente
			pac = bus.bPaciente(paramsP);
			if(pac.getId_paciente() == -1){
				JOptionPane.showMessageDialog(pIngC, "Paciente no encontrado");
				flag = 0;
			}
			//Buscar empleado
			emp = bus.bEmpleado(paramsE);
			if(emp.getId_empleado() == -1){
				JOptionPane.showMessageDialog(pIngC, "Medico no encontrado");
				flag = 0;
			}else if(!emp.getOcupacion().toString().equals("medico")){
				JOptionPane.showMessageDialog(pIngC, "El empleado no es medico");
				flag = 0;
			}
			if(flag == 1){
				int success = ins.iCita(emp, pac, cit);
				if(success == 1){
					JOptionPane.showMessageDialog(pIngC, "Cita agendada exitosamente!");
				}else{
					JOptionPane.showMessageDialog(pIngC, "No se pudo agendar cita");
				}
			}else{
				JOptionPane.showMessageDialog(pIngC, "Corregir los datos proporcionados");
			}	
		}
	}
}
