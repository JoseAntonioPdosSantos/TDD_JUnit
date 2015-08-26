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
public class TrianguloInvalidoTestDataDriven {

	int lado1,lado2,lado3;
	String resultado;
	
	public TrianguloInvalidoTestDataDriven(int lado1,int lado2,int lado3,String resultado) {
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
			{0,2,5,interfaces.triangulo.Triangulo.TRIANGULO_INVALIDO},
			{2,0,5,interfaces.triangulo.Triangulo.TRIANGULO_INVALIDO},
			{2,4,0,interfaces.triangulo.Triangulo.TRIANGULO_INVALIDO},
			{0,5,5,interfaces.triangulo.Triangulo.TRIANGULO_INVALIDO},
			{0,0,0,interfaces.triangulo.Triangulo.TRIANGULO_INVALIDO},
			{-1,5,5,interfaces.triangulo.Triangulo.TRIANGULO_INVALIDO},
			{2,2,5,interfaces.triangulo.Triangulo.TRIANGULO_ISOSCELES},
			{2,3,2,interfaces.triangulo.Triangulo.TRIANGULO_ISOSCELES},
			{3,2,2,interfaces.triangulo.Triangulo.TRIANGULO_ISOSCELES},
			{3,5,4,interfaces.triangulo.Triangulo.TRIANGULO_ESCALENO} 
		});
	}
}
