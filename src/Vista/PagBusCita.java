package Vista;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PagBusCita extends JFrame
{
	public JTextField tNombre;
	public JTextField tApaterno;
	public JTextField tAmaterno;
	public JButton Buscar;
	public JPanel pRes;
	public Container cp;

	public PagBusCita()
	{
		super("Buscar citas por medico");
		setSize(1000,500);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(true);
		
		JPanel pDatos = new JPanel();
		pDatos.setLayout(new GridLayout(3,1));
		
		tNombre = new JTextField(16);
		tApaterno = new JTextField(16);
		tAmaterno = new JTextField(16);
		
		JPanel pParams = new JPanel();
		pParams.setLayout(new FlowLayout());
		
		pParams.add(new JLabel("   Nombre: "));
		pParams.add(tNombre);
		pParams.add(new JLabel("   Apellido paterno: "));
		pParams.add(tApaterno);
		pParams.add(new JLabel("   Apellido materno: "));
		pParams.add(tAmaterno);
		
		Buscar = new JButton("Buscar");
		JPanel pBuscar = new JPanel();
		pBuscar.setLayout(new FlowLayout());
		pBuscar.add(Buscar);
		
		pDatos.add(new JLabel("               Medico: "));
		pDatos.add(pParams);
		pDatos.add(pBuscar);
		
		pRes = new JPanel();
		pRes.setLayout(new FlowLayout());
		cp = getContentPane();
		cp.setLayout(new GridLayout(2,1));
		cp.add(pDatos);
		cp.add(pRes);

	}
}
