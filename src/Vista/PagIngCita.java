package Vista;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;

public class PagIngCita extends JFrame
{
  public JButton Ingresar;
  public JTextField tNombreP;
  public JTextField tApaternoP;
  public JTextField tAmaternoP;
  public JTextField tNombreD;
  public JTextField tApaternoD;
  public JTextField tAmaternoD;
  public JDateChooser dateChooser;
  private Container cp;



  public PagIngCita()
  {
    super("Agendar cita");
    setSize(1000,500);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setResizable(true);
    
    tNombreP = new JTextField(16);
    tApaternoP = new JTextField(16);
    tAmaternoP = new JTextField(16);
    
    JPanel pPaciente = new JPanel();
    pPaciente.setLayout(new FlowLayout());
    pPaciente.add(new JLabel("  Nombre: "));
    pPaciente.add(tNombreP);
    pPaciente.add(new JLabel("  Apellido paterno: "));
    pPaciente.add(tApaternoP);
    pPaciente.add(new JLabel("  Apellido materno: "));
    pPaciente.add(tAmaternoP);
    
    tNombreD = new JTextField(16);
    tApaternoD = new JTextField(16);
    tAmaternoD = new JTextField(16);
    
    JPanel pDoctor = new JPanel();
    pDoctor.setLayout(new FlowLayout());
    pDoctor.add(new JLabel("  Nombre: "));
    pDoctor.add(tNombreD);
    pDoctor.add(new JLabel("  Apellido paterno: "));
    pDoctor.add(tApaternoD);
    pDoctor.add(new JLabel("  Apellido materno: "));
    pDoctor.add(tAmaternoD);
    
    dateChooser = new JDateChooser("yyyy-MM-dd","####-##-##", '_');
    
    JPanel pFecha= new JPanel();
    pFecha.setLayout(new FlowLayout());
    pFecha.add(new JLabel("Fecha: "));
    pFecha.add(dateChooser);
    
    Ingresar = new JButton("Ingresar");
    
    JPanel pIngresar = new JPanel();
    pIngresar.setLayout(new FlowLayout());
    pIngresar.add(Ingresar);
    
    cp = getContentPane();
    cp.setLayout(new GridLayout(6,1));
    cp.add(new JLabel("               Paciente: "));
    cp.add(pPaciente);
    cp.add(new JLabel("               Medico: "));
    cp.add(pDoctor);
    cp.add(pFecha);
    cp.add(pIngresar);
    

  }
}
