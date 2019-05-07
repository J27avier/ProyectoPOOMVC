//Ejemplos en codigo de todas las funciones de modelo
//Puede usarse para poblar a la base de datos
package PruebaMVC;

import java.sql.Date;
import java.util.ArrayList;

import Modelo.*;

public class Terminal {

	public static void main(String[] args) {
		ConectarBD conect = new ConectarBD();
		//Buscar y agregar EMPLEADOS
		/*
		try{
			Buscar busc = new Buscar(conect.getConnection());
			
			AGREGAR A UN EMPLEADO
			Insert insert = new Insert(conect.getConnection());
			Empleado emp1 = new Empleado("Agustin", "Pliego", "Abraham", "hombre", Date.valueOf("1962-07-12"), "Calle Y", "otro");
			int success = insert.iEmpleado(emp1);
			if(success == 1)
				System.out.println("El empleado se agreg�");
			else
				System.out.println("No se agreg�");
			
			
			Empleado emp2 = new Empleado();
			// BUSCAR EMPLEADO POR NOMBRE, AP, AM
			
			String[] paramsE = new String[3];
			paramsE[0]="Javier";
			paramsE[1]="Sales";
			paramsE[2]="Ortiz";
			emp2 = busc.bEmpleado(paramsE);
			
			//BUSCAR EMPLEADO POR ID
			emp2 = busc.bEmpleado(2);
			if(emp2.getId_empleado() != -1)
				System.out.println(emp2.toString());
			else
				System.out.println("No se encontr�");
			
		}catch(Exception e){
			System.out.println(e);
		} /**/
			
		//Agregar PACIENTES
		
		try{
			//Suponemos que ya sabemos el id del empleado que lo agreg�
			Insertar insert3 = new Insertar(conect.getConnection()); 
			Empleado emp3 = new Empleado();
			emp3.setId_empleado(1);
			Paciente pac3 = new Paciente("Magana", "Hernandez", "Andres", "hombre",
					Date.valueOf("1995-09-12"), 23, "Av. Patos", "12", "1", "coyoacan", "Coyoacan", 
					"01040", "555123444", "2223333", 15, 3, "CDMX", "Soltero", 22, "si", "si", 0,
					"Nini", 0, "Nada", "Mike Ledesma", "Amigo", "22211111", "-");
			Tension ten3 = new Tension(99.9, 99, 998, 98, 5, 0.33, 45.3, 1.45, 7.6);
			Trastornos tra3 = new Trastornos(2, 2, 0, 1, 5);
			Emocional emo3 = new Emocional(0, 1, 2, 3, 0, 1, 2, 8);

			Comorbilidad com3 = new Comorbilidad(0, -1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 9,
					0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, "Herpes", 1, "Dolor", 1, "Terapia", 1, 1, 5, 5, 5, 0, "Valium",
					1, "3 mg", 1, "Terapia2", 1, 4, 4, 4, 0, 1, 1, 1, "Al", "-", "-", 0);
			
			int success = insert3.iPaciente(emp3, pac3, ten3, tra3, emo3, com3);
			if(success == 1)
				System.out.println("El paciente se agreg�");
			else
				System.out.println("El paciente no se agreg�");
			
		}catch(Exception e){
			System.out.println(e);
		}/**/
		
		//Buscar PACIENTES
		/*
		try{
			//M�todo 1 por Params
			Buscar bus4 = new Buscar(conect.getConnection());
			String[] paramsP= new String[3];
			paramsP[0]="Esteban de Jesus";
			paramsP[1]="Carrillo";
			paramsP[2]="Castro";
			Paciente pac4 = new Paciente();
			pac4 = bus4.bPaciente(paramsP);
			System.out.println(pac4.toString());
			//M�todo 2 por id
			pac4 = bus4.bPaciente(3);
			if(pac4.getId_paciente() != -1)
				System.out.println(pac4.toString());
			else 
				System.out.println("No se encontr� el paciente");
			
		}catch(Exception e){
			e.printStackTrace();
		}/**/
		//Buscar tablas relacionadas a paciente
		/*
		try{
			Buscar bus5 = new Buscar(conect.getConnection());
			Tension ten5 = new Tension();
			Trastornos tra5 = new Trastornos();
			Emocional emo5 = new Emocional();
			Comorbilidad com5 = new Comorbilidad();
			
			ten5 = bus5.bTension(10);
			if(ten5.getId_tension()!= -1)
				System.out.println(ten5.toString());
			else
				System.out.println("No se encontr� tensi�n");
			
			tra5 = bus5.bTrastornos(10);
			if(tra5.getId_trastorno() != -1)
				System.out.println(tra5.toString());
			else
				System.out.println("No se encontr� trastornos");
			
			emo5 = bus5.bEmocional(10);
			if(emo5.getId_emocional()!= -1)
				System.out.println(emo5.toString());
			else
				System.out.println("No se encontr� emocional");
			
			com5 = bus5.bComorbilidad(10);
			if(com5.getId_comorbilidad()!= -1)
				System.out.println(com5.toString());
			else
				System.out.println("No se encontr� emocional");
		}catch(Exception e){
			e.printStackTrace();
		} /**/
		// Insertar cita
		/*
		try{
			Insertar ins7 = new Insertar(conect.getConnection());
			Cita cit7 = new Cita(1, 8, Date.valueOf("2019-03-20"));
			int success = ins7.iCita(cit7);
			if(success == 1)
				System.out.println("La cita se agreg�");
			else
				System.out.println("La cita no se agreg�");
		}catch(Exception e){
			e.printStackTrace();
		}/*/
		// Buscar Arreglo de citas
		/*
		try{
			Buscar bus8 = new Buscar(conect.getConnection());
			String[] paramsE = {"Javier", "Sales", "Ortiz"};
			ArrayList<Cita> citaArr = new ArrayList<Cita>();
			citaArr = bus8.bCita(paramsE);
			for(Cita citaTemp : citaArr){
				System.out.println(citaTemp.toString());
			}
		}catch(Exception e){
			e.printStackTrace();
		}*/
	}

}
