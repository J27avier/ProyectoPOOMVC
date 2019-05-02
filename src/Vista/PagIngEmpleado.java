import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PagIngEmpleado extends JFrame
{
  private JLabel LNombre;
  private JLabel LAPaterno;
  private JLabel LAMaterno;
  private JLabel LSexo;
  private JLabel LFechaNac;
  private JLabel LDireccion;
  private JLabel LOcupacion;
  private JTextField TNombre;
  private JTextField TAPaterno;
  private JTextField TAMaterno;
  private JTextField TDireccion;

  private Container cp;



  PagIngEmpleado()
  {
    super("Dar de alta un empleado00");
    setSize(1000,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(true);


    JPanel menuPrincipal = new JPanel();
    menuPrincipal.setLayout(null);

    LNombre = new JLabel("Nombre(s):");
    LNombre.setbounds(400,50,200,25);
    menuPrincipal.add(LNombre);

    LAPaterno = new JLabel("Apellido Paterno:");
    LAPaterno.setBounds(400,90,200,25);
    menuPrincipal.add(LAPaterno);

    LAMaterno = new JLabel("Apellido Materno:");
    LAMaterno.setBounds(400,130,200,25);
    menuPrincipal.add(LAMaterno);

    LSexo = new JLabel("Sexo:");
    LSexo.setBounds(400,170,200,25);
    menuPrincipal.add(LSexo);

    LFechaNac = new JLabel("Fecha de Nacimiento:");
    LFechaNac.setBounds(400,210,200,25);
    menuPrincipal.add(LFechaNac);

    LDireccion = new JLabel("Dirección:");
    LDireccion.setBounds(400,250,200,25);
    menuPrincipal.add(LDireccion);

    LOcupacion = new JLabel("Ocupación:");
    LOcupacion.setBounds(400,290,200,25);
    menuPrincipal.add(LOcupacion);


    cp = getContentPane();
    cp.add(menuPrincipal);


  }
}
