package com.example.junit4.tdd;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class MatematicaTest {

	@Test
	public void testMultiplicar() {
		
		double x = 5.0;
		double y = 4.0;
		
		double comparar = 20;
		double resultado = Matematica.multiplicar(x, y);
		
		assertEquals(comparar, resultado, 0.00001);
	}
}
