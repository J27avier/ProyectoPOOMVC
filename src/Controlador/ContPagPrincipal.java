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
		this.pPrincipal.Opcion5.addActionListener(this);
	}

	public void actionPerformed(ActionEvent evento)
	{
		if(evento.getSource()==pPrincipal.Opcion5)
		{
			//Crear controlador ing empleado
			Vista.PagIngEmpleado pIngEmp = new Vista.PagIngEmpleado();
			pIngEmp.setVisible(true);
			//Mandarle pIngEmp y conn a controlador ing empleado
		}
	}
}//manejador
