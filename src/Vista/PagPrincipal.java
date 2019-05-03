package Vista;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PagPrincipal extends JFrame
{
  public JButton Opcion1;
  public JButton Opcion2;
  public JButton Opcion3;
  public JButton Opcion4;
  public JButton Opcion5;
  public JButton Opcion6;
  private Container cp;

  private JLabel Menu;


  public PagPrincipal()
  {
    super("Clinica");
    setSize(1000,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(true);


    JPanel menuPrincipal = new JPanel();
    menuPrincipal.setLayout(null);

    Opcion1 = new JButton("Buscar paciente");
    Opcion1.setBounds(400,50,200,25);
    menuPrincipal.add(Opcion1);

    Opcion2 = new JButton("Buscar empleado");
    Opcion2.setBounds(400,90,200,25);
    menuPrincipal.add(Opcion2);

    Opcion3 = new JButton("Buscar cita");
    Opcion3.setBounds(400,130,200,25);
    menuPrincipal.add(Opcion3);

    Opcion4 = new JButton("Ingresar paciente nuevo");
    Opcion4.setBounds(400,170,200,25);
    menuPrincipal.add(Opcion4);

    Opcion5 = new JButton("Ingresar empleado");
    Opcion5.setBounds(400,210,200,25);
    menuPrincipal.add(Opcion5);

    Opcion6 = new JButton("Agendar cita");
    Opcion6.setBounds(400,250,200,25);
    menuPrincipal.add(Opcion6);

    cp = getContentPane();
    cp.add(menuPrincipal);

  }
}//clase
