//Hacked bitch
//Fuk u
package PruebaMVC;
import Vista.*;
import Modelo.*;
import Controlador.*;
//Hello
public class MVCPrueba {

	public static void main(String[] args) {

		VistaMedico vistaM = new VistaMedico();
		MedicoCon modeloM = new MedicoCon();
		Controlador cont = new Controlador(vistaM,modeloM);

		vistaM.setVisible(true);
	}
 
}
