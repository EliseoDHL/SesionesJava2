package CondicionalesYCiclos;

import java.util.Scanner;

public class CondicionalesYCilclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//lo que pasa en la funcion, se queda en la funcion
		
			final int edad = 31; //que esta variable es constante, ya tiene un valor final
			
			// edad = 55;
			
			System.out.println("La edad es: " + edad);
			
			/*
			 * Condicionales
			 * 
			 * if
			 * else
			 * else if 
			 * switch
			 * 
			 */
			
			System.out.println("Programa para calcular la hora");
			
			//Equivalente al prompt en JS se llama Scanner
			
			Scanner valorIngresado = new Scanner(System.in);
			
			System.out.println("Por favor, ingresa una hora en un formato de 24 hrs");
			
			int hora = valorIngresado.nextInt();
			
			// int hora = 13; declaramos una variable
			
			if(hora >= 0 && hora <= 23) {
				System.out.println("Hora ingresada correctamente");
				
				if(hora >= 7 && hora <=11) {
					System.out.println("Buenos dias solecito");
				}else if(hora >= 12 && hora <=18) {
					System.out.println("Buenas tardes, que calor hace");
				} else if(hora >= 19 && hora <24) {
					System.out.println("Buenas noches, a mimir");
				}else {
					System.out.println("Es de madrugada, no es bueno desvelarse");
				}
			} else {
				System.out.println("Hora mal ingresada");
			}
			
			valorIngresado.close(); //Cierre del Scanner
			
			/* Condicional switch */
			
			int opcion = 1;
			
			switch(opcion) {
			
			
			case 1:
				System.out.println("Bienvenido al servicio de reservas");
				break;
				
			case 2:
				System.out.println("Bienvenido al servicio de check-in");
				break;
			
			case 3:
				System.out.println("Bienvenido al servicio de check-out");
				break;
				
			default:
				System.out.println("Opcion invalida");
				break;
				
			}//Cierre del switch
			
			//Ejemplo del switch anidado
//			int entradaDeDato = 5;
//			
//			switch(entradaDeDato) {
//			case 1:
//				switch(otraOpcion) {
//				case 1:
//					System.out.println("Esta es la primera opcion del primer caso");
//					break;
//				case 2:
//					System.out.println("Esta es la segunda opcion del primer caso");
//					break;
//					default:
//						System.out.println("Opcion Invalida");
//				}//Cierre switch interno
//			}//Cierre switch general
			
			
			
		
			
			
			
		
	}//Cierre del metodo main
	
} //Cierre de la clase condicionales
