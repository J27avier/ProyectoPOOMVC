package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConectarBD {

	private static Connection conn;
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String user = "root";
	private static final String password = "";
	//REVISAR QUE LA BASE DE DATOS CONCUERDE
	private static final String url = "jdbc:mysql://localhost:3306/proyectopoo";
	
	public ConectarBD(){
		
		conn = null;
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,password);
			//JOptionPane.showMessageDialog(null, "Se conecto","Mens",JOptionPane.INFORMATION_MESSAGE);
			
			if (conn != null){
				System.out.println("Se conecto");
				//System.out.println("con1.1");
			}
			
			
			
			
		}catch (ClassNotFoundException | SQLException e){
			
			System.out.println("NO Se conecto");
		}
		
	}
	
	// 
	public Connection getConnection(){
		
		return conn;
	}

	public void DesConnecton(){
		
		conn = null;
	if(conn == null){
		
		System.out.println("Termino conexion");
		
	}
	}
	
	
	
	
}
