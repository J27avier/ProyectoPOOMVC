package Modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;

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
			return 0;
		}
		return 1;
	}

}
