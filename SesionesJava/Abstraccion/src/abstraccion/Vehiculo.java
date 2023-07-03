package abstraccion;

public abstract class Vehiculo {
	
	//Abstracto
	
	public String marca;
	public int año;
	
	//Metodo concreto
	
	public void mostrarInfo() {
		System.out.println("Mi auto es: " + marca + " y es del año: " + año);
	}//Cierre mostrar info
	
	//Metodo Abstracto
	public abstract void acelerar();
	
	//Metodo Abstracto
	public abstract void frenar();
	
}

/*
 *
 * Abstraccion
 *
 * En Java, una clase abstracta es una clase que no puede ser implementada directamente (que no puede instanciar), si no que se utiliza como una base para crear subclases mas concretas. Se utiliza para definir una estructura comun y compartir el comportamiento entre las subclases relacionadas.
 * 
 * Una clase abstracta puede implementar metodos concretos (metodos que hemos utilizado hasta ahorita) y metodos abstractos.
 * 
 */