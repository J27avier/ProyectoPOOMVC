package Vista;

import java.awt.*;

import javax.swing.*;

import com.toedter.calendar.JDateChooser;

import java.awt.event.*;




public class PagIngPaciente extends JFrame
{
	//Variables de pestaña 1
	public Container cp;
	public Container cp1;
	public JLabel LB1_1;
	public JLabel LB1_2;
	public JLabel LB1_3;
	public JLabel LB2;
	public JLabel LB3;
	public JLabel LB4;
	public JLabel LB5_1;
	public JLabel LB5_2;
	public JLabel LB5_3;
	public JLabel LB5_4;
	public JLabel LB5_5;
	public JLabel LB5_6;
	public JLabel LB6;
	public JLabel LB7;
	public JLabel LB8_1;
	public JLabel LB8_2;
	public JLabel LB9;
	public JLabel LB10;
	public JLabel LB11;
	public JLabel LB12;
	public JLabel LB13;
	public JLabel LB14;
	public JLabel LB14_1;
	public JLabel LB15;
	public JLabel LB15_1;
	public JLabel LC1;
	public JLabel LC2;
	public JLabel LC3;
	public JLabel LC4;
	
	public JTextField TB1_1;
	public JTextField TB1_2;
	public JTextField TB1_3;
	public JTextField TB4;
	public JTextField TB5_1;
	public JTextField TB5_2;
	public JTextField TB5_3;
	public JTextField TB5_4;
	public JTextField TB5_5;
	public JTextField TB5_6;
	public JTextField TB6;
	public JTextField TB7;
	public JTextField TB8_1;
	public JTextField TB8_2;
	public JTextField TB9;
	public JTextField TTNivEst;
	public JTextField TB14_1;
	public JTextField TB15_1;
	public JTextField TC1;
	public JTextField TC2;
	public JTextField TC3;
	public JTextField TC4;
	public final JComboBox<String> DB2;
	public final JComboBox<String> DB10;
	public final JComboBox<String> DB11;
	public final JComboBox<String> DB12;
	public final JComboBox<String> DB13;
	public final JComboBox<String> DB14;
	public final JComboBox<String> DB15;
	
	public JDateChooser DCB3;
	
	//Vriables de pestaña 2
	
	public JLabel LD1;
	public JLabel LD2;
	public JLabel LD3;
	public JLabel LD4;
	public JLabel LD5;
	public JLabel LD6;
	public JLabel LD7;
	public JLabel LD8;
	public JLabel LD9;
	
	public JTextField TD1;
	public JTextField TD2;
	public JTextField TD3;
	public JTextField TD4;
	public JTextField TD5;
	public JTextField TD6;
	public JTextField TD7;
	public JTextField TD8;
	public JTextField TD9;
	
	//variables de pestana 3
	public JLabel LE0_1;
	public JLabel LE0_2;
	public JLabel LE1;
	public JLabel LE2;
	public JLabel LETotal;
	public JLabel LETotalResp;
	
    public JRadioButton RBE0_1_1;
    public JRadioButton RBE0_1_2;
    public JRadioButton RBE0_2_1;
    public JRadioButton RBE0_2_2;
    public JRadioButton RBE2_1;
    public JRadioButton RBE2_2;
    
    public ButtonGroup BGE0_1;
    public ButtonGroup BGE0_2;
    public ButtonGroup BGE2;
    
    public JCheckBox CBE1_1, CBE1_2, CBE1_3, CBE1_4, CBE1_5;
    
    //variables de pestana 4
    
    public JLabel LF1;
    public JLabel LF2;
    public JLabel LF3;
    public JLabel LF4;
    public JLabel LF5;
    public JLabel LF6;
    public JLabel LF7;
    public JLabel LFTotal;
    public JLabel LFTotalResp;
    
    public JRadioButton RBF1_1;
    public JRadioButton RBF1_2;
    public JRadioButton RBF1_3;
    public JRadioButton RBF1_4;
    public JRadioButton RBF1_5;
    public JRadioButton RBF2_1, RBF2_2, RBF2_3, RBF2_4, RBF2_5;
    public JRadioButton RBF3_1, RBF3_2, RBF3_3, RBF3_4, RBF3_5;
    public JRadioButton RBF4_1, RBF4_2, RBF4_3, RBF4_4, RBF4_5;
    public JRadioButton RBF5_1, RBF5_2, RBF5_3, RBF5_4, RBF5_5;
    public JRadioButton RBF6_1, RBF6_2, RBF6_3, RBF6_4, RBF6_5;
    public JRadioButton RBF7_1, RBF7_2, RBF7_3, RBF7_4, RBF7_5;   
    
    public ButtonGroup BGF1,BGF2,BGF3,BGF4,BGF5,BGF6,BGF7;
    
    //variables de pestana 5
	
	public JLabel LG1,LG2,LG3,LG4,LG5,LG6,LG7,LG8,LG9,LG10,LG11,LG12,LG13,LG14,LG15,LG16,LG17,LG18,LG19;
	
	public JRadioButton RBG1_1,RBG1_2,RBG1_3,RBG2_1,RBG2_2,RBG2_3,RBG3_1,RBG3_2,RBG3_3,RBG4_1,RBG4_2,RBG4_3,RBG5_1,RBG5_2,RBG5_3,RBG6_1,RBG6_2,RBG6_3,RBG7_1,RBG7_2,RBG7_3,RBG8_1,RBG8_2,RBG8_3,RBG9_1,RBG9_2,RBG9_3,RBG10_1,RBG10_2,RBG10_3,RBG11_1,RBG11_2,RBG11_3,RBG12_1,RBG12_2,RBG12_3,RBG13_1,RBG13_2,RBG13_3,RBG14_1,RBG14_2,RBG14_3,RBG15_1,RBG15_2,RBG15_3,RBG16_1,RBG16_2,RBG16_3,RBG17_1,RBG17_2,RBG17_3,RBG18_1,RBG18_2,RBG18_3,RBG19_1,RBG19_2,RBG19_3;
	
