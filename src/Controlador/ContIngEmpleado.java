package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.*;
import java.sql.Connection;


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
			//Insertar a BD
			System.out.println("Ingresar!!!");
		}
	}

}
