package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import Vista.*;
import Modelo.*;

import java.sql.Connection;

import javax.swing.JOptionPane;


public class ContIngEmpleado implements ActionListener{
	Vista.PagIngEmpleado pIngE = new Vista.PagIngEmpleado();
	Connection conn;
	
	public ContIngEmpleado(Vista.PagIngEmpleado pIngE, Connection conn){
		this.pIngE = pIngE;
		this.conn = conn;
		this.pIngE.ingresar.addActionListener(this);
	} 
	public void actionPerformed(ActionEvent evento){
		if(evento.getSource()==pIngE.ingresar)
		{
			Insertar ins = new Insertar(conn);
			Empleado emp = new Empleado();
			int flag = 1;
			//Validar Nombre
			try {
				String temp = pIngE.TNombre.getText().toString();
 
				emp.setNombre(temp);
			}
			catch(Exception e1) {
				flag=0;
				pIngE.TNombre.setText("");
				JOptionPane.showMessageDialog(pIngE, "Favor de ingresar un nombre valido");
			}
			//Validar APaterno
			try {
				String temp = pIngE.TAPaterno.getText().toString();
				if(!temp.matches("^[a-zA-Z]+$"))
					throw new Exception();
				emp.setAPaterno(temp);
			}
			catch(Exception e1) {
				flag=0;
				pIngE.TNombre.setText("");
				JOptionPane.showMessageDialog(pIngE, "Favor de ingresar un apellido paterno valido");
			}
			//Validar AMaterno
			try {
				String temp = pIngE.TAMaterno.getText().toString();
				if(!temp.matches("^[a-zA-Z]+$"))
					throw new Exception();
				emp.setAMaterno(temp);
			}
			catch(Exception e1) {
				flag=0;
				pIngE.TNombre.setText("");
				JOptionPane.showMessageDialog(pIngE, "Favor de ingresar un apellido materno valido");
			}
			//Validar direccion
			if(pIngE.TDireccion.getText()!= null){
				emp.setDir(pIngE.TDireccion.getText().toString());
			}
			else{
				JOptionPane.showMessageDialog(pIngE, "Favor de introducir una direccion");
				flag = 0;
			}
			//De java.util.Date a java.sql.Date, está más que insegurp si no es con dateChooser
			if(pIngE.dateChooser.getDate() != null){
				String DOB = String.format("%d-%d-%d", (1900 + pIngE.dateChooser.getDate().getYear()), (pIngE.dateChooser.getDate().getMonth()+1), pIngE.dateChooser.getDate().getDate());
				emp.setDOB(java.sql.Date.valueOf(DOB));
			}else{
				JOptionPane.showMessageDialog(pIngE, "Favor de introducir una fecha");
				flag = 0;
			}

			emp.setSexo(pIngE.DSexo.getSelectedItem().toString());
			emp.setOcupacion(pIngE.DOcupacion.getSelectedItem().toString());
			if(flag==0){
				JOptionPane.showMessageDialog(pIngE, "Favor de corregir valores");
			}
			else{
				int success = ins.iEmpleado(emp);
				if(success==1)
					JOptionPane.showMessageDialog(pIngE, "El empleado se agrego exitosamente");
				else
					JOptionPane.showMessageDialog(pIngE, "Hubo un error al agregar empleado");	
				pIngE.TNombre.setText("");
				pIngE.TAPaterno.setText("");
				pIngE.TAMaterno.setText("");
				pIngE.TDireccion.setText("");
				pIngE.dateChooser.setDate(null);
			}
				 
		}
	}

}
