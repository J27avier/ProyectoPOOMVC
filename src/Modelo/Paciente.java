package Modelo;

import java.sql.Date;

public class Paciente {
	private int id_paciente;
	private int id_empleado;
	private String B1_1;
	private String B1_2;
	private String B1_3;
	private String B2;
	private Date B3;
	private int B4;
	private String B5_1;
	private String B5_2;
	private String B5_3;
	private String B5_4;
	private String B5_5;
	private String B5_6;
	private String B6;
	private String B7;
	private int B8_1; 
	private int B8_2;
	private String B9;
	private String B10;
	private int B11;
	private String B12;
	private String B13;
	private int B14;
	private String B14_1;
	private int B15;
	private String B15_1;
	private String C1;
	private String C2;
	private String C3;
	private String C4;
	
	public Paciente(){};
	public Paciente(int id_paciente, int id_empleado, String b1_1, String b1_2,
			String b1_3, String b2, Date b3, int b4, String b5_1, String b5_2,
			String b5_3, String b5_4, String b5_5, String b5_6, String b6,
			String b7, int b8_1, int b8_2, String b9, String b10, int b11,
			String b12, String b13, int b14, String b14_1, int b15,
			String b15_1, String c1, String c2, String c3, String c4) {
		super();
		this.id_paciente = id_paciente;
		this.id_empleado = id_empleado;
		B1_1 = b1_1;
		B1_2 = b1_2;
		B1_3 = b1_3;
		B2 = b2;
		B3 = b3;
		B4 = b4;
		B5_1 = b5_1;
		B5_2 = b5_2;
		B5_3 = b5_3;
		B5_4 = b5_4;
		B5_5 = b5_5;
		B5_6 = b5_6;
		B6 = b6;
		B7 = b7;
		B8_1 = b8_1;
		B8_2 = b8_2;
		B9 = b9;
		B10 = b10;
		B11 = b11;
		B12 = b12;
		B13 = b13;
		B14 = b14;
		B14_1 = b14_1;
		B15 = b15;
		B15_1 = b15_1;
		C1 = c1;
		C2 = c2;
		C3 = c3;
		C4 = c4;
	}
	
	@Override
	public String toString() {
		return "Paciente [id_paciente=" + id_paciente + ", id_empleado="
				+ id_empleado + ", B1_1=" + B1_1 + ", B1_2=" + B1_2 + ", B1_3="
				+ B1_3 + ", B2=" + B2 + ", B3=" + B3 + ", B4=" + B4 + ", B5_1="
				+ B5_1 + ", B5_2=" + B5_2 + ", B5_3=" + B5_3 + ", B5_4=" + B5_4
				+ ", B5_5=" + B5_5 + ", B5_6=" + B5_6 + ", B6=" + B6 + ", B7="
				+ B7 + ", B8_1=" + B8_1 + ", B8_2=" + B8_2 + ", B9=" + B9
				+ ", B10=" + B10 + ", B11=" + B11 + ", B12=" + B12 + ", B13="
				+ B13 + ", B14=" + B14 + ", B14_1=" + B14_1 + ", B15=" + B15
				+ ", B15_1=" + B15_1 + ", C1=" + C1 + ", C2=" + C2 + ", C3="
				+ C3 + ", C4=" + C4 + "]";
	}
	
	public int getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(int id_paciente) {
		this.id_paciente = id_paciente;
	}

	public int getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(int id_empleado) {
		this.id_empleado = id_empleado;
	}

	public String getB1_1() {
		return B1_1;
	}

	public void setB1_1(String b1_1) {
		B1_1 = b1_1;
	}

	public String getB1_2() {
		return B1_2;
	}

	public void setB1_2(String b1_2) {
		B1_2 = b1_2;
	}

	public String getB1_3() {
		return B1_3;
	}

	public void setB1_3(String b1_3) {
		B1_3 = b1_3;
	}

	public String getB2() {
		return B2;
	}

	public void setB2(String b2) {
		B2 = b2;
	}

	public Date getB3() {
		return B3;
	}

	public void setB3(Date b3) {
		B3 = b3;
	}

	public int getB4() {
		return B4;
	}

	public void setB4(int b4) {
		B4 = b4;
	}

	public String getB5_1() {
		return B5_1;
	}

	public void setB5_1(String b5_1) {
		B5_1 = b5_1;
	}

	public String getB5_2() {
		return B5_2;
	}

	public void setB5_2(String b5_2) {
		B5_2 = b5_2;
	}

	public String getB5_3() {
		return B5_3;
	}

	public void setB5_3(String b5_3) {
		B5_3 = b5_3;
	}

	public String getB5_4() {
		return B5_4;
	}

	public void setB5_4(String b5_4) {
		B5_4 = b5_4;
	}

	public String getB5_5() {
		return B5_5;
	}

	public void setB5_5(String b5_5) {
		B5_5 = b5_5;
	}

	public String getB5_6() {
		return B5_6;
	}

	public void setB5_6(String b5_6) {
		B5_6 = b5_6;
	}

	public String getB6() {
		return B6;
	}

	public void setB6(String b6) {
		B6 = b6;
	}

	public String getB7() {
		return B7;
	}

	public void setB7(String b7) {
		B7 = b7;
	}

	public int getB8_1() {
		return B8_1;
	}

	public void setB8_1(int b8_1) {
		B8_1 = b8_1;
	}

	public int getB8_2() {
		return B8_2;
	}

	public void setB8_2(int b8_2) {
		B8_2 = b8_2;
	}

	public String getB9() {
		return B9;
	}

	public void setB9(String b9) {
		B9 = b9;
	}

	public String getB10() {
		return B10;
	}

	public void setB10(String b10) {
		B10 = b10;
	}

	public int getB11() {
		return B11;
	}

	public void setB11(int b11) {
		B11 = b11;
	}

	public String getB12() {
		return B12;
	}

	public void setB12(String b12) {
		B12 = b12;
	}

	public String getB13() {
		return B13;
	}

	public void setB13(String b13) {
		B13 = b13;
	}

	public int getB14() {
		return B14;
	}

	public void setB14(int b14) {
		B14 = b14;
	}

	public String getB14_1() {
		return B14_1;
	}

	public void setB14_1(String b14_1) {
		B14_1 = b14_1;
	}

	public int getB15() {
		return B15;
	}

	public void setB15(int b15) {
		B15 = b15;
	}

	public String getB15_1() {
		return B15_1;
	}

	public void setB15_1(String b15_1) {
		B15_1 = b15_1;
	}

	public String getC1() {
		return C1;
	}

	public void setC1(String c1) {
		C1 = c1;
	}

	public String getC2() {
		return C2;
	}

	public void setC2(String c2) {
		C2 = c2;
	}

	public String getC3() {
		return C3;
	}

	public void setC3(String c3) {
		C3 = c3;
	}

	public String getC4() {
		return C4;
	}

	public void setC4(String c4) {
		C4 = c4;
	}
}
