package abstraccion;

public class Motocicleta extends Vehiculo {

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("La motocicleta esta acelerando...");
	}
	
	//La subclase es quien decide cuando y como se sobreescribe el metodo abstracto. Es decir, la sublcase implementa el metodo.
	

	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		System.out.println("La motocicleta esta frenando...");
	}

}
