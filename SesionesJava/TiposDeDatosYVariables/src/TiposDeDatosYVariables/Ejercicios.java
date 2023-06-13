/**
 * 
 */
package TiposDeDatosYVariables;

/**
 * @author Eliseo de Haro
 *
 */
public class Ejercicios {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hola mundo");
		
		
		//Cine Java
		
		//byte: sirve para representar un valor numérico de 8bits
		
		byte salas = 10;
		System.out.println(salas);
		
		//short: sirve para representar un valor numérico de 16bits
		
		short asientos = 1120;
		System.out.println(asientos);
		
		
		//int : sirve para almacenar un valor numérico 
		
		int dulces = 3476;
		System.out.println(dulces);
		
		//long: sirve para representar un valor numérico de 64bits
		
		long clientes = 313600;
		System.out.println(clientes);
		
		//float: sirve para almacenar un valor numérico de 23bits
		
		float palomitas = 35.5f;
		System.out.println(palomitas);
		
		//double: Sirve para representar un valor numérico de 64bits
		
		double ganancia = 23770880.7d;
		System.out.println(ganancia);
		
		//boolean: Sirve para representar valores booleanos y solamente tiene dos salidas, verdadero y falso
		//char: Sirve para representar un caracter o un número (pero solamente uno)
		
		//casting o casteo: Sirve para realizar una conversión de tipos de datos a uno más grande o más pequeño, incluso
		
		double num = 59.7d;
		
		//casteo a entero
		int numInt = (int)num;
		System.out.println("double " + num + " a int: "+ numInt);
		
		long numlong = (long)num;
		System.out.println("long " + numlong);
		
		String cantidad = "85";
		String precio = "59.7";
		
		int cantEntero = Integer.parseInt(cantidad);
		double precioDouble = Double.parseDouble(precio);
		System.out.println("El valor de la compra es: " + (cantEntero*precioDouble));
		
		//Operadores aritméticos
		int dias = 28;
		dias = dias *2;
		System.out.println("Días: " + dias);
		
		//Operadores de incremento y decremento
		
		int p=0;
		p++;
		p++;
		p++;
		System.out.println(p);
		
		 /*
		 Operadores relacionales
		 == compara si un operando es igual a otro
		 != diferente a
		 > mayor que
		 < menor que
		 >= mayor igual que
		 <= menor igual que 
		 */
		int a = 10;
		int b = 15;
		boolean resultado;
		resultado = a>b;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("a>b: "+resultado);
		
	}

}
