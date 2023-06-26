package ejercicioCuentaAhorro;

public class CajaAhorro extends Cuenta{
	
	//Metodos
	public CajaAhorro(String titular, float cantidad) {
		super(titular, cantidad);
	}
	
	public void imprimirDatos() {
		System.out.println("Titular : " + titular);
		System.out.println("Cantidad: " + cantidad);
	}
	
	//toString
	@Override
	public String toString() {
		return "CajaAhorro [titular=" + titular + ", cantidad=" + cantidad + "]";
	}//toString
	
}//cahaAhorro
