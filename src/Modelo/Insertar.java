//Inserta objetos a la BD
//Regresa 1 si exitoso y 0 si fallido
package Modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Insertar {
	private Connection conn;
	
	public Insertar(Connection conn){
		this.conn = conn;
	}
	
	public int iEmpleado(Empleado emp){
		try{
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO Empleado (Nombre, APaterno, AMaterno,"
					+ " Sexo, DOB, Dir, Ocupacion) VALUES (?, ?, ?, ?, ?, ?, ?)");
			stmt.setString(1, emp.getNombre());
			stmt.setString(2,  emp.getAPaterno());
			stmt.setString(3, emp.getAMaterno());
			stmt.setString(4, emp.getSexo());
			stmt.setString(5, String.valueOf(emp.getDOB()));
			stmt.setString(6, emp.getDir());
			stmt.setString(7, emp.getOcupacion());
			stmt.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("Error al insertar empleado");
			return 0;
		}
		return 1;
	}
	
	public int iPaciente(Empleado emp, Paciente pac, Tension ten, Trastornos tra, Emocional emo,  Comorbilidad com){
		Buscar busc = new Buscar(conn);
		String[] paramsP = {pac.getB1_3(), pac.getB1_1(), pac.getB1_2()};
		
		//Insertar paciente
		try{
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO PACIENTE (id_empleado, B1_1, B1_2, B1_3, B2,"
					+ "B3, B4, B5_1, B5_2, B5_3, B5_4, B5_5, B5_6, B6, B7, B8_1, B8_2, B9, B10, B11, B12, B13, B14,"
					+ "B14_1, B15, B15_1, C1, C2, C3, C4) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
					+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			// 30 Strings
			stmt.setString( 1, String.valueOf(emp.getId_empleado()));
			stmt.setString( 2, pac.getB1_1());
			stmt.setString( 3, pac.getB1_2());
			stmt.setString( 4, pac.getB1_3());
			stmt.setString( 5, pac.getB2());
			stmt.setString( 6, String.valueOf(pac.getB3()));
			stmt.setString( 7, String.valueOf(pac.getB4()));
			stmt.setString( 8, pac.getB5_1());
			stmt.setString( 9, pac.getB5_2());
			stmt.setString(10, pac.getB5_3());
			stmt.setString(11, pac.getB5_4());
			stmt.setString(12, pac.getB5_5());
			stmt.setString(13, pac.getB5_6());
			stmt.setString(14, pac.getB6());
			stmt.setString(15, pac.getB7());
			stmt.setString(16, String.valueOf(pac.getB8_1()));
			stmt.setString(17, String.valueOf(pac.getB8_2()));
			stmt.setString(18, pac.getB9());
			stmt.setString(19, pac.getB10());
			stmt.setString(20, String.valueOf(pac.getB11()));
			stmt.setString(21, pac.getB12());
			stmt.setString(22, pac.getB13());
			stmt.setString(23, String.valueOf(pac.getB14()));
			stmt.setString(24, pac.getB14_1());
			stmt.setString(25, String.valueOf(pac.getB15()));
			stmt.setString(26, pac.getB15_1());
			stmt.setString(27, pac.getC1());
			stmt.setString(28, pac.getC2()); 
			stmt.setString(29, pac.getC3());
			stmt.setString(30, pac.getC4());
			stmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("Error al insertar paciente");
			return 0;
		}
		//Obtenemos el id_paciente que se le asignó
		pac = busc.bPaciente(paramsP);
		
		//Insertar tension
		
		try {
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO TENSION (id_paciente, D1, D2, D3, "
					+ "D4, D5, D6, D7, D8, D9) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			stmt.setString( 1, String.valueOf(pac.getId_paciente()));
			stmt.setString( 2, String.valueOf(ten.getD1()));
			stmt.setString( 3, String.valueOf(ten.getD2()));
			stmt.setString( 4, String.valueOf(ten.getD3()));
			stmt.setString( 5, String.valueOf(ten.getD4()));
			stmt.setString( 6, String.valueOf(ten.getD5()));
			stmt.setString( 7, String.valueOf(ten.getD6()));
			stmt.setString( 8, String.valueOf(ten.getD7()));
			stmt.setString( 9, String.valueOf(ten.getD8()));
			stmt.setString(10, String.valueOf(ten.getD9()));
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error al insertar tension");
			return 0;
		}
		
		//Insertar trastornos
		try{
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO TRASTORNOS (id_paciente, E0_1, E0_2, E1, E2, ETotal)"
					+ "VALUES (?, ?, ?, ?, ?, ?)");
			stmt.setString( 1, String.valueOf(pac.getId_paciente()));
			stmt.setString( 2, String.valueOf(tra.getE0_1()));
			stmt.setString( 3, String.valueOf(tra.getE0_2()));
			stmt.setString( 4, String.valueOf(tra.getE1()));
			stmt.setString( 5, String.valueOf(tra.getE2()));
			stmt.setString( 6, String.valueOf(tra.getETotal()));
			stmt.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("Error al insertar trastornos");
			return 0;
		}
		
		//Insertar emocional
		try{
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO EMOCIONAL (id_paciente, F1, F2, F3, F4, F5, F6, F7, FTotal) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
			stmt.setString( 1, String.valueOf(pac.getId_paciente()));
			stmt.setString( 2, String.valueOf(emo.getF1()));
			stmt.setString( 3, String.valueOf(emo.getF2()));
			stmt.setString( 4, String.valueOf(emo.getF3()));
			stmt.setString( 5, String.valueOf(emo.getF4()));
			stmt.setString( 6, String.valueOf(emo.getF5()));
			stmt.setString( 7, String.valueOf(emo.getF6()));
			stmt.setString( 8, String.valueOf(emo.getF7()));
			stmt.setString( 9, String.valueOf(emo.getFTotal()));
			stmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("Error al insertar emocional");
			return 0;
		}
		try{
			// 60 columnas
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO COMORBILIDAD (id_paciente, G1, G2, G3, G4, G5, "
					+ "G6, G7, G8, G9, G10, G11, G12, G13, G14, G15, G16, G17, G18, G19, GTotal, G20, G21, G22, G23, G24, "
					+ "G25, G26, G26_1_1, G26_1_2, G26_1_3, G26_1_4, G26_2, G26_2_1, G26_3, G26_3_1, G26_4, G26_4_1, G26_5, "
					+ "G26_5_1, G26_5_2, G26_5_3, G26_5_4, G26_5_5, G26_5_5_1, G26_5_6, G26_5_6_1, G26_5_7, G26_5_7_1, "
					+ "G26_5_8_1, G26_5_8_2, G26_5_8_3, G26_5_8_4, G27, G28, G29, G30, G30_1, G31, G31_1) VALUES (?, ?, ?,"
					+ " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
					+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			stmt.setString( 1, String.valueOf(pac.getId_paciente()));
			stmt.setString( 2, String.valueOf(com.getG1()));
			stmt.setString( 3, String.valueOf(com.getG2()));
			stmt.setString( 4, String.valueOf(com.getG3()));
			stmt.setString( 5, String.valueOf(com.getG4()));
			stmt.setString( 6, String.valueOf(com.getG5()));
			stmt.setString( 7, String.valueOf(com.getG6()));
			stmt.setString( 8, String.valueOf(com.getG7()));
			stmt.setString( 9, String.valueOf(com.getG8()));
			stmt.setString(10, String.valueOf(com.getG9()));
			stmt.setString(11, String.valueOf(com.getG10()));
			stmt.setString(12, String.valueOf(com.getG11()));
			stmt.setString(13, String.valueOf(com.getG12()));
			stmt.setString(14, String.valueOf(com.getG13()));
			stmt.setString(15, String.valueOf(com.getG14()));
			stmt.setString(16, String.valueOf(com.getG15()));
			stmt.setString(17, String.valueOf(com.getG16()));
			stmt.setString(18, String.valueOf(com.getG17()));
			stmt.setString(19, String.valueOf(com.getG18()));
			stmt.setString(20, String.valueOf(com.getG19()));
			stmt.setString(21, String.valueOf(com.getGTotal()));
			stmt.setString(22, String.valueOf(com.getG20()));
			stmt.setString(23, String.valueOf(com.getG21()));
			stmt.setString(24, String.valueOf(com.getG22()));
			stmt.setString(25, String.valueOf(com.getG23()));
			stmt.setString(26, String.valueOf(com.getG24()));
			stmt.setString(27, String.valueOf(com.getG25()));
			stmt.setString(28, String.valueOf(com.getG26()));
			stmt.setString(29, String.valueOf(com.getG26_1_1()));
			stmt.setString(30, String.valueOf(com.getG26_1_2()));
			stmt.setString(31, String.valueOf(com.getG26_1_3()));
			stmt.setString(32, String.valueOf(com.getG26_1_4()));
			stmt.setString(33, com.getG26_2());
			stmt.setString(34, String.valueOf(com.getG26_2_1()));
			stmt.setString(35, com.getG26_3());
			stmt.setString(36, String.valueOf(com.getG26_3_1()));
			stmt.setString(37, com.getG26_4());
			stmt.setString(38, String.valueOf(com.getG26_4_1()));
			stmt.setString(39, String.valueOf(com.getG26_5()));
			stmt.setString(40, String.valueOf(com.getG26_5_1()));
			stmt.setString(41, String.valueOf(com.getG26_5_2()));
			stmt.setString(42, String.valueOf(com.getG26_5_3()));
			stmt.setString(43, String.valueOf(com.getG26_5_4()));
			stmt.setString(44, com.getG26_5_5());
			stmt.setString(45, String.valueOf(com.getG26_5_5_1()));
			stmt.setString(46, com.getG26_5_6());
			stmt.setString(47, String.valueOf(com.getG26_5_6_1()));
			stmt.setString(48, com.getG26_5_7());
			stmt.setString(49, String.valueOf(com.getG26_5_7_1()));
			stmt.setString(50, String.valueOf(com.getG26_5_8_1()));
			stmt.setString(51, String.valueOf(com.getG26_5_8_2()));
			stmt.setString(52, String.valueOf(com.getG26_5_8_3()));
			stmt.setString(53, String.valueOf(com.getG26_5_8_4()));
			stmt.setString(54, String.valueOf(com.getG27()));
			stmt.setString(55, String.valueOf(com.getG28()));
			stmt.setString(56, String.valueOf(com.getG29()));
			stmt.setString(57, com.getG30());
			stmt.setString(58, com.getG30_1());
			stmt.setString(59, com.getG31());
			stmt.setString(60, String.valueOf(com.getG31_1()));
			stmt.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("Error al insertar comorbilidad");
			return 0;
		}
		return 1;
	}
	
	public int iCita(Cita cit){
		try {
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO Cita (id_empleado, id_paciente, Fecha) VALUES (?, ?, ?)");
			stmt.setString(1, String.valueOf(cit.getId_empleado()));
			stmt.setString(2, String.valueOf(cit.getId_paciente()));
			stmt.setString(3, String.valueOf(cit.getFecha()));
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error al insertar cita");
			return 0;
		}
		return 1;
	}
	public int iCita(Empleado emp, Paciente pac, Cita cit){
		cit.setId_empleado(emp.getId_empleado());
		cit.setId_paciente(pac.getId_paciente());
		try {
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO Cita (id_empleado, id_paciente, Fecha) VALUES (?, ?, ?)");
			stmt.setString(1, String.valueOf(cit.getId_empleado()));
			stmt.setString(2, String.valueOf(cit.getId_paciente()));
			stmt.setString(3, String.valueOf(cit.getFecha()));
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error al insertar cita");
			return 0;
		}
		return 1;
	}
}
