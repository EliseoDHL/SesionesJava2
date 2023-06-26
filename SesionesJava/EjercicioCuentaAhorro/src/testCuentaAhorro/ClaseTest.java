package testCuentaAhorro;

import ejercicioCuentaAhorro.CajaAhorro;
import ejercicioCuentaAhorro.PlazoFijo;

public class ClaseTest {

	public static void main(String[] args) {
		
		//Instancia #1 (cuentaAhorro)
		CajaAhorro instancia1 = new CajaAhorro("Felipe Maqueda", 1000.0f);
		
		//Instancia #2 (plazo fijo)
		PlazoFijo instancia2 = new PlazoFijo("Jesus Gonzalez", 2500.0f, 12, 5.0);
		
		//Mostrar informacion de las cuentas
		instancia1.imprimirDatos();
		System.out.println();
		instancia2.mostrarInformacion();

	}

}
