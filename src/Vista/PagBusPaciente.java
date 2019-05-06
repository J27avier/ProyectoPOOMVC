package Vista;

import java.awt.*;
import javax.swing.*;

import com.toedter.calendar.JDateChooser;

import java.awt.event.*;

public class PagBusPaciente extends JFrame
{
  public JLabel LB1_1_1;
  public JLabel LB1_2_1;
  public JLabel LB1_3_1;
  
  public JTextField TB1_1_1;
  public JTextField TB1_2_1;
  public JTextField TB1_3_1;
  
  
  public JCheckBox CB1,CB2,CB3,CB4;
  
  public JButton Buscar1;
  
  private Container cp;



  public PagBusPaciente()
  {
    super("Buscar Paciente");
    setSize(1000,500);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setResizable(true);


    JPanel menuPrincipal = new JPanel();
    menuPrincipal.setLayout(null);

    LB1_1_1 = new JLabel("Nombre(s) del paciente:");
    LB1_1_1.setBounds(30,10,200,25);
    menuPrincipal.add(LB1_1_1);
    
    LB1_2_1 = new JLabel("Apellido paterno:");
    LB1_2_1.setBounds(30,40,200,25);
    menuPrincipal.add(LB1_2_1);

    LB1_3_1 = new JLabel("Apellido materno:");
    LB1_3_1.setBounds(30,70,200,25);
    menuPrincipal.add(LB1_3_1);
    
    
    TB1_1_1 = new JTextField();
    TB1_1_1.setBounds(250,10,200,25);
    menuPrincipal.add(TB1_1_1);
    
    TB1_2_1 = new JTextField();
    TB1_2_1.setBounds(250,40,200,25);
    menuPrincipal.add(TB1_2_1);
    
    TB1_3_1 = new JTextField();
    TB1_3_1.setBounds(250,70,200,25);
    menuPrincipal.add(TB1_3_1);
    
    CB1 = new JCheckBox("Tension");
    CB1.setBounds(30,100,100,25);
    CB2 = new JCheckBox("Trastornos");
    CB2.setBounds(130,100,100,25);
    CB3 = new JCheckBox("Emocional");
    CB3.setBounds(230,100,100,25);
    CB4 = new JCheckBox("Comorbilidad");
    CB4.setBounds(330,100,200,25);
    menuPrincipal.add(CB1);
    menuPrincipal.add(CB2);
    menuPrincipal.add(CB3);
    menuPrincipal.add(CB4);

    
    Buscar1 = new JButton("Buscar");
    Buscar1.setBounds(250,130,100,25);
    menuPrincipal.add(Buscar1);
    


    cp = getContentPane();
    cp.add(menuPrincipal);
    

  }
}
