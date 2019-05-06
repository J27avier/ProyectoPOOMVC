/* Busca a un renglon en especifico de la tabla de 
 * datos y lo regresa como un objeto con cada uno de
 * sus atributos. Para las citas regresa un 
 * array list de citas.
 * Contiene los queries y se conecta a la base de datos
 * Si una objeto no se encuetra, se regresa con id = -1
*/
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Buscar{
	private Connection conn;
	
	public Buscar(Connection conn){
		this.conn = conn;
	}
	
	//Busca un empleado a partir de su nombre, apaterno y amaterno
	public Empleado bEmpleado(String[] paramsE){
		Empleado emp = new Empleado();
		emp.setId_empleado(-1);
		try {
			PreparedStatement stmt = conn.prepareStatement("SELECT * from empleado WHERE Nombre = ? AND "
					+ "APaterno=? AND AMaterno =?");
			stmt.setString(1, paramsE[0]);
			stmt.setString(2, paramsE[1]);
			stmt.setString(3, paramsE[2]);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()){
				emp.setId_empleado(rs.getInt("id_empleado"));
				emp.setNombre(rs.getString("Nombre"));
				emp.setAPaterno(rs.getString("APaterno"));
				emp.setAMaterno(rs.getString("AMaterno"));
				emp.setSexo(rs.getString("Sexo"));
				emp.setDOB(rs.getDate("DOB"));
				emp.setDir(rs.getString("Dir"));
				emp.setOcupacion(rs.getString("Ocupacion"));
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emp;
	}
	
	//Busca un empleado a partir de su id_empleado
	public Empleado bEmpleado(int id_e){
		Empleado emp = new Empleado();
		emp.setId_empleado(-1);
		try {
			PreparedStatement stmt = conn.prepareStatement("SELECT * from empleado WHERE id_empleado = ? ");
			stmt.setString(1, String.valueOf(id_e));
			ResultSet rs = stmt.executeQuery();
			if(rs.next()){
				emp.setId_empleado(rs.getInt("id_empleado"));
				emp.setNombre(rs.getString("Nombre"));
				emp.setAPaterno(rs.getString("APaterno"));
				emp.setAMaterno(rs.getString("AMaterno"));
				emp.setSexo(rs.getString("Sexo"));
				emp.setDOB(rs.getDate("DOB"));
				emp.setDir(rs.getString("Dir"));
				emp.setOcupacion(rs.getString("Ocupacion"));
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emp;
	}
	
	//Busca un paciente a partir de su nombre, apaterno y amaterno
	public Paciente bPaciente(String[] paramsP){
		Paciente pac = new Paciente();
		pac.setId_paciente(-1);
		try {
			PreparedStatement stmt = conn.prepareStatement("SELECT * from Paciente WHERE B1_3 = ? AND B1_1 = ? AND B1_2 = ?");
			stmt.setString(1, paramsP[0]);
			stmt.setString(2, paramsP[1]);
			stmt.setString(3, paramsP[2]);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()){
				pac.setId_paciente(rs.getInt("id_paciente"));
				pac.setId_empleado(rs.getInt("id_empleado"));
				pac.setB1_1(rs.getString("B1_1"));
				pac.setB1_2(rs.getString("B1_2"));
				pac.setB1_3(rs.getString("B1_3"));
				pac.setB2(rs.getString("B2"));
				pac.setB3(rs.getDate("B3"));
				pac.setB4(rs.getInt("B4"));
				pac.setB5_1(rs.getString("B5_1"));
				pac.setB5_2(rs.getString("B5_2"));
				pac.setB5_3(rs.getString("B5_3"));
				pac.setB5_4(rs.getString("B5_4"));
				pac.setB5_5(rs.getString("B5_5"));
				pac.setB5_6(rs.getString("B5_6"));
				pac.setB6(rs.getString("B6"));
				pac.setB7(rs.getString("B7"));
				pac.setB8_1(rs.getInt("B8_1"));
				pac.setB8_2(rs.getInt("B8_2"));
				pac.setB9(rs.getString("B9"));
				pac.setB10(rs.getString("B10"));
				pac.setB11(rs.getInt("B11"));
				pac.setB12(rs.getString("B12"));
				pac.setB13(rs.getString("B13"));
				pac.setB14(rs.getInt("B14"));
				pac.setB14_1(rs.getString("B14_1"));
				pac.setB15(rs.getInt("B15"));
				pac.setB15_1(rs.getString("B15_1"));
				pac.setC1(rs.getString("C1"));
				pac.setC2(rs.getString("C2"));
				pac.setC3(rs.getString("C3"));
				pac.setC4(rs.getString("C4"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return pac;
	}
	
	//Busca un paciente a partir de su id_paciente
	public Paciente bPaciente(int id_p){
		Paciente pac = new Paciente();
		pac.setId_paciente(-1);
		try {
			PreparedStatement stmt = conn.prepareStatement("SELECT * from Paciente WHERE id_paciente = ?");
			stmt.setString(1, String.valueOf(id_p));
			ResultSet rs = stmt.executeQuery();
			if(rs.next()){
				pac.setId_paciente(rs.getInt("id_paciente"));
				pac.setId_empleado(rs.getInt("id_empleado"));
				pac.setB1_1(rs.getString("B1_1"));
				pac.setB1_2(rs.getString("B1_2"));
				pac.setB1_3(rs.getString("B1_3"));
				pac.setB2(rs.getString("B2"));
				pac.setB3(rs.getDate("B3"));
				pac.setB4(rs.getInt("B4"));
				pac.setB5_1(rs.getString("B5_1"));
				pac.setB5_2(rs.getString("B5_2"));
				pac.setB5_3(rs.getString("B5_3"));
				pac.setB5_4(rs.getString("B5_4"));
				pac.setB5_5(rs.getString("B5_5"));
				pac.setB5_6(rs.getString("B5_6"));
				pac.setB6(rs.getString("B6"));
				pac.setB7(rs.getString("B7"));
				pac.setB8_1(rs.getInt("B8_1"));
				pac.setB8_2(rs.getInt("B8_2"));
				pac.setB9(rs.getString("B9"));
				pac.setB10(rs.getString("B10"));
				pac.setB11(rs.getInt("B11"));
				pac.setB12(rs.getString("B12"));
				pac.setB13(rs.getString("B13"));
				pac.setB14(rs.getInt("B14"));
				pac.setB14_1(rs.getString("B14_1"));
				pac.setB15(rs.getInt("B15"));
				pac.setB15_1(rs.getString("B15_1"));
				pac.setC1(rs.getString("C1"));
				pac.setC2(rs.getString("C2"));
				pac.setC3(rs.getString("C3"));
				pac.setC4(rs.getString("C4"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return pac;
	}
	
	//Busca una tension a partir de su id_paciente
	public Tension bTension(int id_p){
		Tension ten = new Tension();
		ten.setId_tension(-1);
		
		try {
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Tension WHERE id_paciente = ?");
			stmt.setString(1, String.valueOf(id_p));
			ResultSet rs = stmt.executeQuery();
			if(rs.next()){
				ten.setId_tension(rs.getInt("id_tension"));
				ten.setId_paciente(rs.getInt("id_paciente"));
				ten.setD1(rs.getDouble("D1"));
				ten.setD2(rs.getDouble("D2"));
				ten.setD3(rs.getDouble("D3"));
				ten.setD4(rs.getDouble("D4"));
				ten.setD5(rs.getDouble("D5"));
				ten.setD6(rs.getDouble("D6"));
				ten.setD7(rs.getDouble("D7"));
				ten.setD8(rs.getDouble("D8"));
				ten.setD9(rs.getDouble("D9"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ten;
	}
	
	//Busca trastornos a partir de un id_paciente
	public Trastornos bTrastornos(int id_p){
		Trastornos tra = new Trastornos();
		tra.setId_trastorno(-1);
		try {
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Trastornos WHERE id_paciente = ?");
			stmt.setString(1, String.valueOf(id_p));
			ResultSet rs = stmt.executeQuery();
			if(rs.next()){
				tra.setId_trastorno(rs.getInt("id_trastorno"));
				tra.setId_paciente(rs.getInt("id_paciente"));
				tra.setE0_1(rs.getInt("E0_1"));
				tra.setE0_2(rs.getInt("E0_2"));
				tra.setE1(rs.getInt("E1"));
				tra.setE2(rs.getInt("E2"));
				tra.setETotal(rs.getInt("ETotal"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return tra;
	}
	
	//Busca emocional a partir de id_paciente
	public Emocional bEmocional(int id_p){
		Emocional emo = new Emocional();
		emo.setId_emocional(-1);
		PreparedStatement stmt;
		try {
			stmt = conn.prepareStatement("SELECT * FROM Emocional WHERE id_paciente = ?");
			stmt.setString(1, String.valueOf(id_p));
			ResultSet rs = stmt.executeQuery();
			if(rs.next()){
				emo.setId_emocional(rs.getInt("id_emocional"));
				emo.setId_paciente(rs.getInt("id_paciente"));
				emo.setF1(rs.getInt("F1"));
				emo.setF2(rs.getInt("F2"));
				emo.setF3(rs.getInt("F3"));
				emo.setF4(rs.getInt("F4"));
				emo.setF5(rs.getInt("F5"));
				emo.setF6(rs.getInt("F6"));
				emo.setF7(rs.getInt("F7"));
				emo.setFTotal(rs.getInt("FTotal"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emo;
	}
	
	//Busca comorbilidad a partir de id_paciente
	public Comorbilidad bComorbilidad(int id_p){

		Comorbilidad com = new Comorbilidad();
		com.setId_comorbilidad(-1);
		try {
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Comorbilidad WHERE id_paciente = ?");
			stmt.setString(1, String.valueOf(id_p));
			ResultSet rs = stmt.executeQuery();
			if(rs.next()){
				com.setId_comorbilidad(rs.getInt("id_comorbilidad"));
				com.setId_paciente(rs.getInt("id_paciente"));
				com.setG1(rs.getInt("G1"));
				com.setG2(rs.getInt("G2"));
				com.setG3(rs.getInt("G3"));
				com.setG4(rs.getInt("G4"));
				com.setG5(rs.getInt("G5"));
				com.setG6(rs.getInt("G6"));
				com.setG7(rs.getInt("G7"));
				com.setG8(rs.getInt("G8"));
				com.setG9(rs.getInt("G9"));
				com.setG10(rs.getInt("G10"));
				com.setG11(rs.getInt("G11"));
				com.setG12(rs.getInt("G12"));
				com.setG13(rs.getInt("G13"));
				com.setG14(rs.getInt("G14"));
				com.setG15(rs.getInt("G15"));
				com.setG16(rs.getInt("G16"));
				com.setG17(rs.getInt("G17"));
				com.setG18(rs.getInt("G18"));
				com.setG19(rs.getInt("G19"));
				com.setGTotal(rs.getInt("GTotal"));
				com.setG20(rs.getInt("G20"));
				com.setG21(rs.getInt("G21"));
				com.setG22(rs.getInt("G22"));
				com.setG23(rs.getInt("G23"));
				com.setG24(rs.getInt("G24"));
				com.setG25(rs.getInt("G25"));
				com.setG26(rs.getInt("G26"));
				com.setG26_1_1(rs.getInt("G26_1_1"));
				com.setG26_1_2(rs.getInt("G26_1_2"));
				com.setG26_1_3(rs.getInt("G26_1_3"));
				com.setG26_1_4(rs.getInt("G26_1_4"));
				com.setG26_2(rs.getString("G26_2"));
				com.setG26_2_1(rs.getInt("G26_2_1"));
				com.setG26_3(rs.getString("G26_3"));
				com.setG26_3_1(rs.getInt("G26_3_1"));
				com.setG26_4(rs.getString("G26_4"));
				com.setG26_4_1(rs.getInt("G26_4_1"));
				com.setG26_5(rs.getInt("G26_5"));
				com.setG26_5_1(rs.getInt("G26_5_1"));
				com.setG26_5_2(rs.getInt("G26_5_2"));
				com.setG26_5_3(rs.getInt("G26_5_3"));
				com.setG26_5_4(rs.getInt("G26_5_4"));
				com.setG26_5_5(rs.getString("G26_5_5"));
				com.setG26_5_5_1(rs.getInt("G26_5_5_1"));
				com.setG26_5_6(rs.getString("G26_5_6"));
				com.setG26_5_6_1(rs.getInt("G26_5_6_1"));
				com.setG26_5_7(rs.getString("G26_5_7"));
				com.setG26_5_7_1(rs.getInt("G26_5_7_1"));
				com.setG26_5_8_1(rs.getInt("G26_5_8_1"));
				com.setG26_5_8_2(rs.getInt("G26_5_8_2"));
				com.setG26_5_8_3(rs.getInt("G26_5_8_3"));
				com.setG26_5_8_4(rs.getInt("G26_5_8_4"));
				com.setG27(rs.getInt("G27"));
				com.setG28(rs.getInt("G28"));
				com.setG29(rs.getInt("G29"));
				com.setG30(rs.getString("G30"));
				com.setG30_1(rs.getString("G30_1"));
				com.setG31(rs.getString("G31"));
				com.setG31_1(rs.getInt("G31_1"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return com;
	}
	
	//Busca las citas relacionadas con el empleado: nombre, apaterno, amaterno
	public ArrayList<Cita> bCita(String[] paramsE){
		ArrayList<Cita> citArr = new ArrayList<Cita>();
		Empleado emp = new Empleado();
		emp = bEmpleado(paramsE); 
		
		try {
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM CITA WHERE id_empleado = ?");
			stmt.setString(1, String.valueOf(emp.getId_empleado()));
			ResultSet rs = stmt.executeQuery();
			while(rs.next()){
				Cita citaTemp = new Cita();
				citaTemp.setId_cita(rs.getInt("id_cita"));
				citaTemp.setId_empleado(rs.getInt("id_empleado"));
				citaTemp.setId_paciente(rs.getInt("id_paciente"));
				citaTemp.setFecha(rs.getString("Fecha"));
				citArr.add(citaTemp);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return citArr;
	}
	
}