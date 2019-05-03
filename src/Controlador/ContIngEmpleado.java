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
			//Validar Nombre
			try {
				String temp = pIngE.TNombre.getText().toString();
				if(!temp.matches("^[a-zA-Z]+$"))
					throw new Exception();
				emp.setNombre(temp);
			}
			catch(Exception e1) {
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
				pIngE.TNombre.setText("");
				JOptionPane.showMessageDialog(pIngE, "Favor de ingresar un apellido materno valido");
			}
			emp.setDir(pIngE.TDireccion.getText().toString());
			emp.setDOB(Date.valueOf(String.valueOf(pIngE.dateChooser.getDate())));

		}
	}

}
