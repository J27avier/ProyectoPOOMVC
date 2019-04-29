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
		try {
			PreparedStatement stmt = conn.prepareStatement("SELECT * from empleado WHERE Nombre = ? AND APaterno=? AND AMaterno =?");
			stmt.setString(1, paramsE[1]);
			stmt.setString(2, paramsE[2]);
			stmt.setString(3, paramsE[3]);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
	}
}