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
			Buscar bus = new Buscar(conn);
			Empleado emp = new Empleado();
			Paciente pac = new Paciente();
			Tension ten = new Tension();
			Trastornos tra = new Trastornos();
			Emocional emo= new Emocional();
			Comorbilidad com= new Comorbilidad();
			int flag =1;
			int ETotal = 0, EObjetos = 0, FTotal = 0, GTotal = 0;
			String[] paramsE = new String[3];
			/**/
			//----------------Paciente-------------------------------
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
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar un a. paterno valido");
			}
			// validar APaterno
			try {
				String temp = pIngP.TB1_2.getText().toString();
				if(!temp.matches("^[a-zA-Z]+ ?([a-zA-Z]+)?$"))
					throw new Exception();
				pac.setB1_2(temp);
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TB1_2.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar un apellido materno valido");
			}
			// Validar aMaterno
			try {
				String temp = pIngP.TB1_3.getText().toString();
				if(!temp.matches("^[a-zA-Z]+ ?([a-zA-Z]+)?$"))
					throw new Exception();
				pac.setB1_3(temp);
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TB1_3.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar un nombre valido");
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
				if(!temp.matches("^[a-zA-Z0-9]+$"))
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
			//---------------------Validando tension----------------------------------------
			//Regex para double ^([0-9]+)(.)?([0-9]+)?$
			//Sistolica sentado
			try {
				String temp = pIngP.TD1.getText().toString();
				if(!temp.matches("^([0-9]+)(.)?([0-9]+)?$"))
					throw new Exception();
				ten.setD1(Double.valueOf(temp));
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TD1.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar sistolica sentado valida. En vez de .123 -> 0.123");
			}
			//Diastolica sentado
			try {
				String temp = pIngP.TD2.getText().toString();
				if(!temp.matches("^([0-9]+)(.)?([0-9]+)?$"))
					throw new Exception();
				ten.setD2(Double.valueOf(temp));
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TD2.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar diastolica sentado valida. En vez de .123 -> 0.123");
			}
			//Sistolica parado
			try {
				String temp = pIngP.TD3.getText().toString();
				if(!temp.matches("^([0-9]+)(.)?([0-9]+)?$"))
					throw new Exception();
				ten.setD3(Double.valueOf(temp));
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TD3.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar sistolica parado valida. En vez de .123 -> 0.123");
			}
			//Diastolica parado
			try {
				String temp = pIngP.TD4.getText().toString();
				if(!temp.matches("^([0-9]+)(.)?([0-9]+)?$"))
					throw new Exception();
				ten.setD4(Double.valueOf(temp));
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TD4.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar diastolica parado valida. En vez de .123 -> 0.123");
			}
			//Cardiaca
			try {
				String temp = pIngP.TD5.getText().toString();
				if(!temp.matches("^([0-9]+)(.)?([0-9]+)?$"))
					throw new Exception();
				ten.setD5(Double.valueOf(temp));
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TD5.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar f cardiaca valida. En vez de .123 -> 0.123");
			}
			//Resp
			try {
				String temp = pIngP.TD6.getText().toString();
				if(!temp.matches("^([0-9]+)(.)?([0-9]+)?$"))
					throw new Exception();
				ten.setD6(Double.valueOf(temp));
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TD6.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar f resp valida. En vez de .123 -> 0.123");
			}
			//Glaucemia capilar
			try {
				String temp = pIngP.TD7.getText().toString();
				if(!temp.matches("^([0-9]+)(.)?([0-9]+)?$"))
					throw new Exception();
				ten.setD7(Double.valueOf(temp));
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TD7.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar glaucemia capilar valida. En vez de .123 -> 0.123");
			}
			//SATO2%
			try {
				String temp = pIngP.TD8.getText().toString();
				if(!temp.matches("^([0-9]+)(.)?([0-9]+)?$"))
					throw new Exception();
				ten.setD8(Double.valueOf(temp));
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TD8.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar SATO2% valida. En vez de .123 -> 0.123");
			}
			//Temperatura
			try {
				String temp = pIngP.TD9.getText().toString();
				if(!temp.matches("^([0-9]+)(.)?([0-9]+)?$"))
					throw new Exception();
				ten.setD9(Double.valueOf(temp));
			}
			catch(Exception e1) {
				flag=0;
				pIngP.TD9.setText("");
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar temperatura °C valida. En vez de .123 -> 0.123");
			}
			//-------------------------------- Trastornos -----------------------------------------
			//Numeros
			if(pIngP.RBE0_1_1.isSelected()){
				ETotal += 2;
				tra.setE0_1(2);
			}else if(pIngP.RBE0_1_2.isSelected()){
				ETotal += 0;
				tra.setE0_1(0);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar puntos por numeros correctos");
			}
			//Hora
			if(pIngP.RBE0_2_1.isSelected()){
				ETotal += 2;
				tra.setE0_2(2);
			}else if(pIngP.RBE0_2_2.isSelected()){
				ETotal += 0;
				tra.setE0_2(0);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar puntos por hora correcta");
			}
			//Estado
			if(pIngP.RBE2_1.isSelected()){
				ETotal += 1;
				tra.setE2(1);
			}else if(pIngP.RBE2_2.isSelected()){
				ETotal += 0;
				tra.setE2(0);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar puntos por estado correcto");
			}
			//Objetos
			if(pIngP.CBE1_1.isSelected())
				EObjetos += 1;
			if(pIngP.CBE1_2.isSelected())
				EObjetos += 1;
			if(pIngP.CBE1_3.isSelected())
				EObjetos += 1;
			if(pIngP.CBE1_4.isSelected())
				EObjetos += 1;
			if(pIngP.CBE1_5.isSelected())
				EObjetos += 1;

			ETotal += EObjetos;
			tra.setE1(EObjetos);
			tra.setETotal(ETotal);

			pIngP.LETotalResp.setText(String.valueOf(ETotal));

			//----------------------------------------------Emocional-----------------------------------
			//F1
			if(pIngP.RBF1_1.isSelected()){
				FTotal += 0;
				emo.setF1(0);
			}else if(pIngP.RBF1_2.isSelected()){
				FTotal += 1;
				emo.setF1(1);
			}else if(pIngP.RBF1_3.isSelected()){
				FTotal += 2;
				emo.setF1(2);
			}else if(pIngP.RBF1_4.isSelected()){
				FTotal += 3;
				emo.setF1(3);
			}else if(pIngP.RBF1_5.isSelected()){
				FTotal += 0;
				emo.setF1(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar ¿Sentía que no podia quitarse...?");
			}
			//F2
			if(pIngP.RBF2_1.isSelected()){
				FTotal += 0;
				emo.setF2(0);
			}else if(pIngP.RBF2_2.isSelected()){
				FTotal += 1;
				emo.setF2(1);
			}else if(pIngP.RBF2_3.isSelected()){
				FTotal += 2;
				emo.setF2(2);
			}else if(pIngP.RBF2_4.isSelected()){
				FTotal += 3;
				emo.setF2(3);
			}else if(pIngP.RBF2_5.isSelected()){
				FTotal += 0;
				emo.setF2(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar ¿Le costaba consentrarse...?");
			}
			//F3
			if(pIngP.RBF3_1.isSelected()){
				FTotal += 0;
				emo.setF3(0);
			}else if(pIngP.RBF3_2.isSelected()){
				FTotal += 1;
				emo.setF3(1);
			}else if(pIngP.RBF3_3.isSelected()){
				FTotal += 2;
				emo.setF3(2);
			}else if(pIngP.RBF3_4.isSelected()){
				FTotal += 3;
				emo.setF3(3);
			}else if(pIngP.RBF3_5.isSelected()){
				FTotal += 0;
				emo.setF3(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar ¿Se sintio depri...?");
			}
			//F4
			if(pIngP.RBF4_1.isSelected()){
				FTotal += 0;
				emo.setF4(0);
			}else if(pIngP.RBF4_2.isSelected()){
				FTotal += 1;
				emo.setF4(1);
			}else if(pIngP.RBF4_3.isSelected()){
				FTotal += 2;
				emo.setF4(2);
			}else if(pIngP.RBF4_4.isSelected()){
				FTotal += 3;
				emo.setF4(3);
			}else if(pIngP.RBF4_5.isSelected()){
				FTotal += 0;
				emo.setF4(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar ¿Le parecia que todo...");
			}
			//F5
			if(pIngP.RBF5_1.isSelected()){
				FTotal += 0;
				emo.setF5(0);
			}else if(pIngP.RBF5_2.isSelected()){
				FTotal += 1;
				emo.setF5(1);
			}else if(pIngP.RBF5_3.isSelected()){
				FTotal += 2;
				emo.setF5(2);
			}else if(pIngP.RBF5_4.isSelected()){
				FTotal += 3;
				emo.setF5(3);
			}else if(pIngP.RBF5_5.isSelected()){
				FTotal += 0;
				emo.setF5(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar ¿No durmio bien?");
			}
			//F6
			if(pIngP.RBF6_1.isSelected()){
				FTotal += 0;
				emo.setF6(0);
			}else if(pIngP.RBF6_2.isSelected()){
				FTotal += 1;
				emo.setF6(1);
			}else if(pIngP.RBF6_3.isSelected()){
				FTotal += 2;
				emo.setF6(2);
			}else if(pIngP.RBF6_4.isSelected()){
				FTotal += 3;
				emo.setF6(3);
			}else if(pIngP.RBF6_5.isSelected()){
				FTotal += 0;
				emo.setF6(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar ¿Disfruto de la vida?");
			}
			//F7
			if(pIngP.RBF7_1.isSelected()){
				FTotal += 0;
				emo.setF7(0);
			}else if(pIngP.RBF7_2.isSelected()){
				FTotal += 1;
				emo.setF7(1);
			}else if(pIngP.RBF7_3.isSelected()){
				FTotal += 2;
				emo.setF7(2);
			}else if(pIngP.RBF7_4.isSelected()){
				FTotal += 3;
				emo.setF7(3);
			}else if(pIngP.RBF7_5.isSelected()){
				FTotal += 0;
				emo.setF7(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar ¿Se sintio triste?");
			}

			emo.setFTotal(FTotal);
			/**/
			//---------------------------------Comorbilidad-------------------------------------------------
			//G1
			if(pIngP.RBG1_1.isSelected()){
				GTotal += 0;
				com.setG1(0);
			}else if(pIngP.RBG1_2.isSelected()){
				GTotal += 1;
				com.setG1(1);
			}else if(pIngP.RBG1_3.isSelected()){
				GTotal += 0;
				com.setG1(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar comorbilidad 1.");
			}
			//G2
			if(pIngP.RBG2_1.isSelected()){
				GTotal += 0;
				com.setG2(0);
			}else if(pIngP.RBG2_2.isSelected()){
				GTotal += 1;
				com.setG2(1);
			}else if(pIngP.RBG2_3.isSelected()){
				GTotal += 0;
				com.setG2(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar comorbilidad 2.");
			}			
			//G3
			if(pIngP.RBG3_1.isSelected()){
				GTotal += 0;
				com.setG3(0);
			}else if(pIngP.RBG3_2.isSelected()){
				GTotal += 1;
				com.setG3(1);
			}else if(pIngP.RBG3_3.isSelected()){
				GTotal += 0;
				com.setG3(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar comorbilidad 3.");
			}			
			//G4
			if(pIngP.RBG4_1.isSelected()){
				GTotal += 0;
				com.setG4(0);
			}else if(pIngP.RBG4_2.isSelected()){
				GTotal += 1;
				com.setG4(1);
			}else if(pIngP.RBG4_3.isSelected()){
				GTotal += 0;
				com.setG4(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar comorbilidad 4.");
			}			
			//G5
			if(pIngP.RBG5_1.isSelected()){
				GTotal += 0;
				com.setG5(0);
			}else if(pIngP.RBG5_2.isSelected()){
				GTotal += 1;
				com.setG5(1);
			}else if(pIngP.RBG5_3.isSelected()){
				GTotal += 0;
				com.setG5(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar comorbilidad 5.");
			}			
			//G6
			if(pIngP.RBG6_1.isSelected()){
				GTotal += 0;
				com.setG6(0);
			}else if(pIngP.RBG6_2.isSelected()){
				GTotal += 1;
				com.setG6(1);
			}else if(pIngP.RBG6_3.isSelected()){
				GTotal += 0;
				com.setG6(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar comorbilidad 6.");
			}			
			//G7
			if(pIngP.RBG7_1.isSelected()){
				GTotal += 0;
				com.setG7(0);
			}else if(pIngP.RBG7_2.isSelected()){
				GTotal += 1;
				com.setG7(1);
			}else if(pIngP.RBG7_3.isSelected()){
				GTotal += 0;
				com.setG7(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar comorbilidad 7.");
			}			
			//G8
			if(pIngP.RBG8_1.isSelected()){
				GTotal += 0;
				com.setG8(0);
			}else if(pIngP.RBG8_2.isSelected()){
				GTotal += 1;
				com.setG8(1);
			}else if(pIngP.RBG8_3.isSelected()){
				GTotal += 0;
				com.setG8(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar comorbilidad 8.");
			}			
			//G9
			if(pIngP.RBG9_1.isSelected()){
				GTotal += 0;
				com.setG9(0);
			}else if(pIngP.RBG9_2.isSelected()){
				GTotal += 1;
				com.setG9(1);
			}else if(pIngP.RBG9_3.isSelected()){
				GTotal += 0;
				com.setG9(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar comorbilidad 9.");
			}			
			//G10
			if(pIngP.RBG10_1.isSelected()){
				GTotal += 0;
				com.setG10(0);
			}else if(pIngP.RBG10_2.isSelected()){
				GTotal += 1;
				com.setG10(1);
			}else if(pIngP.RBG10_3.isSelected()){
				GTotal += 0;
				com.setG10(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar comorbilidad 10.");
			}			
			//G11
			if(pIngP.RBG11_1.isSelected()){
				GTotal += 0;
				com.setG11(0);
			}else if(pIngP.RBG11_2.isSelected()){
				GTotal += 1;
				com.setG11(1);
			}else if(pIngP.RBG11_3.isSelected()){
				GTotal += 0;
				com.setG11(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar comorbilidad 11.");
			}			
			//G12
			if(pIngP.RBG12_1.isSelected()){
				GTotal += 0;
				com.setG12(0);
			}else if(pIngP.RBG12_2.isSelected()){
				GTotal += 1;
				com.setG12(1);
			}else if(pIngP.RBG12_3.isSelected()){
				GTotal += 0;
				com.setG12(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar comorbilidad 12.");
			}			
			//G13
			if(pIngP.RBG13_1.isSelected()){
				GTotal += 0;
				com.setG13(0);
			}else if(pIngP.RBG13_2.isSelected()){
				GTotal += 1;
				com.setG13(1);
			}else if(pIngP.RBG13_3.isSelected()){
				GTotal += 0;
				com.setG13(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar comorbilidad 13.");
			}			
			//G14
			if(pIngP.RBG14_1.isSelected()){
				GTotal += 0;
				com.setG14(0);
			}else if(pIngP.RBG14_2.isSelected()){
				GTotal += 1;
				com.setG14(1);
			}else if(pIngP.RBG14_3.isSelected()){
				GTotal += 0;
				com.setG14(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar comorbilidad 14.");
			}			
			//G15
			if(pIngP.RBG15_1.isSelected()){
				GTotal += 0;
				com.setG15(0);
			}else if(pIngP.RBG15_2.isSelected()){
				GTotal += 1;
				com.setG15(1);
			}else if(pIngP.RBG15_3.isSelected()){
				GTotal += 0;
				com.setG15(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar comorbilidad 15.");
			}			
			//G16
			if(pIngP.RBG16_1.isSelected()){
				GTotal += 0;
				com.setG16(0);
			}else if(pIngP.RBG16_2.isSelected()){
				GTotal += 1;
				com.setG16(1);
			}else if(pIngP.RBG16_3.isSelected()){
				GTotal += 0;
				com.setG16(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar comorbilidad 16.");
			}			
			//G17
			if(pIngP.RBG17_1.isSelected()){
				GTotal += 0;
				com.setG17(0);
			}else if(pIngP.RBG17_2.isSelected()){
				GTotal += 1;
				com.setG17(1);
			}else if(pIngP.RBG17_3.isSelected()){
				GTotal += 0;
				com.setG17(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar comorbilidad 17.");
			}			
			//G18
			if(pIngP.RBG18_1.isSelected()){
				GTotal += 0;
				com.setG18(0);
			}else if(pIngP.RBG18_2.isSelected()){
				GTotal += 1;
				com.setG18(1);
			}else if(pIngP.RBG18_3.isSelected()){
				GTotal += 0;
				com.setG18(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar comorbilidad 18.");
			}			
			//G19
			if(pIngP.RBG19_1.isSelected()){
				GTotal += 0;
				com.setG19(0);
			}else if(pIngP.RBG19_2.isSelected()){
				GTotal += 1;
				com.setG19(1);
			}else if(pIngP.RBG19_3.isSelected()){
				GTotal += 0;
				com.setG19(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar comorbilidad 19.");
			}

			com.setGTotal(GTotal);

			//G20
			if(pIngP.RBG20_1.isSelected()){
				GTotal += 0;
				com.setG20(0);
			}else if(pIngP.RBG20_2.isSelected()){
				GTotal += 1;
				com.setG20(1);
			}else if(pIngP.RBG20_3.isSelected()){
				GTotal += 0;
				com.setG20(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar comorbilidad 20.");
			}
			//G21
			if(pIngP.RBG21_1.isSelected()){
				GTotal += 0;
				com.setG21(0);
			}else if(pIngP.RBG21_2.isSelected()){
				GTotal += 1;
				com.setG21(1);
			}else if(pIngP.RBG21_3.isSelected()){
				GTotal += 0;
				com.setG21(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar comorbilidad 21.");
			}
			//G22
			if(pIngP.RBG22_1.isSelected()){
				GTotal += 0;
				com.setG22(0);
			}else if(pIngP.RBG22_2.isSelected()){
				GTotal += 1;
				com.setG22(1);
			}else if(pIngP.RBG22_3.isSelected()){
				GTotal += 0;
				com.setG22(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar comorbilidad 22.");
			}
			//G23
			if(pIngP.RBG23_1.isSelected()){
				GTotal += 0;
				com.setG23(0);
			}else if(pIngP.RBG23_2.isSelected()){
				GTotal += 1;
				com.setG23(1);
			}else if(pIngP.RBG23_3.isSelected()){
				GTotal += 0;
				com.setG23(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar comorbilidad 23.");
			}
			//G24
			if(pIngP.RBG24_1.isSelected()){
				GTotal += 0;
				com.setG24(0);
			}else if(pIngP.RBG24_2.isSelected()){
				GTotal += 1;
				com.setG24(1);
			}else if(pIngP.RBG24_3.isSelected()){
				GTotal += 0;
				com.setG24(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar comorbilidad 24.");
			}
			//G25
			if(pIngP.RBG25_1.isSelected()){
				GTotal += 0;
				com.setG25(0);
			}else if(pIngP.RBG25_2.isSelected()){
				GTotal += 1;
				com.setG25(1);
			}else if(pIngP.RBG25_3.isSelected()){
				GTotal += 0;
				com.setG25(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar comorbilidad 25.");
			}
			//G26
			if(pIngP.RBG26_1.isSelected()){
				GTotal += 0;
				com.setG26(0);
			}else if(pIngP.RBG26_2.isSelected()){
				GTotal += 1;
				com.setG26(1);
			}else if(pIngP.RBG26_3.isSelected()){
				GTotal += 0;
				com.setG26(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar comorbilidad zoster.");
			}
			if(!pIngP.CBG26_1_4.isSelected()){
				com.setG26_1_4(0);
				
				//G26_1_1
				try {
					String temp = pIngP.TG26_1_1.getText().toString();
					if(!temp.matches("^([0-9])+$"))
						throw new Exception();
					com.setG26_1_1(Integer.valueOf(temp));
				}
				catch(Exception e1) {
					flag=0;
					pIngP.TG26_1_1.setText("");
					JOptionPane.showMessageDialog(pIngP, "Favor de ingresar anios de herpes (puede ser 0)");
				}
				//G26_1_2
				try {
					String temp = pIngP.TG26_1_2.getText().toString();
					if(!temp.matches("^([0-9])+$"))
						throw new Exception();
					com.setG26_1_2(Integer.valueOf(temp));
				}
				catch(Exception e1) {
					flag=0;
					pIngP.TG26_1_2.setText("");
					JOptionPane.showMessageDialog(pIngP, "Favor de ingresar meses de herpes (puede ser 0)");
				}
				//G26_1_3
				try {
					String temp = pIngP.TG26_1_3.getText().toString();
					if(!temp.matches("^([0-9])+$"))
						throw new Exception();
					com.setG26_1_3(Integer.valueOf(temp));
				}
				catch(Exception e1) {
					flag=0;
					pIngP.TG26_1_3.setText("");
					JOptionPane.showMessageDialog(pIngP, "Favor de ingresar dias de herpes (puede ser 0)");
				}
			}else{
				com.setG26_1_4(1);
			}//No aplica
			
			//G26_2
			if(!pIngP.CBG26_2_1.isSelected()){
				com.setG26_2_1(0);
				com.setG26_2(pIngP.TG26_2.getText().toString());
			}else{
				com.setG26_2_1(1);
				com.setG26_2("");
			}
			//G26_3
			if(!pIngP.CBG26_3_1.isSelected()){
				com.setG26_3_1(0);
				com.setG26_3(pIngP.TG26_3.getText().toString());
			}else{
				com.setG26_3_1(1);
				com.setG26_3("");
			}
			//G26_4
			if(!pIngP.CBG26_4_1.isSelected()){
				com.setG26_4_1(0);
				com.setG26_4(pIngP.TG26_4.getText().toString());
			}else{
				com.setG26_4_1(1);
				com.setG26_4("");
			}
			
			//G26_5 Radio 3 opciones, anio, mes, dia no aplica
			if(!pIngP.CBG26_5_4.isSelected()){
				com.setG26_5_4(0);
				if(pIngP.RBG26_5_1.isSelected()){
					com.setG26_5(0);
				}else if(pIngP.RBG26_5_2.isSelected()){
					com.setG26_5(1);
				}else if(pIngP.RBG26_5_3.isSelected()){
					com.setG26_5(-1);
				}else{
					flag = 0;
					JOptionPane.showMessageDialog(pIngP, "Favor de contestar tuvo dolor posterior al herpes... o no aplica");
				}
				//Anio dia mes
				//G26_5_1
				try {
					String temp = pIngP.TG26_5_1.getText().toString();
					if(!temp.matches("^([0-9])+$"))
						throw new Exception();
					com.setG26_5_1(Integer.valueOf(temp));
				}
				catch(Exception e1) {
					flag=0;
					pIngP.TG26_5_1.setText("");
					JOptionPane.showMessageDialog(pIngP, "Favor de ingresar anios de dolor (puede ser 0)");
				}
				//G26_5_2
				try {
					String temp = pIngP.TG26_5_2.getText().toString();
					if(!temp.matches("^([0-9])+$"))
						throw new Exception();
					com.setG26_5_2(Integer.valueOf(temp));
				}
				catch(Exception e1) {
					flag=0;
					pIngP.TG26_5_2.setText("");
					JOptionPane.showMessageDialog(pIngP, "Favor de ingresar meses de dolor (puede ser 0)");
				}
				//G26_5_3
				try {
					String temp = pIngP.TG26_5_3.getText().toString();
					if(!temp.matches("^([0-9])+$"))
						throw new Exception();
					com.setG26_5_3(Integer.valueOf(temp));
				}
				catch(Exception e1) {
					flag=0;
					pIngP.TG26_5_3.setText("");
					JOptionPane.showMessageDialog(pIngP, "Favor de ingresar dias de dolor (puede ser 0)");
				}
				
			}else{
				com.setG26_5_4(1);
			} // No aplica
			
			//G26_5_5
			if(!pIngP.CBG26_5_5_1.isSelected()){
				com.setG26_5_5_1(0);
				com.setG26_5_5(pIngP.TG26_5_5.getText().toString());
			}else{
				com.setG26_5_5_1(1);
				com.setG26_5_5("");
			}
			//G26_5_6
			if(!pIngP.CBG26_5_6_1.isSelected()){
				com.setG26_5_6_1(0);
				com.setG26_5_6(pIngP.TG26_5_6.getText().toString());
			}else{
				com.setG26_5_6_1(1);
				com.setG26_5_6("");
			}
			//G26_5_7
			if(!pIngP.CBG26_5_7_1.isSelected()){
				com.setG26_5_7_1(0);
				com.setG26_5_7(pIngP.TG26_5_7.getText().toString());
			}else{
				com.setG26_5_7_1(1);
				com.setG26_5_7("");
			}
			
			//G26_5_8
			// anio, mes, dia no aplica
			if(!pIngP.CBG26_5_8_4.isSelected()){
				com.setG26_5_8_4(0);
				//Anio dia mes
				//G26_5_1
				try {
					String temp = pIngP.TG26_5_8_1.getText().toString();
					if(!temp.matches("^([0-9])+$"))
						throw new Exception();
					com.setG26_5_8_1(Integer.valueOf(temp));
				}
				catch(Exception e1) {
					flag=0;
					pIngP.TG26_5_8_1.setText("");
					JOptionPane.showMessageDialog(pIngP, "Favor de ingresar anios de dolor (puede ser 0)");
				}
				//G26_5_2
				try {
					String temp = pIngP.TG26_5_8_2.getText().toString();
					if(!temp.matches("^([0-9])+$"))
						throw new Exception();
					com.setG26_5_8_2(Integer.valueOf(temp));
				}
				catch(Exception e1) {
					flag=0;
					pIngP.TG26_5_8_2.setText("");
					JOptionPane.showMessageDialog(pIngP, "Favor de ingresar meses de dolor (puede ser 0)");
				}
				//G26_5_3
				try {
					String temp = pIngP.TG26_5_8_3.getText().toString();
					if(!temp.matches("^([0-9])+$"))
						throw new Exception();
					com.setG26_5_8_3(Integer.valueOf(temp));
				}
				catch(Exception e1) {
					flag=0;
					pIngP.TG26_5_8_3.setText("");
					JOptionPane.showMessageDialog(pIngP, "Favor de ingresar dias de dolor (puede ser 0)");
				}
				
			}else{
				com.setG26_5_8_4(1);
			} // No aplica
			
			//G27
			if(pIngP.RBG27_1.isSelected()){
				GTotal += 0;
				com.setG27(0);
			}else if(pIngP.RBG27_2.isSelected()){
				GTotal += 1;
				com.setG27(1);
			}else if(pIngP.RBG27_3.isSelected()){
				GTotal += 0;
				com.setG27(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar comorbilidad 27.");
			}
			//G28
			if(pIngP.RBG28_1.isSelected()){
				GTotal += 0;
				com.setG28(0);
			}else if(pIngP.RBG28_2.isSelected()){
				GTotal += 1;
				com.setG28(1);
			}else if(pIngP.RBG28_3.isSelected()){
				GTotal += 0;
				com.setG28(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar comorbilidad 28.");
			}
			//G29
			if(pIngP.RBG29_1.isSelected()){
				GTotal += 0;
				com.setG29(0);
			}else if(pIngP.RBG29_2.isSelected()){
				GTotal += 1;
				com.setG29(1);
			}else if(pIngP.RBG29_3.isSelected()){
				GTotal += 0;
				com.setG29(-1);
			}else{
				flag = 0;
				JOptionPane.showMessageDialog(pIngP, "Favor de contestar comorbilidad 29.");
			}
			//G30
			com.setG30(pIngP.TG30.getText().toString());
			//G31
			com.setG30_1(pIngP.TG30_1.getText().toString());
			
			//G31
			if(!pIngP.CBG31_1.isSelected()){
				com.setG31_1(0);
				com.setG31(pIngP.TG31.getText().toString());
			}else{
				com.setG31_1(1);
				com.setG31("");
			}
			
			//-------------------Empleado----------------------------------------------------
			//Validar nombreD
			try{
				String temp = pIngP.TNombre_1.getText().toString(); //
				if(!temp.matches("^[a-zA-Z]+ ?([a-zA-Z]+)?$"))
					throw new Exception();
				paramsE[0]= temp; //
			}catch(Exception e1){
				flag = 0;
				pIngP.TNombre_1.setText(""); //
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar nombre del empleado valido"); //
			}
			//Validar APaternoD
			try{
				String temp = pIngP.TAPaterno_1.getText().toString(); //
				if(!temp.matches("^[a-zA-Z]+$"))
					throw new Exception();
				paramsE[1]= temp; //
			}catch(Exception e1){
				flag = 0;
				pIngP.TAPaterno_1.setText(""); //
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar a. paterno del empleado valido"); //
			}
			//Validar AMaternoD
			try{
				String temp = pIngP.TAMaterno_1.getText().toString(); //
				if(!temp.matches("^[a-zA-Z]+$"))
					throw new Exception();
				paramsE[2]= temp; //
			}catch(Exception e1){
				flag = 0;
				pIngP.TAMaterno_1.setText(""); //
				JOptionPane.showMessageDialog(pIngP, "Favor de ingresar a. materno del medico valido"); //
			}
			//
			 
			 /**/
			if(flag==0)
			{
				JOptionPane.showMessageDialog(pIngP, "Favor de corregir valores");
			}
			else
			{
				emp = bus.bEmpleado(paramsE);
				if(emp.getId_empleado() == -1){
					JOptionPane.showMessageDialog(pIngP, "No se encontro al empleado. VUELVA A INTENTAR");
				}else{
					try{
					ins.iPaciente(emp, pac, ten, tra, emo, com);
					JOptionPane.showMessageDialog(pIngP, "Paciente agregado EXITOSAMENTE!");
					}catch(Exception e){
						e.printStackTrace();
						JOptionPane.showMessageDialog(pIngP, "Error al agregar paciente :(");
					}//catch
				}// if empleado
			}// if flag
		}// if evento get source
	}// if actionPerformed
}//Clase
