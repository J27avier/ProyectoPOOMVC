package Vista;

import java.awt.*;

import javax.swing.*;
import java.awt.event.*;

public class PagIngPaciente extends JApplet
{
	public void init()
	{
	  JTabbedPane pestaña=new JTabbedPane();
	  JPanel p1=new JPanel();
	  JLabel l1=new JLabel("Este es el panel uno");
	  p1.add(l1);
	  JPanel p2=new JPanel();
	  JLabel l2=new JLabel("Este es el panel dos");
	  p2.add(l2);
	  JPanel p3=new JPanel();
	  JLabel l3=new JLabel("Este es el panel tres");
	  p3.add(l3);
	  pestaña.addTab("Pestaña Uno", p1);
	  pestaña.addTab("Pestaña Dos", p2);
	  pestaña.addTab("Pestaña Tres", p3);
	  add(pestaña);
	}
}
