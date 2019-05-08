package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;







import Vista.*;
import Modelo.*;

import java.sql.Connection;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ContBusPaciente implements ActionListener{
	PagBusPaciente pBusP = new PagBusPaciente();
	Connection conn;
	public ContBusPaciente(PagBusPaciente pBusP, Connection conn){
		this.pBusP = pBusP;
		this.conn = conn;
		pBusP.Buscar1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent evento){
		if(evento.getSource()== pBusP.Buscar1){
			Buscar bus = new Buscar(conn);
			Paciente pac = new Paciente();
			String[] paramsP = new String[3];
			String[] opEst = {"0_No estudio","1_Primaria 1","2_Primaria 2",
					"3_Primaria 3","4_Primaria 4","5_Primaria 5","6_Primaria 6",
					"7_Secundaria 1","8_Secundaria 2","9_Secundaria 3",
					"10_Preparatoria 1","11_Preparatoria 2","12_Preparatoria 3",
					"13_Licenciatura 1","14_Licenciatura 2","15_Licenciatura 3",
					"16_Licenciatura 4","17_Licenciatura 5","18_Licenciatura 6",
					"19_Posgrado 1","20_Posgrado 2","21_Posgrado 3","22_Posgrado 4",
					"23_Posgrado 5","24_Podgrado 6","25_Posgrado >"};
			String[] opOf = {"0_Desempleado","1_Jibulado(a) sin pension",
					"2_Jubilado(a) con pension","3_Comercio informal","4_Jornalero(a)/Campesino",
					"5_Obrero(a)","6_Empleado(a) de oficina","7_Profesionista independiente",
					"8_Patron, jefe o empresario(a)","9_Ama de casa","10_Inactivo","11_Otra"};
			String[] opRel = {"0_Ninguna","1_Catolica","2_Cristiana","3_Judio","4_Testigo de Jehova",
					"5_Musulman","6_Otra"};

			int flag = 1;
			// validar APaterno
			try {
				String temp = pBusP.TB1_1_1.getText().toString();
				if(!temp.matches("^[a-zA-Z]+ ?([a-zA-Z]+)?$"))
					throw new Exception();
				paramsP[1]=temp;
			}
			catch(Exception e1) {
				flag=0;
				pBusP.TB1_1_1.setText("");
				JOptionPane.showMessageDialog(pBusP, "Favor de ingresar un apellido paterno valido");
			}
			// Validar aMaterno
			try {
				String temp = pBusP.TB1_2_1.getText().toString();
				if(!temp.matches("^[a-zA-Z]+ ?([a-zA-Z]+)?$"))
					throw new Exception();
				paramsP[2]=temp;
			}
			catch(Exception e1) {
				flag=0;
				pBusP.TB1_2_1.setText("");
				JOptionPane.showMessageDialog(pBusP, "Favor de ingresar un apellido materno valido");
			}
			// Validar Nombre
			try {
				String temp = pBusP.TB1_3_1.getText().toString();
				if(!temp.matches("^[a-zA-Z]+ ?([a-zA-Z]+)?$"))
					throw new Exception();
				paramsP[0]=temp;
			}
			catch(Exception e1) {
				flag=0;
				pBusP.TB1_3_1.setText("");
				JOptionPane.showMessageDialog(pBusP, "Favor de ingresar un nombre valido");
			}
			if(flag == 0){
				JOptionPane.showMessageDialog(pBusP, "Favor de corregir datos");
			}else{
				pac = bus.bPaciente(paramsP);
				if(pac.getId_empleado() == -1){
					JOptionPane.showMessageDialog(pBusP, "Paciente no encontrado");
				}else{
					pBusP.pResultados.removeAll();
					pBusP.pResultados.updateUI();
					pBusP.pResultados.repaint();
					pBusP.pResultados.add(new JLabel("-----------------------------Datos Generales------------------------"));
					
					pBusP.pResultados.add(new JLabel("      Apellido paterno: " 
					+ pac.getB1_1().toString()+";    Apellido materno: " + 
							pac.getB1_2().toString() + ";    Nombre(s): " 
					+ pac.getB1_3().toString()));
					
					pBusP.pResultados.add(new JLabel("      Sexo: " + pac.getB2().toString()));
					pBusP.pResultados.add(new JLabel("      Fecha de nacimiento: " + pac.getB3().toString()));
					pBusP.pResultados.add(new JLabel("      Edad: " +  String.valueOf(pac.getB4())));
					pBusP.pResultados.add(new JLabel("      Calle: " + pac.getB5_1() + 
							"   Num exterior: " + pac.getB5_2() + 
							"   Num interior: " + pac.getB5_3() +
							"   Zona: " + pac.getB5_4() + 
							"   Delegacion/Municipio: " + pac.getB5_5() +
							"   Codigo postal: " + pac.getB5_6()));
					pBusP.pResultados.add(new JLabel("      Telefono fijo: " + pac.getB6() +
							"   Celular: " + pac.getB7()));
					pBusP.pResultados.add(new JLabel("      Tiempo vivido en anios: " + String.valueOf(pac.getB8_1())+
							"   Tiempo vivido en meses: " + String.valueOf(pac.getB8_2())));
					pBusP.pResultados.add(new JLabel("      Entidad federativa: " + pac.getB9()));
					pBusP.pResultados.add(new JLabel("      Estado civil: " + pac.getB10()));
					pBusP.pResultados.add(new JLabel("      Nivel de estudios: " + opEst[pac.getB11()]));
					pBusP.pResultados.add(new JLabel("      Sabe leer: " + pac.getB12()));
					pBusP.pResultados.add(new JLabel("      Sabe escribir " + pac.getB13()));
					pBusP.pResultados.add(new JLabel("      Ocupacion actual " + opOf[pac.getB14()] + 
							"   Especifique: " + pac.getB14_1()));
					pBusP.pResultados.add(new JLabel("      Religion: " +  opRel[pac.getB15()] +
							"   Especifique: " + pac.getB15_1()));
					pBusP.pResultados.add(new JLabel("      "));
					pBusP.pResultados.add(new JLabel("      Nombre de contacto: " + pac.getC1()));
					pBusP.pResultados.add(new JLabel("      Parentesco: " + pac.getC2()));
					
					pBusP.pResultados.add(new JLabel("      Numero del familiar: " + pac.getC3()));
					pBusP.pResultados.add(new JLabel("      Observaciones: " + pac.getC4()));
					pBusP.pResultados.add(new JLabel("      "));
					
					// Tension
					if(pBusP.CB1.isSelected()){
						Tension ten = new Tension();
						ten = bus.bTension(pac.getId_paciente());
						if(ten.getId_tension() == -1){
							JOptionPane.showMessageDialog(pBusP, "Tension no encontrada");
						}else{
							pBusP.pResultados.add(new JLabel("-----------------------------Tension------------------------"));
							pBusP.pResultados.add(new JLabel("      Sistolica sentado (mmHg):  " + String.valueOf(ten.getD1())));
							pBusP.pResultados.add(new JLabel("      Diastolica sentado (mmHg): " + String.valueOf(ten.getD2())));
							pBusP.pResultados.add(new JLabel("      Sistolica parado (mmHg):   " + String.valueOf(ten.getD3())));
							pBusP.pResultados.add(new JLabel("      Diastolica parado (mmHg):  " + String.valueOf(ten.getD4())));
							pBusP.pResultados.add(new JLabel("      Frecuencia cardiaca:       " + String.valueOf(ten.getD5())));
							pBusP.pResultados.add(new JLabel("      Frecuencia resp.:          " + String.valueOf(ten.getD6())));
							pBusP.pResultados.add(new JLabel("      Glaucemia capilar:         " + String.valueOf(ten.getD7())));
							pBusP.pResultados.add(new JLabel("      SATO2:                     " + String.valueOf(ten.getD8())));
							pBusP.pResultados.add(new JLabel("      Temperatura (C):           " + String.valueOf(ten.getD9())));
							pBusP.pResultados.add(new JLabel("      "));
							
						}//if encontro tension
					}// if tension

					// Trastornos
					if(pBusP.CB2.isSelected()){
						Trastornos tra = new Trastornos();
						tra = bus.bTrastornos(pac.getId_paciente());
						if(tra.getId_trastorno() == -1){
							JOptionPane.showMessageDialog(pBusP, "Trastornos no encontradas");
						}else{
							pBusP.pResultados.add(new JLabel("-----------------------------Trastornos------------------------"));
							pBusP.pResultados.add(new JLabel("      Puntos correctos por numero: " + tra.getE0_1()));
							pBusP.pResultados.add(new JLabel("      Puntos correctos por hora:   " + tra.getE0_2()));
							pBusP.pResultados.add(new JLabel("      Punotos por objetos:         " + tra.getE1()));
							pBusP.pResultados.add(new JLabel("      Puntos por estado de Maria:  " + tra.getE2()));
							pBusP.pResultados.add(new JLabel("      Puntos totales:              " + tra.getETotal()));
							pBusP.pResultados.add(new JLabel("      "));
						}//if encontro trastorno
					}// if trastorno
					
					// Emocional
					if(pBusP.CB3.isSelected()){
						Emocional emo = new Emocional();
						emo = bus.bEmocional(pac.getId_paciente());
						if(emo.getId_emocional() == -1){
							JOptionPane.showMessageDialog(pBusP, "Emocional no encontrado");
						}else{
							pBusP.pResultados.add(new JLabel("-----------------------------Emocional------------------------"));
							pBusP.pResultados.add(new JLabel("      Sentia que no podia quitarse de encima la tristeza? " + edoEmocional(emo.getF1())));
							pBusP.pResultados.add(new JLabel("      Le costaba consetrarse en lo que estaba haciendo?   " + edoEmocional(emo.getF2())));
							pBusP.pResultados.add(new JLabel("      Se sintio deprimido/a?                              " + edoEmocional(emo.getF3())));
							pBusP.pResultados.add(new JLabel("      Le parecia que todo lo que hacia era un esfuerzo?   " + edoEmocional(emo.getF4())));
							pBusP.pResultados.add(new JLabel("      No durmio bien?                                     " + edoEmocional(emo.getF5())));
							pBusP.pResultados.add(new JLabel("      Disfruto de la vida?                                " + edoEmocional(emo.getF6())));
							pBusP.pResultados.add(new JLabel("      Se sintio triste?                                   " + edoEmocional(emo.getF7())));
							pBusP.pResultados.add(new JLabel("      Puntaje total:                                      " + emo.getFTotal()));
							pBusP.pResultados.add(new JLabel("      "));
							
						}//if encontro emocional
					}// if tension
					
					// Comorbilidad
					if(pBusP.CB4.isSelected()){
						Comorbilidad com = new Comorbilidad();
						com = bus.bComorbilidad(pac.getId_paciente());
						if(com.getId_comorbilidad() == -1){
							JOptionPane.showMessageDialog(pBusP, "Comorbilidad no encontrada");
						}else{
							pBusP.pResultados.add(new JLabel("-----------------------------Comorbilidad----------------- -------"));
							pBusP.pResultados.add(new JLabel("      Cardioplastia isquematica:             " + edoComor(com.getG1())));
							pBusP.pResultados.add(new JLabel("      Insuficiencia cardiaca congestiva:     " + edoComor(com.getG2())));
							pBusP.pResultados.add(new JLabel("      Insuficiencia vascular periferica:     " + edoComor(com.getG3())));
							pBusP.pResultados.add(new JLabel("      Enfermedad vascular cerebral:          " + edoComor(com.getG4())));
							pBusP.pResultados.add(new JLabel("      Demencia (Alzheimer):                  " + edoComor(com.getG5())));
							pBusP.pResultados.add(new JLabel("      Enfisema o bronquitis cronica:         " + edoComor(com.getG6())));
							pBusP.pResultados.add(new JLabel("      Artritis reumatoide o lupus:           " + edoComor(com.getG7())));
							pBusP.pResultados.add(new JLabel("      Gastritis o ulcera gastrica:           " + edoComor(com.getG8())));
							pBusP.pResultados.add(new JLabel("      Enfermedad hepatica leve:              " + edoComor(com.getG9())));
							pBusP.pResultados.add(new JLabel("      Diabetes sin comlicaciones:            " + edoComor(com.getG10())));
							pBusP.pResultados.add(new JLabel("      Diabetes cono complicaciones:          " + edoComor(com.getG11())));
							pBusP.pResultados.add(new JLabel("      Hemiplejia:                            " + edoComor(com.getG12())));
							pBusP.pResultados.add(new JLabel("      Insuficencia renal terminal:           " + edoComor(com.getG13())));
							pBusP.pResultados.add(new JLabel("      Cancer sin metastacis:                 " + edoComor(com.getG14())));
							pBusP.pResultados.add(new JLabel("      Leucemia                               " + edoComor(com.getG15())));
							pBusP.pResultados.add(new JLabel("      Linfoma                                " + edoComor(com.getG16())));
							pBusP.pResultados.add(new JLabel("      Enfermedad hepatica moderada o severa: " + edoComor(com.getG17())));
							pBusP.pResultados.add(new JLabel("      Sida/VIH:                              " + edoComor(com.getG18())));
							pBusP.pResultados.add(new JLabel("      Cancer con metastasis:                 " + edoComor(com.getG19())));
							pBusP.pResultados.add(new JLabel("      Puntaje total:                         " + com.getGTotal()));
							pBusP.pResultados.add(new JLabel("      "));
							
							pBusP.pResultados.add(new JLabel("      Osteoporosis:                          " + edoComor(com.getG20())));
							pBusP.pResultados.add(new JLabel("      Osteoartrosis:                         " + edoComor(com.getG21())));
							pBusP.pResultados.add(new JLabel("      Hipertension arterial sistemica:       " + edoComor(com.getG22())));
							pBusP.pResultados.add(new JLabel("      Colesterol elevado:                    " + edoComor(com.getG23())));
							pBusP.pResultados.add(new JLabel("      Enfermedad arterial periferica:        " + edoComor(com.getG24())));
							pBusP.pResultados.add(new JLabel("      Algun tipo de neuropatia:              " + edoComor(com.getG25())));
							pBusP.pResultados.add(new JLabel("      "));
							
							pBusP.pResultados.add(new JLabel("      Ha padecido alguna vez herpes zoster:  " + edoComor(com.getG26())));
							if(com.getG26_1_4() == 0){
								pBusP.pResultados.add(new JLabel("         Anio: " + com.getG26_1_1()));
								pBusP.pResultados.add(new JLabel("         Mes:  " + com.getG26_1_2()));
								pBusP.pResultados.add(new JLabel("         Dia:  " + com.getG26_1_3()));
							}
							if(com.getG26_2_1() == 0){pBusP.pResultados.add(new JLabel("      Medicamento para herpes: " + com.getG26_2()));}
							if(com.getG26_3_1() == 0){pBusP.pResultados.add(new JLabel("      Dosis para herpes:       " + com.getG26_3()));}
							if(com.getG26_4_1() == 0){pBusP.pResultados.add(new JLabel("      Psologia para herpes:    " + com.getG26_4()));}
							pBusP.pResultados.add(new JLabel("      "));
							
							if(com.getG26_5_4()==0){
								pBusP.pResultados.add(new JLabel("      Tuvo dolor posterior al herpes?: " + edoComor(com.getG26_5())));
								pBusP.pResultados.add(new JLabel("         Anio: " + com.getG26_5_1()));
								pBusP.pResultados.add(new JLabel("         Mes:  " + com.getG26_5_2()));
								pBusP.pResultados.add(new JLabel("         Dia:  " + com.getG26_5_3()));
								pBusP.pResultados.add(new JLabel("      "));	
							}							
							if(com.getG26_5_5_1() == 0){pBusP.pResultados.add(new JLabel("      Medicamento para el dolor: " + com.getG26_5_5()));}
							if(com.getG26_5_6_1() == 0){pBusP.pResultados.add(new JLabel("      Dosis para el dolor:       " + com.getG26_5_6()));}
							if(com.getG26_5_7_1() == 0){pBusP.pResultados.add(new JLabel("      Psologia para el dolor:    " + com.getG26_5_7()));}
							pBusP.pResultados.add(new JLabel("      "));
							
							if(com.getG26_5_8_4() == 0){
								pBusP.pResultados.add(new JLabel("         Anio: " + com.getG26_5_8_1()));
								pBusP.pResultados.add(new JLabel("         Mes:  " + com.getG26_5_8_2()));
								pBusP.pResultados.add(new JLabel("         Dia:  " + com.getG26_5_8_3()));
								pBusP.pResultados.add(new JLabel("      "));								
							}
							//G27
							pBusP.pResultados.add(new JLabel("      Asma:                  " + edoComor(com.getG27())));
							pBusP.pResultados.add(new JLabel("      Enfermedad autoinmune: " + edoComor(com.getG28())));
							pBusP.pResultados.add(new JLabel("      "));	
							pBusP.pResultados.add(new JLabel("      Demencia:              " + edoComor(com.getG29())));
							pBusP.pResultados.add(new JLabel("         Que tipo de demencia? " + com.getG30()));
							pBusP.pResultados.add(new JLabel("            Otra? " + com.getG30_1()));
							pBusP.pResultados.add(new JLabel("      "));	
							if(com.getG31_1()==0){pBusP.pResultados.add(new JLabel("      Algun otra enfermedad? " + com.getG31()));}
							
							pBusP.pResultados.add(new JLabel("      "));
						}//if encontro tension
					}// if tension
					
				} // if encontro paciente
			}// if entradas validas
 		}// if boton evento get source
	}// actionPerformed
	private static String edoEmocional(int Resp){
		String txt = new String();
		switch(Resp){
		case -1:
			txt = "NS/NR";
			break;
		case 0:
			txt = "0. Rara vez o nunca (menos de 1 día)";
			break;
		case 1:
			txt = "1. Pocas veces o alguna vez (1 a 2 días)";
			break;
		case 2: 
			txt = "2. Un número de veces considerable (3 a 4 días)";
			break;
		case 3:
			txt = "3. Todo el tiempo o la mayor parte del tiempo (5 a 7 días)";
			break;
		}
		return txt;
	}
	private static String edoComor(int Resp){
		String txt = new String();
		switch(Resp){
		case -1:
			txt = "NS/NR";
			break;
		case 0:
			txt = "No";
			break;
		case 1:
			txt = "Si";
			break;
		}
		return txt;
	}
} // Action listener
