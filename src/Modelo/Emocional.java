//Modelo de la tabla emocional
package Modelo;

public class Emocional {
	private int id_emocional;
	private int id_paciente;
	private int F1;
	private int F2;
	private int F3;
	private int F4;
	private int F5;
	private int F6;
	private int F7;
	private int FTotal;
	
	public Emocional(){}

	public Emocional(int f1, int f2, int f3,
			int f4, int f5, int f6, int f7, int fTotal) {
		F1 = f1;
		F2 = f2;
		F3 = f3;
		F4 = f4;
		F5 = f5;
		F6 = f6;
		F7 = f7;
		FTotal = fTotal;
	}

	@Override
	public String toString() {
		return "Emocional [id_emocional=" + id_emocional + ", id_paciente="
				+ id_paciente + ", F1=" + F1 + ", F2=" + F2 + ", F3=" + F3
				+ ", F4=" + F4 + ", F5=" + F5 + ", F6=" + F6 + ", F7=" + F7
				+ ", FTotal=" + FTotal + "]";
	}

	public int getId_emocional() {
		return id_emocional;
	}

	public void setId_emocional(int id_emocional) {
		this.id_emocional = id_emocional;
	}

	public int getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(int id_paciente) {
		this.id_paciente = id_paciente;
	}

	public int getF1() {
		return F1;
	}

	public void setF1(int f1) {
		F1 = f1;
	}

	public int getF2() {
		return F2;
	}

	public void setF2(int f2) {
		F2 = f2;
	}

	public int getF3() {
		return F3;
	}

	public void setF3(int f3) {
		F3 = f3;
	}

	public int getF4() {
		return F4;
	}

	public void setF4(int f4) {
		F4 = f4;
	}

	public int getF5() {
		return F5;
	}

	public void setF5(int f5) {
		F5 = f5;
	}

	public int getF6() {
		return F6;
	}

	public void setF6(int f6) {
		F6 = f6;
	}

	public int getF7() {
		return F7;
	}

	public void setF7(int f7) {
		F7 = f7;
	}

	public int getFTotal() {
		return FTotal;
	}

	public void setFTotal(int fTotal) {
		FTotal = fTotal;
	}
	
	
}
