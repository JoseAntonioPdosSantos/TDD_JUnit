package parimpar.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import parimpar.ParImpar;

public class ParImparTest {

	@Test
	public void testPar() {
		assertEquals(true,ParImpar.isPar(2));
	}

	@Test
	public void testNaoIsPar() {
		assertEquals(false,ParImpar.isPar(3));
	}
}
