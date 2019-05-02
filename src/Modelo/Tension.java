package Modelo;

public class Tension {

	private int id_tension;
	private int id_paciente;
	private double D1;
	private double D2;
	private double D3;
	private double D4;
	private double D5;
	private double D6;
	private double D7;
	private double D8;
	private double D9;
	
	public Tension(){}

	
	public Tension(double d1, double d2, double d3, double d4, double d5,
			double d6, double d7, double d8, double d9) {
		D1 = d1;
		D2 = d2;
		D3 = d3;
		D4 = d4;
		D5 = d5;
		D6 = d6;
		D7 = d7;
		D8 = d8;
		D9 = d9;
	}


	@Override
	public String toString() {
		return "Tension [id_tension=" + id_tension + ", id_paciente="
				+ id_paciente + ", D1=" + D1 + ", D2=" + D2 + ", D3=" + D3
				+ ", D4=" + D4 + ", D5=" + D5 + ", D6=" + D6 + ", D7=" + D7
				+ ", D8=" + D8 + ", D9=" + D9 + "]";
	}


	public int getId_tension() {
		return id_tension;
	}


	public void setId_tension(int id_tension) {
		this.id_tension = id_tension;
	}


	public int getId_paciente() {
		return id_paciente;
	}


	public void setId_paciente(int id_paciente) {
		this.id_paciente = id_paciente;
	}


	public double getD1() {
		return D1;
	}


	public void setD1(double d1) {
		D1 = d1;
	}


	public double getD2() {
		return D2;
	}


	public void setD2(double d2) {
		D2 = d2;
	}


	public double getD3() {
		return D3;
	}


	public void setD3(double d3) {
		D3 = d3;
	}


	public double getD4() {
		return D4;
	}


	public void setD4(double d4) {
		D4 = d4;
	}


	public double getD5() {
		return D5;
	}


	public void setD5(double d5) {
		D5 = d5;
	}


	public double getD6() {
		return D6;
	}


	public void setD6(double d6) {
		D6 = d6;
	}


	public double getD7() {
		return D7;
	}


	public void setD7(double d7) {
		D7 = d7;
	}


	public double getD8() {
		return D8;
	}


	public void setD8(double d8) {
		D8 = d8;
	}


	public double getD9() {
		return D9;
	}


	public void setD9(double d9) {
		D9 = d9;
	}
}