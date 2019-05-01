package Modelo;

public class Comorbilidad {
	private int id_comorbiidad;
	private int id_paciente;
	private int G1;
	private int G2;
	private int G3;
	private int G4;
	private int G5;
	private int G6;
	private int G7;
	private int G8;
	private int G9;
	private int G10;
	private int G11;
	private int G12;
	private int G13;
	private int G14;
	private int G15;
	private int G16;
	private int G17;
	private int G18;
	private int G19;
	private int GTotal;
	private int G20;
	private int G21;
	private int G22;
	private int G23;
	private int G24;
	private int G25;
	private int G26;
	private int G26_1_1;
	private int G26_1_2;
	private int G26_1_3;
	private int G26_1_4;
	private String G26_2;
	private int G26_2_1;
	private String G26_3;
	private int G26_3_1;
	private String G26_4;
	private int G26_4_1;
	private int G26_5;
	private int G26_5_1;
	private int G26_5_2;
	private int G26_5_3;
	private int G26_5_4;
	private String G26_5_5;
	private int G26_5_5_1;
	private String G26_5_6;
	private int G26_5_6_1;
	private String G26_5_7;
	private int G26_5_7_1;
	private int G26_5_8_1;
	private int G26_5_8_2;
	private int G26_5_8_3;
	private int G26_5_8_4;
	private int G27;
	private int G28;
	private int G29;
	private String G30;
	private String G30_1;
	private String G31;
	private int G31_1;
	
	public Comorbilidad(){}

	public Comorbilidad(int g1, int g2,
			int g3, int g4, int g5, int g6, int g7, int g8, int g9, int g10,
			int g11, int g12, int g13, int g14, int g15, int g16, int g17,
			int g18, int g19, int gTotal, int g20, int g21, int g22, int g23,
			int g24, int g25, int g26, int g26_1_1, int g26_1_2, int g26_1_3,
			int g26_1_4, String g26_2, int g26_2_1, String g26_3, int g26_3_1,
			String g26_4, int g26_4_1, int g26_5, int g26_5_1, int g26_5_2,
			int g26_5_3, int g26_5_4, String g26_5_5, int g26_5_5_1,
			String g26_5_6, int g26_5_6_1, String g26_5_7, int g26_5_7_1,
			int g26_5_8_1, int g26_5_8_2, int g26_5_8_3, int g26_5_8_4,
			int g27, int g28, int g29, String g30, String g30_1, String g31,
			int g31_1) {
		G1 = g1;
		G2 = g2;
		G3 = g3;
		G4 = g4;
		G5 = g5;
		G6 = g6;
		G7 = g7;
		G8 = g8;
		G9 = g9;
		G10 = g10;
		G11 = g11;
		G12 = g12;
		G13 = g13;
		G14 = g14;
		G15 = g15;
		G16 = g16;
		G17 = g17;
		G18 = g18;
		G19 = g19;
		GTotal = gTotal;
		G20 = g20;
		G21 = g21;
		G22 = g22;
		G23 = g23;
		G24 = g24;
		G25 = g25;
		G26 = g26;
		G26_1_1 = g26_1_1;
		G26_1_2 = g26_1_2;
		G26_1_3 = g26_1_3;
		G26_1_4 = g26_1_4;
		G26_2 = g26_2;
		G26_2_1 = g26_2_1;
		G26_3 = g26_3;
		G26_3_1 = g26_3_1;
		G26_4 = g26_4;
		G26_4_1 = g26_4_1;
		G26_5 = g26_5;
		G26_5_1 = g26_5_1;
		G26_5_2 = g26_5_2;
		G26_5_3 = g26_5_3;
		G26_5_4 = g26_5_4;
		G26_5_5 = g26_5_5;
		G26_5_5_1 = g26_5_5_1;
		G26_5_6 = g26_5_6;
		G26_5_6_1 = g26_5_6_1;
		G26_5_7 = g26_5_7;
		G26_5_7_1 = g26_5_7_1;
		G26_5_8_1 = g26_5_8_1;
		G26_5_8_2 = g26_5_8_2;
		G26_5_8_3 = g26_5_8_3;
		G26_5_8_4 = g26_5_8_4;
		G27 = g27;
		G28 = g28;
		G29 = g29;
		G30 = g30;
		G30_1 = g30_1;
		G31 = g31;
		G31_1 = g31_1;
	}

