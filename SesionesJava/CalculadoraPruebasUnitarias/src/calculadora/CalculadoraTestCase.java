package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class CalculadoraTestCase {

	@Test
	void testSumar() {
		int resultado = Calculadora.suma(2, 3);
		Assert.assertEquals(5, resultado); //lo que espero y lo que tengo
		
	}
	
	@Test
	void testMultiplicar () {
		int resultado = Calculadora.multiplicar(2, 3);
		Assert.assertEquals(6, resultado);
	}
	
	@Test
	void testDividir() {
		float resultado = Calculadora.dividir(6.0f, 2.0f);
		Assert.assertEquals(3.0f, resultado);
	}
	

}
