package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import Modelo.MedicoCon;
import Vista.VistaMedico;

public class Controlador implements ActionListener{

	VistaMedico vistaM = new VistaMedico();
	MedicoCon medcon = new MedicoCon();   // listamedico
	
	public Controlador(VistaMedico vistaM,MedicoCon medcon   ){
		this.vistaM = vistaM;
		this.medcon = medcon;
		this.vistaM.imprimir.addActionListener(this);
		
	}
	
		public void actionPerformed(ActionEvent e){
		
		
		
		if(e.getSource() == vistaM.imprimir){
			vistaM.panelImp.removeAll();
			vistaM.panelImp.updateUI();
			vistaM.panelImp.repaint();
			System.out.println("Evento Boton");
			String id = Integer.toString(medcon.listaMedico().get(0).getId());
			//¡¡¡¡¡Sólo imprime la primera línea!!!!
			 String[][] data = { 
		            { id, medcon.listaMedico().get(0).getNombre(), medcon.listaMedico().get(0).getAMaterno(), medcon.listaMedico().get(0).getApaterno() }
		        }; 
			
			
			vistaM.tabla = new JTable(data,vistaM.columnNames);
			JScrollPane tableContainer = new JScrollPane(vistaM.tabla);
			vistaM.panelImp.add(tableContainer);
		}
		
	}
}


