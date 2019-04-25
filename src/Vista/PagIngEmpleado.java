import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PagIngEmpleado extends JFrame
{
  private JButton Opcion1;
  private JButton Opcion2;
  private JButton Opcion3;
  private JButton Opcion4;
  private JButton Opcion5;
  private JButton Opcion6;
  private Container cp;

  private JLabel Menu;


  PagIngEmpleado()
  {
    super("Dar de alta un empleado");
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
}