	@Override
	public String toString() {
		return "Comorbilidad [id_comorbiidad=" + id_comorbiidad
				+ ", id_paciente=" + id_paciente + ", G1=" + G1 + ", G2=" + G2
				+ ", G3=" + G3 + ", G4=" + G4 + ", G5=" + G5 + ", G6=" + G6
				+ ", G7=" + G7 + ", G8=" + G8 + ", G9=" + G9 + ", G10=" + G10
				+ ", G11=" + G11 + ", G12=" + G12 + ", G13=" + G13 + ", G14="
				+ G14 + ", G15=" + G15 + ", G16=" + G16 + ", G17=" + G17
				+ ", G18=" + G18 + ", G19=" + G19 + ", GTotal=" + GTotal
				+ ", G20=" + G20 + ", G21=" + G21 + ", G22=" + G22 + ", G23="
				+ G23 + ", G24=" + G24 + ", G25=" + G25 + ", G26=" + G26
				+ ", G26_1_1=" + G26_1_1 + ", G26_1_2=" + G26_1_2
				+ ", G26_1_3=" + G26_1_3 + ", G26_1_4=" + G26_1_4 + ", G26_2="
				+ G26_2 + ", G26_2_1=" + G26_2_1 + ", G26_3=" + G26_3
				+ ", G26_3_1=" + G26_3_1 + ", G26_4=" + G26_4 + ", G26_4_1="
				+ G26_4_1 + ", G26_5=" + G26_5 + ", G26_5_1=" + G26_5_1
				+ ", G26_5_2=" + G26_5_2 + ", G26_5_3=" + G26_5_3
				+ ", G26_5_4=" + G26_5_4 + ", G26_5_5=" + G26_5_5
				+ ", G26_5_5_1=" + G26_5_5_1 + ", G26_5_6=" + G26_5_6
				+ ", G26_5_6_1=" + G26_5_6_1 + ", G26_5_7=" + G26_5_7
				+ ", G26_5_7_1=" + G26_5_7_1 + ", G26_5_8_1=" + G26_5_8_1
				+ ", G26_5_8_2=" + G26_5_8_2 + ", G26_5_8_3=" + G26_5_8_3
				+ ", G26_5_8_4=" + G26_5_8_4 + ", G27=" + G27 + ", G28=" + G28
				+ ", G29=" + G29 + ", G30=" + G30 + ", G30_1=" + G30_1
				+ ", G31=" + G31 + ", G31_1=" + G31_1 + "]";
	}

	public int getId_comorbiidad() {
		return id_comorbiidad;
	}

	public void setId_comorbiidad(int id_comorbiidad) {
		this.id_comorbiidad = id_comorbiidad;
	}

	public int getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(int id_paciente) {
		this.id_paciente = id_paciente;
	}

	public int getG1() {
		return G1;
	}

	public void setG1(int g1) {
		G1 = g1;
	}

	public int getG2() {
		return G2;
	}

	public void setG2(int g2) {
		G2 = g2;
	}

	public int getG3() {
		return G3;
	}

	public void setG3(int g3) {
		G3 = g3;
	}

	public int getG4() {
		return G4;
	}

	public void setG4(int g4) {
		G4 = g4;
	}

	public int getG5() {
		return G5;
	}

	public void setG5(int g5) {
		G5 = g5;
	}

	public int getG6() {
		return G6;
	}

	public void setG6(int g6) {
		G6 = g6;
	}

	public int getG7() {
		return G7;
	}

	public void setG7(int g7) {
		G7 = g7;
	}

	public int getG8() {
		return G8;
	}

	public void setG8(int g8) {
		G8 = g8;
	}

	public int getG9() {
		return G9;
	}

	public void setG9(int g9) {
		G9 = g9;
	}

	public int getG10() {
		return G10;
	}

	public void setG10(int g10) {
		G10 = g10;
	}

	public int getG11() {
		return G11;
	}

	public void setG11(int g11) {
		G11 = g11;
	}

	public int getG12() {
		return G12;
	}

	public void setG12(int g12) {
		G12 = g12;
	}

	public int getG13() {
		return G13;
	}

	public void setG13(int g13) {
		G13 = g13;
	}

	public int getG14() {
		return G14;
	}

	public void setG14(int g14) {
		G14 = g14;
	}

	public int getG15() {
		return G15;
	}

	public void setG15(int g15) {
		G15 = g15;
	}

	public int getG16() {
		return G16;
	}

	public void setG16(int g16) {
		G16 = g16;
	}

	public int getG17() {
		return G17;
	}

	public void setG17(int g17) {
		G17 = g17;
	}

	public int getG18() {
		return G18;
	}

	public void setG18(int g18) {
		G18 = g18;
	}

	public int getG19() {
		return G19;
	}

	public void setG19(int g19) {
		G19 = g19;
	}

	public int getGTotal() {
		return GTotal;
	}

	public void setGTotal(int gTotal) {
		GTotal = gTotal;
	}

	public int getG20() {
		return G20;
	}

	public void setG20(int g20) {
		G20 = g20;
	}

	public int getG21() {
		return G21;
	}

	public void setG21(int g21) {
		G21 = g21;
	}

	public int getG22() {
		return G22;
	}

	public void setG22(int g22) {
		G22 = g22;
	}

	public int getG23() {
		return G23;
	}

	public void setG23(int g23) {
		G23 = g23;
	}

	public int getG24() {
		return G24;
	}

	public void setG24(int g24) {
		G24 = g24;
	}

	public int getG25() {
		return G25;
	}

	public void setG25(int g25) {
		G25 = g25;
	}

	public int getG26() {
		return G26;
	}

	public void setG26(int g26) {
		G26 = g26;
	}

	public int getG26_1_1() {
		return G26_1_1;
	}

