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
}