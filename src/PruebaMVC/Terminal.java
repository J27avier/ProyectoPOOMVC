package PruebaMVC;

import java.sql.Date;

import Modelo.ConectarBD;
import Modelo.Empleado;
import Modelo.Insertar;

public class Terminal {

	public static void main(String[] args) {
		ConectarBD conect = new ConectarBD();
		Empleado emp = new Empleado("Gerardo", "Zepeda", "Gom", "hombre", Date.valueOf("1994-07-12"), "Calle Y", "otro");
		try{
			Insertar insert = new Insertar(conect.getConnection());
			System.out.println("Se conectó");
			insert.iEmpleado(emp);
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
