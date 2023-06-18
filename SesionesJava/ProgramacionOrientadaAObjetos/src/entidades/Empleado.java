package entidades;

//Primero tengo que dar la instruccion de que quiero heredar 
public class Empleado extends Persona {
	// TODO Auto-generated constructor stub
	
	//1. Atributos o propiedades
	
	public String numEmpleado;
	public String nss;
	public String puesto;
	
	//2. Constructor con parametros (heredamos la mitad del consturctor de Persona)
	public Empleado(String nombre, int edad, String correo, String telefono, String numEpleado, String nss, String puesto) {
		super(nombre, edad, correo, telefono);
		this.numEmpleado = numEpleado;
		this.nss = nss;
		this.puesto = puesto;
	}
	
	//3. Metodo para imprimir informacion del empleado
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Correo: " + correo);
		System.out.println("Telefono: " + telefono);
		System.out.println("No. Empleado: "+ numEmpleado);
		System.out.println("NSS: "+ nss);
		System.out.println("Puesto: "+ puesto);
	} //Cierre mostrarInformacion
	
	
	
}
