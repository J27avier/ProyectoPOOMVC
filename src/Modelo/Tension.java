package Modelo;

public class Tension {

	private int id_tension;
	private int id_paciente;
	private int D1;
	private int D2;
	private int D3;
	private int D4;
	private int D5;
	private int D6;
	private int D7;
	private int D8;
	private int D9;
	
	public Tension(){};
	public Tension(int id_tension, int id_paciente, int d1, int d2, int d3,
			int d4, int d5, int d6, int d7, int d8, int d9) {
		super();
		this.id_tension = id_tension;
		this.id_paciente = id_paciente;
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
	public int getD1() {
		return D1;
	}
	public void setD1(int d1) {
		D1 = d1;
	}
	public int getD2() {
		return D2;
	}
	public void setD2(int d2) {
		D2 = d2;
	}
	public int getD3() {
		return D3;
	}
	public void setD3(int d3) {
		D3 = d3;
	}
	public int getD4() {
		return D4;
	}
	public void setD4(int d4) {
		D4 = d4;
	}
	public int getD5() {
		return D5;
	}
	public void setD5(int d5) {
		D5 = d5;
	}
	public int getD6() {
		return D6;
	}
	public void setD6(int d6) {
		D6 = d6;
	}
	public int getD7() {
		return D7;
	}
	public void setD7(int d7) {
		D7 = d7;
	}
	public int getD8() {
		return D8;
	}
	public void setD8(int d8) {
		D8 = d8;
	}
	public int getD9() {
		return D9;
	}
	public void setD9(int d9) {
		D9 = d9;
	}
	
}
