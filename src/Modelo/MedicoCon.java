package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class MedicoCon {
	
	ConectarBD conectar;
	
	public MedicoCon(){
    conectar = new ConectarBD();
}

	public ArrayList<Medico> listaMedico(){
		
		ArrayList<Medico> listaMed = new ArrayList<Medico>();
		Medico medico;
		
		try{
			Connection conn = conectar.getConnection();
			PreparedStatement prest = conn.prepareStatement("select * from medico");
            ResultSet rs = prest.executeQuery();
            System.out.println("conecta 1");
            while(rs.next()){
            	medico = new Medico();
            	medico.setId(rs.getInt(1));
            	medico.setNombre(rs.getString(2));
            	medico.setAMaterno(rs.getString(3));
            	medico.setApaterno(rs.getString(4));
            	listaMed.add(medico);
            }
		
		}catch(Exception e){
			
		}
		
		
		return listaMed;
		
	}




}