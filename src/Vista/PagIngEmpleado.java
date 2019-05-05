package Vista;

import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class PagIngEmpleado extends JFrame
{
  public JLabel LNombre;
  public JLabel LAPaterno;
  public JLabel LAMaterno;
  public JLabel LSexo;
  public JLabel LFechaNac;
  public JLabel LDireccion;
  public JLabel LOcupacion;
  public JTextField TNombre;
  public JTextField TAPaterno;
  public JTextField TAMaterno;
  public JTextField TDireccion;
  public JDateChooser dateChooser;
  public JButton ingresar;
  public final JComboBox<String> DSexo;
  public final JComboBox<String> DOcupacion;

  public Container cp;



  public PagIngEmpleado()
  {
    super("Dar de alta un empleado");
    setSize(1000,500);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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

    LDireccion = new JLabel("Direccion:");
    LDireccion.setBounds(300,250,200,25);
    menuPrincipal.add(LDireccion);

    LOcupacion = new JLabel("Ocupacion:");
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
    DSexo = new JComboBox<String>(opcionesSexo);
    DSexo.setBounds(450,170,200,25);
    menuPrincipal.add(DSexo);

    String[] opcionesOcup = {"medico","otro"};
    DOcupacion = new JComboBox<String>(opcionesOcup);
    DOcupacion.setBounds(450,290,200,25);
    menuPrincipal.add(DOcupacion);

    
    dateChooser = new JDateChooser("yyyy-MM-dd","####-##-##",'_');
    dateChooser.setBounds(450,210,200,25);
    menuPrincipal.add(dateChooser);
    //para consultas del datechooser
    //http://datojava.blogspot.com/2015/11/jcalendarJavaSwingEjemploTutorial.html#ejemploJDateChooser
    
    ingresar = new JButton("Ingresar");
    ingresar.setBounds(450,350,100,25);
    menuPrincipal.add(ingresar);
    

    cp = getContentPane();
    cp.add(menuPrincipal);


  }
}
