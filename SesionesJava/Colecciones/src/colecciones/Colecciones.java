package colecciones;

public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declarando mi primer arreglo []
		
		//Primero el tipo de dato que voy a almacenar, le pongo los corchetes cuadrados, despues el nombre de mi arreglo y por ultimo instancia mi arreglo. Los datos que voy a guardar en este arreglo, van dentro de {}
		
		String [] listaDeCompras = new String [] {"leche", "pan", "frutas"};
		
		System.out.println(listaDeCompras);
		
		//forEach para imprimir cada elemento de mi lista de compras
		
		//para nuestros datos del tipo String, quue  se almacenan en una variable temporal llamada productoTemporal, que se esta llenando de un arreglo llamado listaCompras, vas a imprimir ese productoTemporal
		for (String productoTemporal : listaDeCompras) {
			System.out.println(productoTemporal);
		}
		
		//Arreglo de habitaciones de un hotel
		
		String[] habitaciones = new String[10];
		
		//Asigno valores a cada indice
		
		habitaciones[0] = "101";
		habitaciones[1] = "102";
		habitaciones[2] = "103";
		habitaciones[3] = "104";
		habitaciones[4] = "105";
		habitaciones[5] = "106";
		habitaciones[6] = "107";
		habitaciones[7] = "108";
		habitaciones[8] = "109";
		habitaciones[9] = "110";

	}
}

/*
 * 
 * Colecciones
 * 
 * - Arrays
 * 
 * Un array es una estructura de datos lineal que contiene elementos del mismo tipo. La longitud de un array se establece al momento de crearlo y no puede cambiar. No cuenta con metodos adicionales para agregar o eliminar elementos. Los elementos estan almacenados de forma contigua en memoria y se pueden acceder a ellos de un indice. Sus prinncipales caracteristicas son:
 * 
 * 		1. Tamaño fijo
 * 		2. Acceso rapido 
 * 		3. Coste elevado para insertar o eliminar elementos
 * 
 * */
