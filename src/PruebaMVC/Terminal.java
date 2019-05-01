package PruebaMVC;

import java.sql.Date;

import Modelo.*;

public class Terminal {

	public static void main(String[] args) {
		ConectarBD conect = new ConectarBD();

		try{
			Buscar busc = new Buscar(conect.getConnection());
			System.out.println("Se conectó");
			/* AGREGAR A UN EMPLEADO
			Insert insert = new Insert(conect.getConnection());
			Empleado emp1 = new Empleado("Gerardo", "Zepeda", "Gom", "hombre", Date.valueOf("1994-07-12"), "Calle Y", "otro");
			insert.iEmpleado(emp1);
			*/
			
			Empleado emp = new Empleado();
			// BUSCAR EMPLEADO POR NOMBRE, AP, AM
			/* 
			String[] paramsE = new String[3];
			paramsE[0]="Javier";
			paramsE[1]="Sales";
			paramsE[2]="Ortiz";
			emp = busc.bEmpleado(paramsE); */
			
			//BUSCAR EMPLEADO POR ID
			emp = busc.bEmpleado(2);
			System.out.println(emp.toString());
			
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
