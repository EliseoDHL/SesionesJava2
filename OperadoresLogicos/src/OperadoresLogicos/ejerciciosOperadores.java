package OperadoresLogicos;

public class ejerciciosOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 Los operadores lógicos se utilizan para combinar valores booleanos y nos devuelven un resultado verdadero, falos o nulo
		 
		 && and
		 || or
		 ! not
		  */
		
		int a=5;
		int b=3;
		
		System.out.println(a!=b && a>b);
		
		int numeroEvaluar = 23;
		
		if(numeroEvaluar%2 == 0) {
			System.out.println("El número es par");
		}
		else {
			System.out.println("El número es impar");
		}
		
	}

}
