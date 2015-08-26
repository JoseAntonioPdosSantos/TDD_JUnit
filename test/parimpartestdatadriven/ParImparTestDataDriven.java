package parimpartestdatadriven;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import parimpar.ParImpar;

@RunWith(Parameterized.class)
public class ParImparTestDataDriven {

	int number;
	boolean resultado;
	
	public ParImparTestDataDriven(int number,boolean resultado) {
		this.number = number;
		this.resultado = resultado;
	}
	
	@Test
	public void testParImpar(){
		assertEquals("Usou o número: " + number,resultado,ParImpar.isPar(number));
	}
	
	
	@Parameters
	public static List<Object[]> data(){
		return Arrays.asList(new Object[][]{
			{2,true},
			{3,false},
			{40,true},
			{135,false}
		});
	}
	
}
