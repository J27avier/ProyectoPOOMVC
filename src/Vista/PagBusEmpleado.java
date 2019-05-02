package Vista;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PagBusEmpleado extends JFrame
{
	public JTextField tNombre;
	public JTextField tApaterno;
	public JTextField tAmaterno;
	public JButton Buscar;
	public JLabel lSexo;
	public JLabel lDOB;
	public JLabel lDir;
	public JLabel lOcupacion;
	public JPanel pResultado;
	public JPanel pSexo;
	public JPanel pDOB;
	public JPanel pDir;
	public JPanel pOcupacion;

	public Container cp;


	/*
 public static void main(String[] args) {
    NumberFormat format = NumberFormat.getInstance();
    NumberFormatter formatter = new NumberFormatter(format);
    formatter.setValueClass(Integer.class);
    formatter.setMinimum(0);
    formatter.setMaximum(Integer.MAX_VALUE);
    formatter.setAllowsInvalid(false);
    // If you want the value to be committed on each keystroke instead of focus lost
    formatter.setCommitsOnValidEdit(true);
    JFormattedTextField field = new JFormattedTextField(formatter);

    JOptionPane.showMessageDialog(null, field);

    // getValue() always returns something valid
    System.out.println(field.getValue());
}
	 */

	public PagBusEmpleado()
	{
		super("Buscar empleado");
		setSize(1000,500);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(true);
		
		JPanel pDatos = new JPanel();
		pDatos.setLayout(new GridLayout(4, 1, 10, 10));
		
		JPanel pNombre = new JPanel();
		pNombre.setLayout(new FlowLayout());
		JPanel pApaterno = new JPanel();
		pApaterno.setLayout(new FlowLayout());
		JPanel pAmaterno = new JPanel();
		pAmaterno.setLayout(new FlowLayout());
		JPanel pBuscar = new JPanel();
		pBuscar.setLayout(new FlowLayout());
		
		JLabel lNombre = new JLabel("Nombre: ");
		JLabel lApaterno = new JLabel("Apellido paterno: ");
		JLabel lAmaterno = new JLabel("Apellido materno: ");
		Buscar = new JButton("Buscar empleado");
		
		pResultado = new JPanel();
		pResultado.setLayout(new GridLayout(4,1,10,10));
		
		pSexo = new JPanel();
		pSexo.setLayout(new FlowLayout());
		pDOB = new JPanel();
		pDOB.setLayout(new FlowLayout());
		pDir = new JPanel();
		pDir.setLayout(new FlowLayout());
		pOcupacion = new JPanel();
		pOcupacion.setLayout(new FlowLayout());
		
		lSexo = new JLabel("___");
		lDOB = new JLabel("___");
		lDir = new JLabel("___");
		lOcupacion = new JLabel("___");
		
		pNombre.add(lNombre);
		pNombre.add(tNombre);
		pApaterno.add(lApaterno);
		pApaterno.add(tApaterno);
		pAmaterno.add(lAmaterno);
		pAmaterno.add(tAmaterno);
		pBuscar.add(Buscar);
		pDatos.add(pNombre);
		pDatos.add(pApaterno);
		pDatos.add(pAmaterno);
		pDatos.add(pBuscar);
		
		pSexo.add(new JLabel("Sexo: "));
		pSexo.add(lSexo);
		pDOB.add(new JLabel("Fecha de nacimiento: "));
		pDOB.add(lDOB);
		pDir.add(new JLabel("Dirección"));
		pDir.add(lDir);
		pOcupacion.add(new JLabel("Ocupación"));
		pOcupacion.add(lOcupacion);
		pResultado.add(pSexo);
		pResultado.add(pDOB);
		pResultado.add(pDir);
		pResultado.add(pOcupacion);
		
		cp = getContentPane();
		cp.add(pDatos);
		cp.add(pResultado);
	}
}
