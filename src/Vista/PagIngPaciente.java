package Vista;

import java.awt.*;

import javax.swing.*;

import com.toedter.calendar.JDateChooser;

import java.awt.event.*;




public class PagIngPaciente extends JFrame
{
	public Container cp;
	public Container cp1;
	public JLabel LNombre;
	public JLabel LAPaterno;
	public JLabel LAMaterno;
	public JLabel LSexo;
	public JLabel LFecha;
	public JLabel LEdad;
	public JLabel LCalle;
	public JLabel LNumExt;
	public JLabel LNumInt;
	public JLabel LZona;
	public JLabel LDeleg;
	public JLabel LCodPos;
	public JLabel LTelFij;
	public JLabel LTelCel;
	public JLabel LTiemVivA;
	public JLabel LTiemVivM;
	public JLabel LEOrigen;
	public JLabel LEdoCiv;
	public JLabel LNivEst;
	public JLabel LLeer;
	public JLabel LEscrib;
	public JLabel LOcup;
	public JLabel LEspe1;
	public JLabel LRelig;
	public JLabel LEspe2;
	public JLabel LContacto;
	public JLabel LParent;
	public JLabel LNumFam;
	public JLabel LObs;
	
	public JTextField TNombre;
	public JTextField TAPaterno;
	public JTextField TAMaterno;
	public JTextField TEdad;
	public JTextField TCalle;
	public JTextField TNumExt;
	public JTextField TNumInt;
	public JTextField TZona;
	public JTextField TDeleg;
	public JTextField TCodPos;
	public JTextField TTelFij;
	public JTextField TTelCel;
	public JTextField TTiemVivA;
	public JTextField TTiemVivM;
	public JTextField TEOrigen;
	public JTextField TNivEst;
	public JTextField TEspe1;
	public JTextField TEspe2;
	public JTextField TContacto;
	public JTextField TParent;
	public JTextField TNumFam;
	public JTextField TObs;
	public final JComboBox<String> DSexo1;
	public final JComboBox<String> DEdoCiv;
	public final JComboBox<String> DEst;
	public final JComboBox<String> DLeer;
	public final JComboBox<String> DEsc;
	public final JComboBox<String> DOfic;
	public final JComboBox<String> DRelig;
	
	public JDateChooser dateChooser1;
	
	
	
