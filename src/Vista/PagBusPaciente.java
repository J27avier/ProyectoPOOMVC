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
  public JLabel LB3_1;
  
  public JTextField TB1_1_1;
  public JTextField TB1_2_1;
  public JTextField TB1_3_1;
  
  public JDateChooser DCB3_1;
  
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
    
    LB3_1 = new JLabel("Fecha de nacimiento:");
    LB3_1.setBounds(30,100,200,25);
    menuPrincipal.add(LB3_1);
    
    TB1_1_1 = new JTextField();
    TB1_1_1.setBounds(250,10,200,25);
    menuPrincipal.add(TB1_1_1);
    
    TB1_2_1 = new JTextField();
    TB1_2_1.setBounds(250,40,200,25);
    menuPrincipal.add(TB1_2_1);
    
    TB1_3_1 = new JTextField();
    TB1_3_1.setBounds(250,70,200,25);
    menuPrincipal.add(TB1_3_1);
    
    DCB3_1 = new JDateChooser("yyyy-MM-dd","####-##-##",'_');
    DCB3_1.setBounds(250,100,200,25);
    menuPrincipal.add(DCB3_1);
    
    Buscar1 = new JButton("Buscar");
    Buscar1.setBounds(250,130,100,25);
    menuPrincipal.add(Buscar1);
    


    cp = getContentPane();
    cp.add(menuPrincipal);
    

  }
}
