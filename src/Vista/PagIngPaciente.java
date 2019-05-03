package Vista;

import java.awt.*;

import javax.swing.*;
import java.awt.event.*;




public class PagIngPaciente extends JFrame
{
	public Container cp;
	
	public PagIngPaciente()
	{
		super("Dar de alta un paciente");
		setSize(1000,500);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(true);


		JPanel menuPrincipal = new JPanel();
		menuPrincipal.setLayout(null);

//Se generan las panel que permite pestañas
		JTabbedPane pestaña=new JTabbedPane();
		//pestaña 1
		JPanel p1=new JPanel();
		JLabel l1=new JLabel("Agregar datos del paciente");
		p1.add(l1);
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
