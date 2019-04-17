package Vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



public class VistaMedico extends JFrame{
	
	public JButton imprimir;
	public JPanel panelImp;
	public JTable tabla;
    private JLabel texto1;
    private JLabel texto2;
    private Container cp;
    public String[] columnNames = {"id", "Nombre","AMaterno","APaterno"}; 
    
           
    public VistaMedico(){
	
		//(width, height)
		setSize(550, 280);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setResizable(true);
	        
	    // Panel Ingresa datos 
	     JPanel ingresaDatos = new JPanel();
	     ingresaDatos.setLayout(null);
	     texto1 = new JLabel("Imprimir TMedicos",SwingConstants.CENTER);
	     //(x,y,width, height) - esquina superior izquierda 
	     texto1.setBounds(20, 22, 112, 25);
	     ingresaDatos.add(texto1);
	     imprimir = new JButton( "Imprimir" );
	     imprimir.setBounds(265, 22, 120, 25);
	     ingresaDatos.add(imprimir);
	     
	     
	     // Panel para imprimir
	     panelImp = new JPanel();  
	     panelImp.setLayout(new BorderLayout());
	       	     
	     	   
		 cp = getContentPane();
		 cp.setLayout(new GridLayout(2,2));
		 cp.add(ingresaDatos);
		 cp.add(panelImp);
		 
	 }

}
