 package Modelo;

import java.sql.Date;

public class Empleado {
	private int id_empleado;
	private String Nombre;
	private String APaterno;
	private String AMaterno;
	private String Sexo;
	private Date DOB;
	private String Dir;
	private String Ocupacion;
	
	public Empleado(String nombre, String apaterno, String aMaterno, String sexo, Date dOB, String dir, String ocupacion) {
		Nombre = nombre;
		APaterno = apaterno;
		AMaterno = aMaterno;
		Sexo = sexo;
		DOB = dOB;
		Dir = dir;
		Ocupacion = ocupacion;
	}
	public Empleado() {
	}
	
	public void Imprimir(){
		System.out.println("id_empleado: " + String.valueOf(id_empleado));
		System.out.println("Nombre: " + Nombre);
		System.out.println("Apaterno: " + APaterno);
		System.out.println("AMaterno: " + AMaterno);
		System.out.println("Sexo: " + Sexo);
		System.out.println("DOB: " + String.valueOf(DOB));
		System.out.println("Dir: " + Dir);
		System.out.println("Ocupacion: " + Ocupacion);
	}
	
	public int getId_empleado() {
		return id_empleado;
	}
	public void setId_empleado(int id_empleado) {
		this.id_empleado = id_empleado;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getAPaterno() {
		return APaterno;
	}
	public void setAPaterno(String apaterno) {
		APaterno = apaterno;
	}
	public String getAMaterno() {
		return AMaterno;
	}
	public void setAMaterno(String aMaterno) {
		AMaterno = aMaterno;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getDir() {
		return Dir;
	}
	public void setDir(String dir) {
		Dir = dir;
	}
	public String getOcupacion() {
		return Ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		Ocupacion = ocupacion;
	}
}

