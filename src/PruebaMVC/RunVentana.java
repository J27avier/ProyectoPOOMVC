package PruebaMVC;

import Modelo.*;
import Vista.*;
import Controlador.*;

import java.sql.Connection;

public class RunVentana {

	public static void main(String[] args) {
		ConectarBD conect = new ConectarBD();
		PagPrincipal pPrincipal = new PagPrincipal();
		ContPagPrincipal ContpPrincipal = new ContPagPrincipal(pPrincipal, conect.getConnection());
		pPrincipal.setVisible(true);
	}

}
