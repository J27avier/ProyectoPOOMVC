package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.*;
import Modelo.*;
import java.sql.Connection;

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
			System.out.println("Buscar");
		}
	}
	
}
