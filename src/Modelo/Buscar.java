// Busca a renglones de la base de datos
// Si una clase no se encuetra, se regresa con id = -1

package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;

public class Buscar{
	private Connection conn;
	
	public Buscar(Connection conn){
		this.conn = conn;
	}
	
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
}