	public PagIngPaciente()
	{
		super("Dar de alta un paciente");
		setSize(1300,800);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(true);


		JPanel menuPrincipal = new JPanel();
		menuPrincipal.setLayout(null);

//Se generan las panel que permite pestañas
		JTabbedPane pestaña=new JTabbedPane();
		//PESTAÑA 1
		JPanel p1=new JPanel();
		p1.setLayout(null);

		
		//Se crea el panel que estara dentro del Scroll
		p1.setLayout(null);
		
		LNombre = new JLabel("Nombre(s):");
		LNombre.setBounds(30,10,200,25);
		p1.add(LNombre);
		//Apellidos
		LAPaterno = new JLabel("Apellido Pat:");
		LAPaterno.setBounds(30,40,200,25);
		p1.add(LAPaterno);
		LAMaterno = new JLabel("Apellido Mat:");
		LAMaterno.setBounds(30,70,200,25);
		p1.add(LAMaterno);
		//Sexo
		LSexo = new JLabel("Sexo:");
		LSexo.setBounds(30,100,200,25);
		p1.add(LSexo);
		//fechas
		LFecha = new JLabel("Fecha de Nac:");
		LFecha.setBounds(30,130,200,25);
		p1.add(LFecha);
		
		LEdad = new JLabel("Edad:");
		LEdad.setBounds(30,160,200,25);
		p1.add(LEdad);
		
		LCalle = new JLabel("Calle:");
		LCalle.setBounds(30,190,200,25);
		p1.add(LCalle);
		
		LNumExt = new JLabel("Num. Exterior:");
		LNumExt.setBounds(30,220,200,25);
		p1.add(LNumExt);
		
		LNumInt = new JLabel("Num. Interior:");
		LNumInt.setBounds(30,250,200,25);
		p1.add(LNumInt);
		
		LZona = new JLabel("Zona:");
		LZona.setBounds(30,280,200,25);
		p1.add(LZona);
		
		LDeleg = new JLabel("Delegacion/Municipio:");
		LDeleg.setBounds(30,310,200,25);
		p1.add(LDeleg);
		
		LCodPos = new JLabel("Codigo Postal:");
		LCodPos.setBounds(30,340,200,25);
		p1.add(LCodPos);
		
		LTelFij = new JLabel("Telefono Fijo:");
		LTelFij.setBounds(30,370,200,25);
		p1.add(LTelFij);
		
		LTelCel = new JLabel("Telefono Celular:");
		LTelCel.setBounds(30,400,200,25);
		p1.add(LTelCel);
		
		LTiemVivA = new JLabel("Tiempo vivido en años:");
		LTiemVivA.setBounds(500,10,200,25);
		p1.add(LTiemVivA);
		
		LTiemVivM = new JLabel ("Tiempo vivido en meses:");
		LTiemVivM.setBounds(500,40,200,25);
		p1.add(LTiemVivM);
		
		LEOrigen = new JLabel("Edo./Entidad federativa de origen:");
		LEOrigen.setBounds(500,70,200,25);
		p1.add(LEOrigen);
		
		LEdoCiv = new JLabel("Estado Civil:");
		LEdoCiv.setBounds(500,100,200,25);
		p1.add(LEdoCiv);
		
		LNivEst = new JLabel("Nivel de estudios:");
		LNivEst.setBounds(500,130,200,25);
		p1.add(LNivEst);
		
		LLeer = new JLabel("Sabe leer:");
		LLeer.setBounds(500,160,200,25);
		p1.add(LLeer);
		
		LEscrib = new JLabel("Sabe Escribir:");
		LEscrib.setBounds(500,190,200,25);
		p1.add(LEscrib);
		
		LOcup = new JLabel("¿A que se dedica?:");
		LOcup.setBounds(500,220,200,25);
		p1.add(LOcup);
		
		LEspe1 = new JLabel("Especifique:");
		LEspe1.setBounds(500,250,200,25);
		p1.add(LEspe1);
		
		LRelig = new JLabel("Religion:");
		LRelig.setBounds(500,280,200,25);
		p1.add(LRelig);
		
		LEspe2 = new JLabel("Especifique:");
		LEspe2.setBounds(500,310,200,25);
		p1.add(LEspe2);
		
		LContacto = new JLabel("Nombre de algun contacto:");
		LContacto.setBounds(500,340,200,25);
		p1.add(LContacto);
		
		LParent = new JLabel("Parentesco:");
		LParent.setBounds(500,370,200,25);
		p1.add(LParent);
		
		LNumFam = new JLabel("Numero del familiar:");
		LNumFam.setBounds(500,400,200,25);
		p1.add(LNumFam);
		
		LObs = new JLabel("Observaciones:");
		LObs.setBounds(500,430,200,25);
		p1.add(LObs);
		
		
		//agregando campos de llenado.
		TNombre=new JTextField();
		TNombre.setBounds(250,10,200,25);
		p1.add(TNombre);
		
		TAPaterno = new JTextField();
		TAPaterno.setBounds(250,40,200,25);
		p1.add(TAPaterno);
		
		TAMaterno = new JTextField();
		TAMaterno.setBounds(250,70,200,25);
		p1.add(TAMaterno);
		
		String[] opSexo = {"hombre","mujer"};
	    DSexo1 = new JComboBox<String>(opSexo);
	    DSexo1.setBounds(250,100,200,25);
	    p1.add(DSexo1);
	    
	    dateChooser1 = new JDateChooser("yyyy-MM-dd","####-##-##",'_');
	    dateChooser1.setBounds(250,130,200,25);
	    p1.add(dateChooser1);
		
		TEdad = new JTextField();
		TEdad.setBounds(250,160,200,25);
		p1.add(TEdad);
		
		TCalle = new JTextField();
		TCalle.setBounds(250,190,200,25);
		p1.add(TCalle);
		
		TNumExt = new JTextField();
		TNumExt.setBounds(250,220,200,25);
		p1.add(TNumExt);
		
		TNumInt = new JTextField();
		TNumInt.setBounds(250,250,200,25);
		p1.add(TNumInt);
		
		TZona = new JTextField();
		TZona.setBounds(250,280,200,25);
		p1.add(TZona);
		
		TDeleg = new JTextField();
		TDeleg.setBounds(250,310,200,25);
		p1.add(TDeleg);
		
		TCodPos = new JTextField();
		TCodPos.setBounds(250,340,200,25);
		p1.add(TCodPos);
		
		TTelFij = new JTextField();
		TTelFij.setBounds(250,370,200,25);
		p1.add(TTelFij);
		
		TTelCel = new JTextField();
		TTelCel.setBounds(250,400,200,25);
		p1.add(TTelCel);
		
		TTiemVivA = new JTextField();
		TTiemVivA.setBounds(720,10,200,25);
		p1.add(TTiemVivA);
		
		TTiemVivM = new JTextField();
		TTiemVivM.setBounds(720,40,200,25);
		p1.add(TTiemVivM);
		
		TEOrigen = new JTextField();
		TEOrigen.setBounds(720,70,200,25);
		p1.add(TEOrigen);
		
		String[] opEdoCiv = {"casado","union libre","soltero","separado","divorciado","viudo","no sabe"};
	    DEdoCiv = new JComboBox<String>(opEdoCiv);
	    DEdoCiv.setBounds(720,100,200,25);
	    p1.add(DEdoCiv);
	    
	    String[] opEst = {"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25"};
	    DEst = new JComboBox<String>(opEst);
	    DEst.setBounds(720,130,200,25);
	    p1.add(DEst);
		
	    String[] opLee = {"si","no"};
	    DLeer = new JComboBox<String>(opLee);
	    DLeer.setBounds(720,160,200,25);
	    p1.add(DLeer);
	    
	    String[] opEsc = {"si","no"};
	    DEsc= new JComboBox<String>(opEsc);
	    DEsc.setBounds(720,190,200,25);
	    p1.add(DEsc);
	    
	    String[] opOf = {"0","1","2","3","4","5","6","7","8","9","10","11"};
	    DOfic = new JComboBox<String>(opOf);
	    DOfic.setBounds(720,220,200,25);
	    p1.add(DOfic);
	    
	    
		TEspe1 = new JTextField();
		TEspe1.setBounds(720,250,200,25);
		p1.add(TEspe1);
		
		String[] opRel = {"0","1","2","3","4","5"};
	    DRelig = new JComboBox<String>(opRel);
	    DRelig.setBounds(720,280,200,25);
	    p1.add(DRelig);
		
		
		TEspe2 = new JTextField();
		TEspe2.setBounds(720,310,200,25);
		p1.add(TEspe2);
		
		TContacto = new JTextField();
		TContacto.setBounds(720,340,200,25);
		p1.add(TContacto);
		
		TParent = new JTextField();
		TParent.setBounds(720,370,200,25);
		p1.add(TParent);
		
		TNumFam = new JTextField();
		TNumFam.setBounds(720,400,200,25);
		p1.add(TNumFam);
		
		TObs = new JTextField();
		TObs.setBounds(720,430,400,25);
		p1.add(TObs);

		
		cp1= getContentPane();
		cp1.add(p1);
		
		
		//pestaña 2
		JPanel p2=new JPanel();
		JLabel l2=new JLabel("Tencion del paciente");
		p2.add(l2);
		//pestaña 3
		JPanel p3=new JPanel();
		JLabel l3=new JLabel("Trastornos del paciente");
		p3.add(l3);
		//pestaña 4
		JPanel p4=new JPanel();
		JLabel l4=new JLabel("Datos emocionales del paciente");
		p4.add(l4);
		//pestaña 5
		JPanel p5=new JPanel();
		JLabel l5=new JLabel("Datos de comorbilidad");
		p5.add(l5);
		
		pestaña.addTab("Paciente", p1);
		pestaña.addTab("Tencion", p2);
		pestaña.addTab("Trastornos", p3);
		pestaña.addTab("Emocional", p4);
		pestaña.addTab("Comorbilidad", p5);
		
		
		
		cp = getContentPane();
		cp.add(pestaña);
		
	}



}
