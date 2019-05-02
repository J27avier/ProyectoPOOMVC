package Modelo;

public class Trastornos {
	private int id_trastorno;
	private int id_paciente;
	private int E0_1;
	private int E0_2;
	private int E1;
	private int E2;
	private int ETotal;
	
	public Trastornos(){}
	public Trastornos(int e0_1, int e0_2, int e1, int e2, int eTotal) {
		E0_1 = e0_1;
		E0_2 = e0_2;
		E1 = e1;
		E2 = e2;
		ETotal = eTotal;
	}
	@Override
	public String toString() {
		return "Trastornos [id_trastorno=" + id_trastorno + ", id_paciente="
				+ id_paciente + ", E0_1=" + E0_1 + ", E0_2=" + E0_2 + ", E1="
				+ E1 + ", E2=" + E2 + ", ETotal=" + ETotal + "]";
	}
	public int getId_trastorno() {
		return id_trastorno;
	}
	public void setId_trastorno(int id_trastorno) {
		this.id_trastorno = id_trastorno;
	}
	public int getId_paciente() {
		return id_paciente;
	}
	public void setId_paciente(int id_paciente) {
		this.id_paciente = id_paciente;
	}
	public int getE0_1() {
		return E0_1;
	}
	public void setE0_1(int e0_1) {
		E0_1 = e0_1;
	}
	public int getE0_2() {
		return E0_2;
	}
	public void setE0_2(int e0_2) {
		E0_2 = e0_2;
	}
	public int getE1() {
		return E1;
	}
	public void setE1(int e1) {
		E1 = e1;
	}
	public int getE2() {
		return E2;
	}
	public void setE2(int e2) {
		E2 = e2;
	}
	public int getETotal() {
		return ETotal;
	}
	public void setETotal(int eTotal) {
		ETotal = eTotal;
	}
	

}
