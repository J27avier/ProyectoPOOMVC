package Vista;

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



  public PagIngEmpleado()
  {
    super("Dar de alta un empleado00");
    setSize(1000,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(true);


    JPanel menuPrincipal = new JPanel();
    menuPrincipal.setLayout(null);

    LNombre = new JLabel("Nombre(s):");
    LNombre.setBounds(300,50,200,25);
    menuPrincipal.add(LNombre);

    LAPaterno = new JLabel("Apellido Paterno:");
    LAPaterno.setBounds(300,90,200,25);
    menuPrincipal.add(LAPaterno);

    LAMaterno = new JLabel("Apellido Materno:");
    LAMaterno.setBounds(300,130,200,25);
    menuPrincipal.add(LAMaterno);

    LSexo = new JLabel("Sexo:");
    LSexo.setBounds(300,170,200,25);
    menuPrincipal.add(LSexo);

    LFechaNac = new JLabel("Fecha de Nacimiento:");
    LFechaNac.setBounds(300,210,200,25);
    menuPrincipal.add(LFechaNac);

    LDireccion = new JLabel("Dirección:");
    LDireccion.setBounds(300,250,200,25);
    menuPrincipal.add(LDireccion);

    LOcupacion = new JLabel("Ocupación:");
    LOcupacion.setBounds(300,290,200,25);
    menuPrincipal.add(LOcupacion);

    TNombre = new JTextField();
    TNombre.setBounds(450,50,200,25);
    menuPrincipal.add(TNombre);

    TAPaterno = new JTextField();
    TAPaterno.setBounds(450,90,200,25);
    menuPrincipal.add(TAPaterno);

    TAMaterno = new JTextField();
    TAMaterno.setBounds(450,130,200,25);
    menuPrincipal.add(TAMaterno);

    TDireccion = new JTextField();
    TDireccion.setBounds(450,250,200,25);
    menuPrincipal.add(TDireccion);

    String[] opcionesSexo = { "hombre","mujer"};
    final JComboBox<String> DSexo = new JComboBox<String>(opcionesSexo);
    DSexo.setBounds(450,170,200,25);
    menuPrincipal.add(DSexo);

    String[] opcionesOcup = {"medico","otro"};
    final JComboBox<String> DOcupacion = new JComboBox<String>(opcionesOcup);
    DOcupacion.setBounds(450,290,200,25);
    menuPrincipal.add(DOcupacion);


    cp = getContentPane();
    cp.add(menuPrincipal);


  }
}
