package entidades;

public class Persona {
	
	//1. Propiedad o Atributos
	
	public String nombre;
	public int edad;
	public String correo;
	public String telefono;
	
	//2. Constructor
	
	public Persona(String nombre, int edad, String correo, String telefono) {
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
		this.telefono = telefono;
	} //Cierre de constructor
	
	
	
	//3. Metodos
	
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Correo: " + correo);
		System.out.println("Telefono: " + telefono);
	} //Cierre mostrarInformacion
	
	//Metodo para convertir dolares a pesos (funcion que retorna flotantes)
    public float conversor(float conversionDolar) {
        float dolar = 16.50f;
        float conversion = dolar*conversionDolar;
        System.out.println(conversion);
        return conversion;
    }//cierre de conversor

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instancia de un objeto Perosna
		Persona Felipe = new Persona("Felipe", 31, "felipe.maqueda@idr.edu.mx", "5512345678");
		
		Felipe.mostrarInformacion();
		
		Persona Ricardo = new Persona("Ricardo", 28, "elidharolpz@gmail.com", "5548609841");
		
		Ricardo.mostrarInformacion();
		
		Persona Guadalupe = new Persona("Guadalupe", 52, "pillalokez@gmail.com", "5548608899");
		
		Guadalupe.mostrarInformacion();
		
		Persona Perejil = new Persona("Perejil", 3, "N/A", "N/A");
		
		Perejil.mostrarInformacion();
		
		
		//conversor();

	} //Cierre del main

} //Cierre de clase Persona