	public void setG26_1_1(int g26_1_1) {
		G26_1_1 = g26_1_1;
	}

	public int getG26_1_2() {
		return G26_1_2;
	}

	public void setG26_1_2(int g26_1_2) {
		G26_1_2 = g26_1_2;
	}

	public int getG26_1_3() {
		return G26_1_3;
	}

	public void setG26_1_3(int g26_1_3) {
		G26_1_3 = g26_1_3;
	}

	public int getG26_1_4() {
		return G26_1_4;
	}

	public void setG26_1_4(int g26_1_4) {
		G26_1_4 = g26_1_4;
	}

	public String getG26_2() {
		return G26_2;
	}

	public void setG26_2(String g26_2) {
		G26_2 = g26_2;
	}

	public int getG26_2_1() {
		return G26_2_1;
	}

	public void setG26_2_1(int g26_2_1) {
		G26_2_1 = g26_2_1;
	}

	public String getG26_3() {
		return G26_3;
	}

	public void setG26_3(String g26_3) {
		G26_3 = g26_3;
	}

	public int getG26_3_1() {
		return G26_3_1;
	}

	public void setG26_3_1(int g26_3_1) {
		G26_3_1 = g26_3_1;
	}

	public String getG26_4() {
		return G26_4;
	}

	public void setG26_4(String g26_4) {
		G26_4 = g26_4;
	}

	public int getG26_4_1() {
		return G26_4_1;
	}

	public void setG26_4_1(int g26_4_1) {
		G26_4_1 = g26_4_1;
	}

	public int getG26_5() {
		return G26_5;
	}

	public void setG26_5(int g26_5) {
		G26_5 = g26_5;
	}

	public int getG26_5_1() {
		return G26_5_1;
	}

	public void setG26_5_1(int g26_5_1) {
		G26_5_1 = g26_5_1;
	}

	public int getG26_5_2() {
		return G26_5_2;
	}

	public void setG26_5_2(int g26_5_2) {
		G26_5_2 = g26_5_2;
	}

	public int getG26_5_3() {
		return G26_5_3;
	}

	public void setG26_5_3(int g26_5_3) {
		G26_5_3 = g26_5_3;
	}

	public int getG26_5_4() {
		return G26_5_4;
	}

	public void setG26_5_4(int g26_5_4) {
		G26_5_4 = g26_5_4;
	}

	public String getG26_5_5() {
		return G26_5_5;
	}

	public void setG26_5_5(String g26_5_5) {
		G26_5_5 = g26_5_5;
	}

	public int getG26_5_5_1() {
		return G26_5_5_1;
	}

	public void setG26_5_5_1(int g26_5_5_1) {
		G26_5_5_1 = g26_5_5_1;
	}

	public String getG26_5_6() {
		return G26_5_6;
	}

	public void setG26_5_6(String g26_5_6) {
		G26_5_6 = g26_5_6;
	}

	public int getG26_5_6_1() {
		return G26_5_6_1;
	}

	public void setG26_5_6_1(int g26_5_6_1) {
		G26_5_6_1 = g26_5_6_1;
	}

	public String getG26_5_7() {
		return G26_5_7;
	}

	public void setG26_5_7(String g26_5_7) {
		G26_5_7 = g26_5_7;
	}

	public int getG26_5_7_1() {
		return G26_5_7_1;
	}

	public void setG26_5_7_1(int g26_5_7_1) {
		G26_5_7_1 = g26_5_7_1;
	}

	public int getG26_5_8_1() {
		return G26_5_8_1;
	}

	public void setG26_5_8_1(int g26_5_8_1) {
		G26_5_8_1 = g26_5_8_1;
	}

	public int getG26_5_8_2() {
		return G26_5_8_2;
	}

	public void setG26_5_8_2(int g26_5_8_2) {
		G26_5_8_2 = g26_5_8_2;
	}

	public int getG26_5_8_3() {
		return G26_5_8_3;
	}

	public void setG26_5_8_3(int g26_5_8_3) {
		G26_5_8_3 = g26_5_8_3;
	}

	public int getG26_5_8_4() {
		return G26_5_8_4;
	}

	public void setG26_5_8_4(int g26_5_8_4) {
		G26_5_8_4 = g26_5_8_4;
	}

	public int getG27() {
		return G27;
	}

	public void setG27(int g27) {
		G27 = g27;
	}

	public int getG28() {
		return G28;
	}

	public void setG28(int g28) {
		G28 = g28;
	}

	public int getG29() {
		return G29;
	}

	public void setG29(int g29) {
		G29 = g29;
	}

	public String getG30() {
		return G30;
	}

	public void setG30(String g30) {
		G30 = g30;
	}

	public String getG30_1() {
		return G30_1;
	}

	public void setG30_1(String g30_1) {
		G30_1 = g30_1;
	}

	public String getG31() {
		return G31;
	}

	public void setG31(String g31) {
		G31 = g31;
	}

	public int getG31_1() {
		return G31_1;
	}

	public void setG31_1(int g31_1) {
		G31_1 = g31_1;
	}
	
	

}
