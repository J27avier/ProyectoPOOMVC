package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import Vista.*;
import Modelo.*;

import java.sql.Connection;

import javax.swing.JOptionPane;

public class ContBusPaciente implements ActionListener{
	PagBusPaciente pBusP = new PagBusPaciente();
	Connection conn;
	public ContBusPaciente(PagBusPaciente pBusP, Connection conn){
		this.pBusP = pBusP;
		this.conn = conn;
		pBusP.Buscar1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent evento){
		if(evento.getSource()== pBusP.Buscar1){
			System.out.println("Buscar paciente");
		}
	}
}
