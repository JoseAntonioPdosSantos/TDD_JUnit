package triangulotestdatadriven;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import triangulo.Triangulo;

@RunWith(Parameterized.class)
public class TrianguloIsoscelesTestDataDriven {

	int lado1,lado2,lado3;
	String resultado;
	
	public TrianguloIsoscelesTestDataDriven(int lado1,int lado2,int lado3,String resultado) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.resultado = resultado;
	}
	
	@Test
	public void testParImpar(){
		Triangulo triangulo = new Triangulo(lado1,lado2,lado3);
		assertEquals("Os lados usados são: lado1: " + lado1 + ", lado2: " + lado2 +", lado3: " + lado3,resultado,triangulo.retornaTipo());
	}
	
	
	@Parameters
	public static List<Object[]> data(){
		return Arrays.asList(new Object[][]{
			{2,2,5,interfaces.triangulo.Triangulo.TRIANGULO_ESCALENO},
			{3,5,4,interfaces.triangulo.Triangulo.TRIANGULO_ESCALENO}, 
			{2,3,2,interfaces.triangulo.Triangulo.TRIANGULO_ISOSCELES},
			{3,2,2,interfaces.triangulo.Triangulo.TRIANGULO_ISOSCELES}
		});
	}
}