	public ButtonGroup BGG1,BGG2,BGG3,BGG4,BGG5,BGG6,BGG7,BGG8,BGG9,BGG10,BGG11,BGG12,BGG13,BGG14,BGG15,BGG16,BGG17,BGG18,BGG19;
	
	public JDateChooser dateChooser1;
	
	//pestania 6
	
	public JButton ingresar1;
	public JLabel LNombre_1,LAPaterno_1,LAMaterno_1;
	public JTextField TNombre_1,TAPaterno_1,TAMaterno_1;
	
	public PagIngPaciente()
	{
		super("Dar de alta un paciente");
		setSize(1300,800);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(true);


		JPanel menuPrincipal = new JPanel();
		menuPrincipal.setLayout(null);

//Se generan las panel que permite pestañas
		JTabbedPane pestana=new JTabbedPane();
		//PESTAÃA 1
				JPanel p1=new JPanel();

				//Se crea el panel que estara dentro del Scroll
				p1.setLayout(null);
				
				LB1_1 = new JLabel("Nombre(s):");
				LB1_1.setBounds(30,10,200,25);
				p1.add(LB1_1);
				//Apellidos
				LB1_2 = new JLabel("Apellido Pat:");
				LB1_2.setBounds(30,40,200,25);
				p1.add(LB1_2);
				LB1_3 = new JLabel("Apellido Mat:");
				LB1_3.setBounds(30,70,200,25);
				p1.add(LB1_3);
				//Sexo
				LB2 = new JLabel("Sexo:");
				LB2.setBounds(30,100,200,25);
				p1.add(LB2);
				//fechas
				LB3 = new JLabel("Fecha de Nac:");
				LB3.setBounds(30,130,200,25);
				p1.add(LB3);
				
				LB4 = new JLabel("Edad:");
				LB4.setBounds(30,160,200,25);
				p1.add(LB4);
				
				LB5_1 = new JLabel("Calle:");
				LB5_1.setBounds(30,190,200,25);
				p1.add(LB5_1);
				
				LB5_2 = new JLabel("Num. Exterior:");
				LB5_2.setBounds(30,220,200,25);
				p1.add(LB5_2);
				
				LB5_3 = new JLabel("Num. Interior:");
				LB5_3.setBounds(30,250,200,25);
				p1.add(LB5_3);
				
				LB5_4 = new JLabel("Zona:");
				LB5_4.setBounds(30,280,200,25);
				p1.add(LB5_4);
				
				LB5_5 = new JLabel("Delegacion/Municipio:");
				LB5_5.setBounds(30,310,200,25);
				p1.add(LB5_5);
				
				LB5_6 = new JLabel("Codigo Postal:");
				LB5_6.setBounds(30,340,200,25);
				p1.add(LB5_6);
				
				LB6 = new JLabel("Telefono Fijo:");
				LB6.setBounds(30,370,200,25);
				p1.add(LB6);
				
				LB7 = new JLabel("Telefono Celular:");
				LB7.setBounds(30,400,200,25);
				p1.add(LB7);
				
				LB8_1 = new JLabel("Tiempo vivido en anios:");
				LB8_1.setBounds(500,10,200,25);
				p1.add(LB8_1);
				
				LB8_2 = new JLabel ("Tiempo vivido en meses:");
				LB8_2.setBounds(500,40,200,25);
				p1.add(LB8_2);
				
				LB9 = new JLabel("Edo./Entidad federativa de origen:");
				LB9.setBounds(500,70,200,25);
				p1.add(LB9);
				
				LB10 = new JLabel("Estado Civil:");
				LB10.setBounds(500,100,200,25);
				p1.add(LB10);
				
				LB11 = new JLabel("Nivel de estudios:");
				LB11.setBounds(500,130,200,25);
				p1.add(LB11);
				
				LB12 = new JLabel("Sabe leer:");
				LB12.setBounds(500,160,200,25);
				p1.add(LB12);
				
				LB13 = new JLabel("Sabe Escribir:");
				LB13.setBounds(500,190,200,25);
				p1.add(LB13);
				
				LB14 = new JLabel("¿A que se dedica?:");
				LB14.setBounds(500,220,200,25);
				p1.add(LB14);
				
				LB14_1 = new JLabel("Especifique:");
				LB14_1.setBounds(500,250,200,25);
				p1.add(LB14_1);
				
				LB15 = new JLabel("Religion:");
				LB15.setBounds(500,280,200,25);
				p1.add(LB15);
				
				LB15_1 = new JLabel("Especifique:");
				LB15_1.setBounds(500,310,200,25);
				p1.add(LB15_1);
				
				LC1 = new JLabel("Nombre de algun contacto:");
				LC1.setBounds(500,340,200,25);
				p1.add(LC1);
				
				LC2 = new JLabel("Parentesco:");
				LC2.setBounds(500,370,200,25);
				p1.add(LC2);
				
				LC3 = new JLabel("Numero del familiar:");
				LC3.setBounds(500,400,200,25);
				p1.add(LC3);
				
				LC4 = new JLabel("Observaciones:");
				LC4.setBounds(500,430,200,25);
				p1.add(LC4);
				
				
				//agregando campos de llenado.
				TB1_1=new JTextField();
				TB1_1.setBounds(250,10,200,25);
				p1.add(TB1_1);
				
				TB1_2 = new JTextField();
				TB1_2.setBounds(250,40,200,25);
				p1.add(TB1_2);
				
				TB1_3 = new JTextField();
				TB1_3.setBounds(250,70,200,25);
				p1.add(TB1_3);
				
				String[] opSexo = {"hombre","mujer"};
			    DB2 = new JComboBox<String>(opSexo);
			    DB2.setBounds(250,100,200,25);
			    p1.add(DB2);
			    
			    DCB3 = new JDateChooser("yyyy-MM-dd","####-##-##",'_');
			    DCB3.setBounds(250,130,200,25);
			    p1.add(DCB3);
				
				TB4 = new JTextField();
				TB4.setBounds(250,160,200,25);
				p1.add(TB4);
				
				TB5_1 = new JTextField();
				TB5_1.setBounds(250,190,200,25);
				p1.add(TB5_1);
				
				TB5_2 = new JTextField();
				TB5_2.setBounds(250,220,200,25);
				p1.add(TB5_2);
				
				TB5_3 = new JTextField();
				TB5_3.setBounds(250,250,200,25);
				p1.add(TB5_3);
				
				TB5_4= new JTextField();
				TB5_4.setBounds(250,280,200,25);
				p1.add(TB5_4);
				
				TB5_5 = new JTextField();
				TB5_5.setBounds(250,310,200,25);
				p1.add(TB5_5);
				
				TB5_6 = new JTextField();
				TB5_6.setBounds(250,340,200,25);
				p1.add(TB5_6);
				
				TB6 = new JTextField();
				TB6.setBounds(250,370,200,25);
				p1.add(TB6);
				
				TB7 = new JTextField();
				TB7.setBounds(250,400,200,25);
				p1.add(TB7);
				
				TB8_1 = new JTextField();
				TB8_1.setBounds(720,10,200,25);
				p1.add(TB8_1);
				
				TB8_2 = new JTextField();
				TB8_2.setBounds(720,40,200,25);
				p1.add(TB8_2);
				
				TB9 = new JTextField();
				TB9.setBounds(720,70,200,25);
				p1.add(TB9);
				
				String[] DB10t = {"casado","union libre","soltero","separado","divorciado","viudo","no sabe"};
			    DB10 = new JComboBox<String>(DB10t);
			    DB10.setBounds(720,100,200,25);
			    p1.add(DB10);
			    
			    String[] opEst = {"0_No estudio","1_Primaria 1","2_Primaria 2","3_Primaria 3","4_Primaria 4","5_Primaria 5","6_Primaria 6","7_Secundaria 1","8_Secundaria 2","9_Secundaria 3","10_Preparatoria 1","11_Preparatoria 2","12_Preparatoria 3","13_Lic 1","14_Lic 2","15_Lic 3","16_Lic 4","17_Lic5","18_Lic6","19_Pos 1","20_Pos 2","21_Pos 3","22_Pos 4","23_Pos 5","24_Pod 6","25_Pos >"};
			    DB11 = new JComboBox<String>(opEst);
			    DB11.setBounds(720,130,200,25);
			    p1.add(DB11);
				
			    String[] opLee = {"si","no"};
			    DB12 = new JComboBox<String>(opLee);
			    DB12.setBounds(720,160,200,25);
			    p1.add(DB12);
			    
			    String[] opEsc = {"si","no"};
			    DB13= new JComboBox<String>(opEsc);
			    DB13.setBounds(720,190,200,25);
			    p1.add(DB13);
			    
			    String[] opOf = {"0_Desempleado","1_Jibulado(a) sin pension","2_Jubilado(a) con pension","3_Comercio informal","4_Jornalero(a)/Campesino","5_Obrero(a)","6_Empleado(a) de oficina","7_Profesionista independiente","8_Patron, jefe o empresario(a)","9_Ama de casa","10_Inactivo","11_Otra"};
			    DB14 = new JComboBox<String>(opOf);
			    DB14.setBounds(720,220,200,25);
			    p1.add(DB14);
			    
			    
				TB14_1 = new JTextField();
				TB14_1.setBounds(720,250,200,25);
				p1.add(TB14_1);
				
				String[] opRel = {"0_Ninguna","1_Catolica","2_Cristiana","3_Judio","4_Testigo de Jehova","5_Musulman","6_Otra"};
			    DB15 = new JComboBox<String>(opRel);
			    DB15.setBounds(720,280,200,25);
			    p1.add(DB15);
				
				
				TB15_1 = new JTextField();
				TB15_1.setBounds(720,310,200,25);
				p1.add(TB15_1);
				
				TC1 = new JTextField();
				TC1.setBounds(720,340,200,25);
				p1.add(TC1);
				
				TC2 = new JTextField();
				TC2.setBounds(720,370,200,25);
				p1.add(TC2);
				
				TC3 = new JTextField();
				TC3.setBounds(720,400,200,25);
				p1.add(TC3);
				
				TC4 = new JTextField();
				TC4.setBounds(720,430,400,25);
				p1.add(TC4);

				
				cp1= getContentPane();
				cp1.add(p1);
				
				
///////////////////////////////////////
///////////////////////////////////////
////////////PESTANIA 2 ////////////////
///////////////////////////////////////

JPanel p2=new JPanel();
p2.setLayout(null);

LD1 = new JLabel("Sistolica sentado");
LD1.setBounds(30,10,200,25);
p2.add(LD1);

LD2 = new JLabel("Diastolica sentado (mmHg)");
LD2.setBounds(30,40,200,25);
p2.add(LD2);

LD3 = new JLabel("Sistolica parado");
LD3.setBounds(30,70,200,25);
p2.add(LD3);

LD4 = new JLabel("Diastolica parado (mmHg)");
LD4.setBounds(30,100,200,25);
p2.add(LD4);

LD5 = new JLabel("Frec. Cardiaca");
LD5.setBounds(30,130,200,25);
p2.add(LD5);

LD6 = new JLabel("Frec. Respiratoria");
LD6.setBounds(30,160,200,25);
p2.add(LD6);


LD7 = new JLabel("Glucemia capilar");
LD7.setBounds(30,190,200,25);
p2.add(LD7);

LD8 = new JLabel("SATO 2%");
LD8.setBounds(30,220,200,25);
p2.add(LD8);

LD9 = new JLabel("Temperatura (°C)");
LD9.setBounds(30,250,200,25);
p2.add(LD9);

TD1 = new JTextField();
TD1.setBounds(250,10,200,25);
p2.add(TD1);

TD2 = new JTextField();
TD2.setBounds(250,40,200,25);
p2.add(TD2);

TD3 = new JTextField();
TD3.setBounds(250,700,200,25);
p2.add(TD3);

TD3 = new JTextField();
TD3.setBounds(250,70,200,25);
p2.add(TD3);

TD4 = new JTextField();
TD4.setBounds(250,100,200,25);
p2.add(TD4);

TD5 = new JTextField();
TD5.setBounds(250,130,200,25);
p2.add(TD5);

TD6 = new JTextField();
TD6.setBounds(250,160,200,25);
p2.add(TD6);

TD7 = new JTextField();
TD7.setBounds(250,190,200,25);
p2.add(TD7);

TD8 = new JTextField();
TD8.setBounds(250,220,200,25);
p2.add(TD8);

TD9 = new JTextField();
TD9.setBounds(250,250,200,25);
p2.add(TD9);


///////////////////////////////////////
///////////////////////////////////////
////////////PESTANIA 3 ////////////////
///////////////////////////////////////
JPanel p3=new JPanel();
p3.setLayout(null);

LE0_1 = new JLabel("Puntos por numeros correctos:");
LE0_1.setBounds(30,10,200,25);
p3.add(LE0_1);

LE0_2 = new JLabel("Puntos por hora correcta:");
LE0_2.setBounds(30,40,200,25);
p3.add(LE0_2);

LE1 = new JLabel("Objetos que logro recordar:");
LE1.setBounds(30,70,200,25);
p3.add(LE1);

LE2 = new JLabel("¿Contesto en que estado vive Maria?");
LE2.setBounds(30,100,200,25);
p3.add(LE2);

//Variables de respuesta de pestaña 3
RBE0_1_1 = new JRadioButton("2 puntos");
RBE0_1_1.setBounds(250,10,100,25);
RBE0_1_2 = new JRadioButton("0 puntos");
RBE0_1_2.setBounds(350,10,100,25);
BGE0_1 = new ButtonGroup();
BGE0_1.add(RBE0_1_1);
BGE0_1.add(RBE0_1_2);
p3.add(RBE0_1_1);
p3.add(RBE0_1_2);

RBE0_2_1 = new JRadioButton("2 puntos");
RBE0_2_1.setBounds(250,40,100,25);
RBE0_2_2 = new JRadioButton("0 puntos");
RBE0_2_2.setBounds(350,40,100,25);
BGE0_2 = new ButtonGroup();
BGE0_2.add(RBE0_2_1);
BGE0_2.add(RBE0_2_2);
p3.add(RBE0_2_1);
p3.add(RBE0_2_2);

CBE1_1 = new JCheckBox("manzana");
CBE1_1.setBounds(250,70,100,25);
CBE1_2 = new JCheckBox("pluma");
CBE1_2.setBounds(350,70,100,25);
CBE1_3 = new JCheckBox("corbata");
CBE1_3.setBounds(450,70,100,25);
CBE1_4 = new JCheckBox("casa");
CBE1_4.setBounds(550,70,100,25);
CBE1_5 = new JCheckBox("coche");
CBE1_5.setBounds(650,70,100,25);
p3.add(CBE1_1);
p3.add(CBE1_2);
p3.add(CBE1_3);
p3.add(CBE1_4);
p3.add(CBE1_5);

RBE2_1 = new JRadioButton("1 punto");
RBE2_1.setBounds(250,100,100,25);
RBE2_2 = new JRadioButton("0 puntos");
RBE2_2.setBounds(350,100,100,25);
BGE2 = new ButtonGroup();
BGE2.add(RBE2_1);
BGE2.add(RBE2_2);
p3.add(RBE2_1);
p3.add(RBE2_2);

LETotal= new JLabel("Resultado :");
LETotal.setBounds(30,130,200,25);
p3.add(LETotal);

LETotalResp= new JLabel("(Resultado aqui)");
LETotalResp.setBounds(250,130,200,25);
p3.add(LETotalResp);

///////////////////////////////////////
///////////////////////////////////////
////////////PESTANIA 4 ////////////////
///////////////////////////////////////
JPanel p4=new JPanel();
p4.setLayout(null);

LF1 = new JLabel("¿Sentia como si no pudiera quitarse de encima la tristeza?");
LF1.setBounds(30,10,500,25);
LF1.setForeground(Color.RED);
p4.add(LF1);

LF2 = new JLabel("¿Le costaba concentrarse en lo que estaba haciendo?");
LF2.setBounds(30,70,500,25);
LF2.setForeground(Color.RED);
p4.add(LF2);

LF3 = new JLabel("¿Se sintio deprimido(a)?");
LF3.setBounds(30,130,500,25);
LF3.setForeground(Color.RED);
p4.add(LF3);

LF4 = new JLabel("¿Le parecia que todo lo que hacia era un esfuerzo?");
LF4.setBounds(30,190,500,25);
LF4.setForeground(Color.RED);
p4.add(LF4);

LF5 = new JLabel("¿No durmio bien?");
LF5.setBounds(30,250,500,25);
LF5.setForeground(Color.RED);
p4.add(LF5);

LF6 = new JLabel("¿Disfruto de la vida?");
LF6.setBounds(30,310,500,25);
LF6.setForeground(Color.RED);
p4.add(LF6);

LF7 = new JLabel("¿Se sintio triste?");
LF7.setBounds(30,370,500,25);
LF7.setForeground(Color.RED);
p4.add(LF7);

LFTotal = new JLabel("Total= ");
LFTotal.setBounds(30,430,100,25);
p4.add(LFTotal);

LFTotalResp = new JLabel("(Respuesta aqui) ");
LFTotalResp.setBounds(150,430,100,25);
p4.add(LFTotalResp);

RBF1_1 = new JRadioButton("0. Rara vez o nunca (menos de 1 dia)");
RBF1_1.setBounds(5,40,250,25);
RBF1_2 = new JRadioButton("1. Pocas veces o alguna vez(1 a 2 dias)");
RBF1_2.setBounds(260,40,250,25);
RBF1_3 = new JRadioButton("2. Un numero de veces considerable (3 a 4 dias)");
RBF1_3.setBounds(515,40,300,25);
RBF1_4 = new JRadioButton("3. Todo el tiempo o la mayor parte del tiempo (5 a 7 dias)");
RBF1_4.setBounds(820,40,350,25);
RBF1_5 = new JRadioButton("-1. NS/NR");
RBF1_5.setBounds(1170,40,100,25);
BGF1 = new ButtonGroup();
BGF1.add(RBF1_1);
BGF1.add(RBF1_2);
BGF1.add(RBF1_3);
BGF1.add(RBF1_4);
BGF1.add(RBF1_5);
p4.add(RBF1_1);
p4.add(RBF1_2);
p4.add(RBF1_3);
p4.add(RBF1_4);
p4.add(RBF1_5);

RBF2_1 = new JRadioButton("0. Rara vez o nunca (menos de 1 dia)");
RBF2_1.setBounds(5,100,250,25);
RBF2_2 = new JRadioButton("1. Pocas veces o alguna vez(1 a 2 dias)");
RBF2_2.setBounds(260,100,250,25);
RBF2_3 = new JRadioButton("2. Un numero de veces considerable (3 a 4 dias)");
RBF2_3.setBounds(515,100,300,25);
RBF2_4 = new JRadioButton("3. Todo el tiempo o la mayor parte del tiempo (5 a 7 dias)");
RBF2_4.setBounds(820,100,350,25);
RBF2_5 = new JRadioButton("-1. NS/NR");
RBF2_5.setBounds(1170,100,100,25);
BGF2 = new ButtonGroup();
BGF2.add(RBF2_1);
BGF2.add(RBF2_2);
BGF2.add(RBF2_3);
BGF2.add(RBF2_4);
BGF2.add(RBF2_5);
p4.add(RBF2_1);
p4.add(RBF2_2);
p4.add(RBF2_3);
p4.add(RBF2_4);
p4.add(RBF2_5);

RBF3_1 = new JRadioButton("0. Rara vez o nunca (menos de 1 dia)");
RBF3_1.setBounds(5,160,250,25);
RBF3_2 = new JRadioButton("1. Pocas veces o alguna vez(1 a 2 dias)");
RBF3_2.setBounds(260,160,250,25);
RBF3_3 = new JRadioButton("2. Un numero de veces considerable (3 a 4 dias)");
RBF3_3.setBounds(515,160,300,25);
RBF3_4 = new JRadioButton("3. Todo el tiempo o la mayor parte del tiempo (5 a 7 dias)");
RBF3_4.setBounds(820,160,350,25);
RBF3_5 = new JRadioButton("-1. NS/NR");
RBF3_5.setBounds(1170,160,100,25);
BGF3 = new ButtonGroup();
BGF3.add(RBF3_1);
BGF3.add(RBF3_2);
BGF3.add(RBF3_3);
BGF3.add(RBF3_4);
BGF3.add(RBF3_5);
p4.add(RBF3_1);
p4.add(RBF3_2);
p4.add(RBF3_3);
p4.add(RBF3_4);
p4.add(RBF3_5);

RBF4_1 = new JRadioButton("0. Rara vez o nunca (menos de 1 dia)");
RBF4_1.setBounds(5,220,250,25);
RBF4_2 = new JRadioButton("1. Pocas veces o alguna vez(1 a 2 dias)");
RBF4_2.setBounds(260,220,250,25);
RBF4_3 = new JRadioButton("2. Un numero de veces considerable (3 a 4 dias)");
RBF4_3.setBounds(515,220,300,25);
RBF4_4 = new JRadioButton("3. Todo el tiempo o la mayor parte del tiempo (5 a 7 dias)");
RBF4_4.setBounds(820,220,350,25);
RBF4_5 = new JRadioButton("-1. NS/NR");
RBF4_5.setBounds(1170,220,100,25);
BGF4 = new ButtonGroup();
BGF4.add(RBF4_1);
BGF4.add(RBF4_2);
BGF4.add(RBF4_3);
BGF4.add(RBF4_4);
BGF4.add(RBF4_5);
p4.add(RBF4_1);
p4.add(RBF4_2);
p4.add(RBF4_3);
p4.add(RBF4_4);
p4.add(RBF4_5);

RBF5_1 = new JRadioButton("0. Rara vez o nunca (menos de 1 dia)");
RBF5_1.setBounds(5,280,250,25);
RBF5_2 = new JRadioButton("1. Pocas veces o alguna vez(1 a 2 dias)");
RBF5_2.setBounds(260,280,250,25);
RBF5_3 = new JRadioButton("2. Un numero de veces considerable (3 a 4 dias)");
RBF5_3.setBounds(515,280,300,25);
RBF5_4 = new JRadioButton("3. Todo el tiempo o la mayor parte del tiempo (5 a 7 dias)");
RBF5_4.setBounds(820,280,350,25);
RBF5_5 = new JRadioButton("-1. NS/NR");
RBF5_5.setBounds(1170,280,100,25);
BGF5 = new ButtonGroup();
BGF5.add(RBF5_1);
BGF5.add(RBF5_2);
BGF5.add(RBF5_3);
BGF5.add(RBF5_4);
BGF5.add(RBF5_5);
p4.add(RBF5_1);
p4.add(RBF5_2);
p4.add(RBF5_3);
p4.add(RBF5_4);
p4.add(RBF5_5);

RBF6_1 = new JRadioButton("0. Rara vez o nunca (menos de 1 dia)");
RBF6_1.setBounds(5,340,250,25);
RBF6_2 = new JRadioButton("1. Pocas veces o alguna vez(1 a 2 dias)");
RBF6_2.setBounds(260,340,250,25);
RBF6_3 = new JRadioButton("2. Un numero de veces considerable (3 a 4 dias)");
RBF6_3.setBounds(515,340,300,25);
RBF6_4 = new JRadioButton("3. Todo el tiempo o la mayor parte del tiempo (5 a 7 dias)");
RBF6_4.setBounds(820,340,350,25);
RBF6_5 = new JRadioButton("-1. NS/NR");
RBF6_5.setBounds(1170,340,100,25);
BGF6 = new ButtonGroup();
BGF6.add(RBF6_1);
BGF6.add(RBF6_2);
BGF6.add(RBF6_3);
BGF6.add(RBF6_4);
BGF6.add(RBF6_5);
p4.add(RBF6_1);
p4.add(RBF6_2);
p4.add(RBF6_3);
p4.add(RBF6_4);
p4.add(RBF6_5);

RBF7_1 = new JRadioButton("0. Rara vez o nunca (menos de 1 dia)");
RBF7_1.setBounds(5,400,250,25);
RBF7_2 = new JRadioButton("1. Pocas veces o alguna vez(1 a 2 dias)");
RBF7_2.setBounds(260,400,250,25);
RBF7_3 = new JRadioButton("2. Un numero de veces considerable (3 a 4 dias)");
RBF7_3.setBounds(515,400,300,25);
RBF7_4 = new JRadioButton("3. Todo el tiempo o la mayor parte del tiempo (5 a 7 dias)");
RBF7_4.setBounds(820,400,350,25);
RBF7_5 = new JRadioButton("-1. NS/NR");
RBF7_5.setBounds(1170,400,100,25);
BGF7 = new ButtonGroup();
BGF7.add(RBF7_1);
BGF7.add(RBF7_2);
BGF7.add(RBF7_3);
BGF7.add(RBF7_4);
BGF7.add(RBF7_5);
p4.add(RBF7_1);
p4.add(RBF7_2);
p4.add(RBF7_3);
p4.add(RBF7_4);
p4.add(RBF7_5);

		
///////////////////////////////////////
///////////////////////////////////////
////////////PESTANIA 5 ////////////////
///////////////////////////////////////
		JPanel p5=new JPanel();
		p5.setLayout(new BoxLayout(p5,BoxLayout.Y_AXIS));
		

		
		LG1= new JLabel("Cardiopatia isquemico (Angina de pecho, preinfarto, infarto)");
		p5.add(LG1);
		RBG1_1 = new JRadioButton("0.No");
		RBG1_2 = new JRadioButton("1.Si");
		RBG1_3 = new JRadioButton("-1. NS/NR");
		BGG1 = new ButtonGroup();
		BGG1.add(RBG1_1);
		BGG1.add(RBG1_2);
		BGG1.add(RBG1_3);
		p5.add(RBG1_1);
		p5.add(RBG1_2);
		p5.add(RBG1_3);
		
		
		LG2 = new JLabel("Insuficiencia cardiaca congestiva (agua en el pulmon, no bombea suficiente agua)");
		p5.add(LG2);
		RBG2_1 = new JRadioButton("0.No");
		RBG2_2 = new JRadioButton("1.Si");
		RBG2_3 = new JRadioButton("-1. NS/NR");
		BGG2 = new ButtonGroup();
		BGG2.add(RBG2_1);
		BGG2.add(RBG2_2);
		BGG2.add(RBG2_3);
		p5.add(RBG2_1);
		p5.add(RBG2_2);
		p5.add(RBG2_3);
		
		LG3 = new JLabel("Insuficiencia vascular periferica (Varices, vasos sanguineos obstruidos)");
		p5.add(LG3);
		RBG3_1 = new JRadioButton("0.No");
		RBG3_2 = new JRadioButton("1.Si");
		RBG3_3 = new JRadioButton("-1. NS/NR");
		BGG3 = new ButtonGroup();
		BGG3.add(RBG3_1);
		BGG3.add(RBG3_2);
		BGG3.add(RBG3_3);
		p5.add(RBG3_1);
		p5.add(RBG3_2);
		p5.add(RBG3_3);
		
		LG4 = new JLabel("Enfermedad vascular cerebral (Embolia, derrame o infarto cerebral)");
		p5.add(LG4);
		RBG4_1 = new JRadioButton("0.No");
		RBG4_2 = new JRadioButton("1.Si");
		RBG4_3 = new JRadioButton("-1. NS/NR");
		BGG4 = new ButtonGroup();
		BGG4.add(RBG4_1);
		BGG4.add(RBG4_2);
		BGG4.add(RBG4_3);
		p5.add(RBG4_1);
		p5.add(RBG4_2);
		p5.add(RBG4_3);
		
		LG5 = new JLabel("Demencia (Alzheimer)");
		p5.add(LG5);
		RBG5_1 = new JRadioButton("0.No");
		RBG5_2 = new JRadioButton("1.Si");
		RBG5_3 = new JRadioButton("-1. NS/NR");
		BGG5 = new ButtonGroup();
		BGG5.add(RBG5_1);
		BGG5.add(RBG5_2);
		BGG5.add(RBG5_3);
		p5.add(RBG5_1);
		p5.add(RBG5_2);
		p5.add(RBG5_3);
		
		LG6 = new JLabel("Enfisema o bronquitis cronica (EPOC)");
		p5.add(LG6);
		RBG6_1 = new JRadioButton("0.No");
		RBG6_2 = new JRadioButton("1.Si");
		RBG6_3 = new JRadioButton("-1. NS/NR");
		BGG6 = new ButtonGroup();
		BGG6.add(RBG6_1);
		BGG6.add(RBG6_2);
		BGG6.add(RBG6_3);
		p5.add(RBG6_1);
		p5.add(RBG6_2);
		p5.add(RBG6_3);
		
		LG7 = new JLabel("Artritis reumatoide o lupus");
		p5.add(LG7);
		RBG7_1 = new JRadioButton("0.No");
		RBG7_2 = new JRadioButton("1.Si");
		RBG7_3 = new JRadioButton("-1. NS/NR");
		BGG7 = new ButtonGroup();
		BGG7.add(RBG7_1);
		BGG7.add(RBG7_2);
		BGG7.add(RBG7_3);
		p5.add(RBG7_1);
		p5.add(RBG7_2);
		p5.add(RBG7_3);
		
		LG8= new JLabel("Gastritis o ulcera gastrica");
		p5.add(LG8);
		RBG8_1 = new JRadioButton("0.No");
		RBG8_2 = new JRadioButton("1.Si");
		RBG8_3 = new JRadioButton("-1. NS/NR");
		BGG8 = new ButtonGroup();
		BGG8.add(RBG8_1);
		BGG8.add(RBG8_2);
		BGG8.add(RBG8_3);
		p5.add(RBG8_1);
		p5.add(RBG8_2);
		p5.add(RBG8_3);
		
		LG9 = new JLabel("Enfermedad hepatica leve (Cirrosis sin hipertension portal)");
		p5.add(LG9);
		RBG9_1 = new JRadioButton("0.No");
		RBG9_2 = new JRadioButton("1.Si");
		RBG9_3 = new JRadioButton("-1. NS/NR");
		BGG9 = new ButtonGroup();
		BGG9.add(RBG9_1);
		BGG9.add(RBG9_2);
		BGG9.add(RBG9_3);
		p5.add(RBG9_1);
		p5.add(RBG9_2);
		p5.add(RBG9_3);
		
		LG10 = new JLabel("Diabetes sin complicaciones");
		p5.add(LG10);
		RBG10_1 = new JRadioButton("0.No");
		RBG10_2 = new JRadioButton("1.Si");
		RBG10_3 = new JRadioButton("-1. NS/NR");
		BGG10 = new ButtonGroup();
		BGG10.add(RBG10_1);
		BGG10.add(RBG10_2);
		BGG10.add(RBG10_3);
		p5.add(RBG10_1);
		p5.add(RBG10_2);
		p5.add(RBG10_3);
		
		LG11 = new JLabel("Diabetes con complicaciones (Retinopatia, enfermedad renal, amputacion)");
		p5.add(LG11);
		RBG11_1 = new JRadioButton("0.No");
		RBG11_2 = new JRadioButton("1.Si");
		RBG11_3 = new JRadioButton("-1. NS/NR");
		BGG11 = new ButtonGroup();
		BGG11.add(RBG11_1);
		BGG11.add(RBG11_2);
		BGG11.add(RBG11_3);
		p5.add(RBG11_1);
		p5.add(RBG11_2);
		p5.add(RBG11_3);
		
		LG12 = new JLabel("Hemiplejia (paralisis parcial)");
		p5.add(LG12);
		RBG12_1 = new JRadioButton("0.No");
		RBG12_2 = new JRadioButton("1.Si");
		RBG12_3 = new JRadioButton("-1. NS/NR");
		BGG12 = new ButtonGroup();
		BGG12.add(RBG12_1);
		BGG12.add(RBG12_2);
		BGG12.add(RBG12_3);
		p5.add(RBG12_1);
		p5.add(RBG12_2);
		p5.add(RBG12_3);
		
		LG13 = new JLabel("Insuficiencia rena terminal con sustitucion (dialisis peritoneal o hemodialisis");
		p5.add(LG13);
		RBG13_1 = new JRadioButton("0.No");
		RBG13_2 = new JRadioButton("1.Si");
		RBG13_3 = new JRadioButton("-1. NS/NR");
		BGG13 = new ButtonGroup();
		BGG13.add(RBG13_1);
		BGG13.add(RBG13_2);
		BGG13.add(RBG13_3);
		p5.add(RBG13_1);
		p5.add(RBG13_2);
		p5.add(RBG13_3);
		
		LG14 = new JLabel("Cancer sin metastasis");
		p5.add(LG14);
		RBG14_1 = new JRadioButton("0.No");
		RBG14_2 = new JRadioButton("1.Si");
		RBG14_3 = new JRadioButton("-1. NS/NR");
		BGG14 = new ButtonGroup();
		BGG14.add(RBG14_1);
		BGG14.add(RBG14_2);
		BGG14.add(RBG14_3);
		p5.add(RBG14_1);
		p5.add(RBG14_2);
		p5.add(RBG14_3);
		
		LG15 = new JLabel("Leucemia");
		p5.add(LG15);
		RBG15_1 = new JRadioButton("0.No");
		RBG15_2 = new JRadioButton("1.Si");
		RBG15_3 = new JRadioButton("-1. NS/NR");
		BGG15 = new ButtonGroup();
		BGG15.add(RBG15_1);
		BGG15.add(RBG15_2);
		BGG15.add(RBG15_3);
		p5.add(RBG15_1);
		p5.add(RBG15_2);
		p5.add(RBG15_3);
		
		LG16 = new JLabel("Linfoma");
		p5.add(LG16);
		RBG16_1 = new JRadioButton("0.No");
		RBG16_2 = new JRadioButton("1.Si");
		RBG16_3 = new JRadioButton("-1. NS/NR");
		BGG16 = new ButtonGroup();
		BGG16.add(RBG16_1);
		BGG16.add(RBG16_2);
		BGG16.add(RBG16_3);
		p5.add(RBG16_1);
		p5.add(RBG16_2);
		p5.add(RBG16_3);
		
		LG17 = new JLabel("Enfermedad hepatica moderada o severa (Cirrosis con hipertension portal, enfermedad del higado)");
		p5.add(LG17);
		RBG17_1 = new JRadioButton("0.No");
		RBG17_2 = new JRadioButton("1.Si");
		RBG17_3 = new JRadioButton("-1. NS/NR");
		BGG17 = new ButtonGroup();
		BGG17.add(RBG17_1);
		BGG17.add(RBG17_2);
		BGG17.add(RBG17_3);
		p5.add(RBG17_1);
		p5.add(RBG17_2);
		p5.add(RBG17_3);
		
		LG18 = new JLabel("SIDA/VIH");
		p5.add(LG18);
		RBG18_1 = new JRadioButton("0.No");
		RBG18_2 = new JRadioButton("1.Si");
		RBG18_3 = new JRadioButton("-1. NS/NR");
		BGG18 = new ButtonGroup();
		BGG18.add(RBG18_1);
		BGG18.add(RBG18_2);
		BGG18.add(RBG18_3);
		p5.add(RBG18_1);
		p5.add(RBG18_2);
		p5.add(RBG18_3);
		
		LG19 = new JLabel("Cancer con metastasis");
		p5.add(LG19);
		RBG18_1 = new JRadioButton("0.No");
		RBG18_2 = new JRadioButton("1.Si");
		RBG18_3 = new JRadioButton("-1. NS/NR");
		BGG18 = new ButtonGroup();
		BGG18.add(RBG18_1);
		BGG18.add(RBG18_2);
		BGG18.add(RBG18_3);
		p5.add(RBG18_1);
		p5.add(RBG18_2);
		p5.add(RBG18_3);
		
		JScrollPane scroll = new JScrollPane(p5);
		//scroll.add(p5);
		//scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		//JPanel p5_1 = new JPanel();
		//JFrame jf = new JFrame();
		
		//jf.add(scroll,BorderLayout.CENTER);
		///p5_1.add(scroll,BorderLayout.CENTER);
		
///////////////////////////////////////
///////////////////////////////////////
////////////PESTANIA 6 ////////////////
///////////////////////////////////////
		JPanel p6 = new JPanel();
		p6.setLayout(null);
		
		
		
		ingresar1 = new JButton("Ingresar");
		ingresar1.setBounds(500,500,100,25);
		p6.add(ingresar1);
		
		LNombre_1 = new JLabel("Nombre del empleado: ");
		LNombre_1.setBounds(30,10,200,25);
		p6.add(LNombre_1);
		
		LAPaterno_1 = new JLabel("Apellido paterno: ");
		LAPaterno_1.setBounds(30,40,200,25);
		p6.add(LAPaterno_1);
		
		LAMaterno_1 = new JLabel("Apellido materno: ");
		LAMaterno_1.setBounds(30,70,200,25);
		p6.add(LAMaterno_1);
		
		TNombre_1 = new JTextField();
		TNombre_1.setBounds(250,10,200,25);
		p6.add(TNombre_1);
		
		TAPaterno_1 = new JTextField();
		TAPaterno_1.setBounds(250,40,200,25);
		p6.add(TAPaterno_1);
		
		TAMaterno_1 = new JTextField();
		TAMaterno_1.setBounds(250,70,200,25);
		p6.add(TAMaterno_1);
		
		pestana.addTab("Paciente", p1);
		pestana.addTab("Tension", p2);
		pestana.addTab("Trastornos", p3);
		pestana.addTab("Emocional", p4);
		pestana.addTab("Comorbilidad", scroll);
		pestana.addTab("Empleado",p6);
		//pestana para empleado (agregar)
		//Boton de ingresar (poner)
		
		
		cp = getContentPane();
		cp.add(pestana);
		
	}



}
