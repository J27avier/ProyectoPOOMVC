package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import Vista.*;
import Modelo.*;

import java.sql.Connection;

import javax.swing.JOptionPane;

public class ContIngPaciente implements ActionListener{
	Vista.PagIngPaciente pIngP = new Vista.PagIngPaciente();
	Connection conn;
	
	public ContIngPaciente(Vista.PagIngPaciente pIngP, Connection conn){
		this.pIngP = pIngP;
		this.conn = conn;
		this.pIngP.ingresar1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent evento){
		if(evento.getSource()==pIngP.ingresar1)
		{
			Insertar ins = new Insertar(conn);
			Empleado emp = new Empleado();
			Paciente pac = new Paciente();
			Tension ten = new Tension();
			Trastornos tra = new Trastornos();
			Emocional emo= new Emocional();
			Comorbilidad com= new Comorbilidad();
			int flag =1;
			
			//validar nombre
			try {
				String temp = pIngP.TB1_1.getText().toString();
				if(!temp.matches("^[a-zA-Z]+ ?([a-zA-Z]+)?$"))
					throw new Exception();
				pac.setB1_1(temp);
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TB1_1.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar un nombre valido");
			}
			// validar APaterno
			try {
				String temp = pIngP.TB1_2.getText().toString();
				if(!temp.matches("^[a-zA-Z]+$"))
					throw new Exception();
				pac.setB1_2(temp);
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TB1_2.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar un apellido paterno valido");
			}
			// Validar aMaterno
			try {
				String temp = pIngP.TB1_3.getText().toString();
				if(!temp.matches("^[a-zA-Z]+$"))
					throw new Exception();
				pac.setB1_3(temp);
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TB1_3.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar un apellido materno valido");
			}
			// validar edad
			try {
				String temp = pIngP.TB4.getText().toString();
				if(!temp.matches("^[1-9][0-9]?$"))
					throw new Exception();
				pac.setB4(Integer.parseInt(temp));
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TB4.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar una edad valida");
			}
			//validar sexo
			try {
				String temp = pIngP.DB2.getSelectedItem().toString();
				if(!temp.matches("^[a-zA-Z]+$"))
					throw new Exception();
				pac.setB2(temp);
			}
			catch(Exception e1) {
				flag=0;
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar sexo valido");
			}
			//validar DOB
			if(pIngP.DCB3.getDate() != null){
				String DOB = String.format("%d-%d-%d", (1900 + pIngP.DCB3.getDate().getYear()), (pIngP.DCB3.getDate().getMonth()+1), pIngP.DCB3.getDate().getDate());
				pac.setB3(java.sql.Date.valueOf(DOB));
			}else{
				JOptionPane.showMessageDialog(pIngP, "Favor de introducir una fecha");
				flag = 0;
			}
			//validar calle
			try {
				String temp = pIngP.TB5_1.getText().toString();
				if(!temp.matches("^[a-zA-Z0-9 ]+$"))
					throw new Exception();
				pac.setB5_1(temp);
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TB5_1.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar una calle valida");
			}
			//validar Num. exterior
			try {
				String temp = pIngP.TB5_2.getText().toString();
				if(!temp.matches("^[0-9]+$"))
					throw new Exception();
				pac.setB5_2(temp);
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TB5_2.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar No. exterior valido");
			}
			// validar Num. interior
			try {
				String temp = pIngP.TB5_3.getText().toString();
				if(!temp.matches("^[a-zA-Z0-9]+$"))
					throw new Exception();
				pac.setB5_3(temp);
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TB5_3.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar No. interior valido");
			}
			//valida Zona
			try {
				String temp = pIngP.TB5_4.getText().toString();
				if(!temp.matches("^[a-zA-Z]+$"))
					throw new Exception();
				pac.setB5_4(temp);
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TB5_4.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar zona valida");
			}
			// validar delegacion/municipio
			try {
				String temp = pIngP.TB5_5.getText().toString();
				if(!temp.matches("^[a-zA-Z]+$"))
					throw new Exception();
				pac.setB5_5(temp);
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TB5_5.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar Deleg/Munic valido");
			}
			// validar codigo postal
			try {
				String temp = pIngP.TB5_6.getText().toString();
				if(!temp.matches("^[0-9]+$"))
					throw new Exception();
				pac.setB5_6(temp);
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TB5_6.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar C.P. valido");
			}
			//validar telefono fijo
			try {
				String temp = pIngP.TB6.getText().toString();
				if(!temp.matches("^[0-9]+$"))
					throw new Exception();
				pac.setB6(temp);
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TB6.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar Telefono fijo valido");
			}
			//valida telefono celular
			try {
				String temp = pIngP.TB7.getText().toString();
				if(!temp.matches("^[0-9]+$"))
					throw new Exception();
				pac.setB7(temp);
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TB7.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar Telefono celular valido");
			}
			// validar tiempo vivido en anios
			try {
				String temp = pIngP.TB8_1.getText().toString();
				if(!temp.matches("^[0-9][0-9]?$"))
					throw new Exception();
				pac.setB8_1(Integer.parseInt(temp));
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TB8_1.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar tiempo vivido (a) valido");
			}
			// validar tiempo vivido en meses
			try {
				String temp = pIngP.TB8_2.getText().toString();
				if(!temp.matches("^[0-9][0-9]?$"))
					throw new Exception();
				pac.setB8_2(Integer.parseInt(temp));
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TB8_2.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar tiempo vivido (m) valido");
			}
			// validar entidad federativa de origen
			try {
				String temp = pIngP.TB9.getText().toString();
				if(!temp.matches("^[a-zA-Z]+$"))
					throw new Exception();
				pac.setB9(temp);
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TB9.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar entidad de origen valida");
			}
			// validar estado civil
			try {
				String temp = pIngP.DB10.getSelectedItem().toString();
				if(!temp.matches("^[a-zA-Z]+$"))
					throw new Exception();
				pac.setB10(temp);
			}
			catch(Exception e1) {
				flag=0;
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar estado civil valido");
			}
			// validar nivel de estudios
			try {
				String temp = pIngP.DB11.getSelectedItem().toString();
				if(!temp.matches("^.+$")) 
					throw new Exception();
				String temp1 = temp.substring(0, 1); 
				pac.setB11(Integer.parseInt(temp1));
			}
			catch(Exception e1) {
				flag=0;
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar estudios validos");
			}
			// validar si sabe leer
			try {
				String temp = pIngP.DB12.getSelectedItem().toString();
				if(!temp.matches("^.+$"))
					throw new Exception();
				pac.setB12(temp);
			}
			catch(Exception e1) {
				flag=0;
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar soi sabe leer valido");
			}
			// validar si sabe escribir
			try {
				String temp = pIngP.DB13.getSelectedItem().toString();
				if(!temp.matches("^.+$"))
					throw new Exception();
				pac.setB13(temp);
			}
			catch(Exception e1) {
				flag=0;
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar si sabe escribir valido");
			}
			//validar a que se dedica
			try {
				String temp = pIngP.DB14.getSelectedItem().toString();
				if(!temp.matches("^.+$")) 
					throw new Exception();
				String temp1 = temp.substring(0, 1); 
				pac.setB14(Integer.parseInt(temp1));
			}
			catch(Exception e1) {
				flag=0;
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar estudios validos");
			}
			// validar especifique
			try {
				String temp = pIngP.TB14_1.getText().toString();
				if(!temp.matches("^.+$"))
					throw new Exception();
				pac.setB14_1(temp);
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TB14_1.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de especificacion (trabajo) valida");
			}
			// validar religion
			try {
				String temp = pIngP.DB15.getSelectedItem().toString();
				if(!temp.matches("^.+$")) 
					throw new Exception();
				String temp1 = temp.substring(0, 1); 
				pac.setB15(Integer.parseInt(temp1));
			}
			catch(Exception e1) {
				flag=0;
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar religion valida");
			}
			//validar especifique religion
			try {
				String temp = pIngP.TB15_1.getText().toString();
				if(!temp.matches("^.+$"))
					throw new Exception();
				pac.setB15_1(temp);
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TB15_1.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de especificacion (religion) valida");
			}
			//validar nombre de contacto
			try {
				String temp = pIngP.TC1.getText().toString();
				if(!temp.matches("^[a-zA-Z ]+$"))
					throw new Exception();
				pac.setC1(temp);
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TC1.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar nombre de contacto valido");
			}
			// validar parentesco
			try {
				String temp = pIngP.TC2.getText().toString();
				if(!temp.matches("^[a-zA-Z ]+$"))
					throw new Exception();
				pac.setC2(temp);
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TC2.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar parentesco de contacto valido");
			}
			//validar numero de contacto
			try {
				String temp = pIngP.TC3.getText().toString();
				if(!temp.matches("^[0-9]+$"))
					throw new Exception();
				pac.setC3(temp);
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TC3.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar numero de contacto valido");
			}
			// validar observaciones
			try {
				String temp = pIngP.TC4.getText().toString();
				if(!temp.matches("^[a-zA-Z 0-9]+$"))
					throw new Exception();
				pac.setC4(temp);
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TC4.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar comentario valido");
			}
			
			if(flag==0)
			{
				JOptionPane.showMessageDialog(pIngP, "Favor de corregir valores");
			}
			else
			{
				System.out.println(pac.toString());
			}
			
		}
	}
}
