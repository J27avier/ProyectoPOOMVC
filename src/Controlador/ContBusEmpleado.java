package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.*;
import Modelo.*;

import java.sql.Connection;

import javax.swing.JOptionPane;

public class ContBusEmpleado implements ActionListener{
	PagBusEmpleado pBusE = new PagBusEmpleado();
	Connection conn;
	
	public ContBusEmpleado (PagBusEmpleado pBusE, Connection conn){
		this.pBusE = pBusE;
		this.conn = conn;
		this.pBusE.Buscar.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource()==pBusE.Buscar){
			Buscar bus = new Buscar(conn);
			Empleado emp = new Empleado();
			String[] paramsE = new String[3];
			int flag = 1; //Para ver si todos los campos han sido llenados correctamente
			//Validar nombre
			try{
				String temp = pBusE.tNombre.getText();
				if(!temp.matches("^[a-zA-Z]+ ?([a-zA-Z]+)?$"))
					throw new Exception();
				paramsE[0]=temp;
			}catch(Exception e1){
				flag=0;
				pBusE.tNombre.setText("");
				JOptionPane.showMessageDialog(pBusE, "Favor de ingresar nombre valido");
			}
			//Validar Apellido paterno
			try{
				String temp = pBusE.tApaterno.getText().toString();
				if(!temp.matches("^[a-zA-Z]+ ?([a-zA-Z]+)?$"))
					throw new Exception();
				paramsE[1]=temp;
			}catch(Exception e1){
				flag=0;
				pBusE.tApaterno.setText("");
				JOptionPane.showMessageDialog(pBusE, "Favor de ingresar apellido paterno valido");
			}
			//Validar Apellido materno
			try{
				String temp = pBusE.tAmaterno.getText().toString();
				if(!temp.matches("^[a-zA-Z]+ ?([a-zA-Z]+)?$"))
					throw new Exception();
				paramsE[2]=temp;
			}catch(Exception e1){
				flag=0;
				pBusE.tAmaterno.setText("");
				JOptionPane.showMessageDialog(pBusE, "Favor de ingresar apellido materno valido");
			}
			if(flag==0)
				JOptionPane.showMessageDialog(pBusE, "Favor de ingresar datos validos");
			else{
				emp = bus.bEmpleado(paramsE);
				if(emp.getId_empleado() == -1)
					JOptionPane.showMessageDialog(pBusE, "El empleado no fue encontrado");
				else{
					pBusE.lDir.setText(emp.getDir());
					pBusE.lDOB.setText(emp.getDOB().toString());
					pBusE.lSexo.setText(emp.getSexo());
					pBusE.lOcupacion.setText(emp.getOcupacion());
				}
			}
		}
	}
	
}
