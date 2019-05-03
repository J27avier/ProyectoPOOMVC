package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.*;
import java.sql.Connection;



//inicia la clase de manejador de eventos
public class ContPagPrincipal implements ActionListener
{
	Vista.PagPrincipal pPrincipal = new Vista.PagPrincipal();
	Connection conn;

	public ContPagPrincipal(Vista.PagPrincipal pPrincipal, Connection conn){
		this.pPrincipal = pPrincipal;
		this.conn = conn;
		this.pPrincipal.Opcion4.addActionListener(this);
		this.pPrincipal.Opcion5.addActionListener(this);
	}

	public void actionPerformed(ActionEvent evento)
	{
		if(evento.getSource()==pPrincipal.Opcion4)
		{
			//Crear controlador Ing paciente
			Vista.PagIngPaciente pIngPac = new Vista.PagIngPaciente();
			pIngPac.setVisible(true);
			//Mandarle pInPac y conn a controlador Ing paciente
		}
		if(evento.getSource()==pPrincipal.Opcion5)
		{
			//Crear controlador ing empleado
			Vista.PagIngEmpleado pIngEmp = new Vista.PagIngEmpleado();
			ContIngEmpleado cIngE = new ContIngEmpleado(pIngEmp, conn);
			pIngEmp.setVisible(true);
			//Mandarle pIngEmp y conn a controlador ing empleado
			
		}
	}
}//manejador
