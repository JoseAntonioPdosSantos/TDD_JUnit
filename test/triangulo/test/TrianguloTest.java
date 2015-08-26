package triangulo.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import category.Negativo;
import category.Positivo;
import triangulo.Triangulo;

public class TrianguloTest {

	@Test
	public void testTrianguloEquilatero() {
		Triangulo triangulo = new Triangulo(3,3,3);

		assertEquals("Triângulo Equilátero", triangulo.retornaTipo());
	}
	
	@Test
	@Ignore
	public void testRetornaNull(){
		Triangulo triangulo = new Triangulo(1,2,3);
		assertNull(triangulo.retornaTipo());
	}

	@Test
	@Category(Positivo.class)
	public void testTrianduloIsosceles_lado2IgualLado3(){
		Triangulo triangulo = new Triangulo(3,3,6);
		assertEquals("Triângulo Isósceles",triangulo.retornaTipo());
	}
	
	@Test
	@Category(Positivo.class)
	public void testTrianduloIsosceles_Lado1IgualLado2(){
		Triangulo triangulo = new Triangulo(3,6,6);
		assertEquals("Triângulo Isósceles",triangulo.retornaTipo());
	}
	
	@Test
	@Category(Positivo.class)
	public void testTrianduloIsosceles_Lado1IgualLado3(){
		Triangulo triangulo = new Triangulo(6,3,6);
		assertEquals("Triângulo Isósceles",triangulo.retornaTipo());
	}
	
	@Test
	@Category(Positivo.class)
	public void testEscalendo(){
		Triangulo triangulo = new Triangulo(2,3,4);
		assertEquals("Triângulo Escaleno",triangulo.retornaTipo());
	}
	
	@Test
	@Category(Negativo.class)
	public void testTrianguloAlgumLadoValorIgualAZero(){
		Triangulo triangulo = new Triangulo(0,6,6);
		assertEquals("Triângulo Inválido",triangulo.retornaTipo());
	}
	
	@Test
	@Category(Negativo.class)
	public void testTrianguloAlgumLadoValorMenorQueZero(){
		Triangulo triangulo = new Triangulo(-1,6,6);
		assertEquals("Triângulo Inválido",triangulo.retornaTipo());
	}
	
}
