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
  public final JComboBox<String> Dhora;
  public final JComboBox<String> Dminuto;
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
    String[] opcionesHora = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};
    Dhora = new JComboBox<String>(opcionesHora);
    
    String[] opcionesMinuto = {"00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};
    Dminuto = new JComboBox<String>(opcionesMinuto);
    
    JPanel pFecha= new JPanel();
    pFecha.setLayout(new FlowLayout());
    pFecha.add(new JLabel("Fecha: "));
    pFecha.add(dateChooser);
    pFecha.add(new JLabel("      Hora: "));
    pFecha.add(Dhora);
    pFecha.add(new JLabel(" : "));
    pFecha.add(Dminuto);
    
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
