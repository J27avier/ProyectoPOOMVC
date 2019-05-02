package Modelo;

import java.sql.Date;

public class Cita {
	private int id_cita;
	private int id_empleado;
	private int id_paciente;
	private Date Fecha;
	
	public Cita(){}

	public Cita(int id_empleado, int id_paciente, Date fecha) {
		this.id_empleado = id_empleado;
		this.id_paciente = id_paciente;
		Fecha = fecha;
	}

	@Override
	public String toString() {
		return "Cita [id_cita=" + id_cita + ", id_empleado=" + id_empleado
				+ ", id_paciente=" + id_paciente + ", Fecha=" + Fecha + "]";
	}
	
	public int getId_cita() {
		return id_cita;
	}

	public void setId_cita(int id_cita) {
		this.id_cita = id_cita;
	}

	public int getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(int id_empleado) {
		this.id_empleado = id_empleado;
	}

	public int getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(int id_paciente) {
		this.id_paciente = id_paciente;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	
}
