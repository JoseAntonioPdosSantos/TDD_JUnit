package carrinho.test;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import category.Negativo;

public class CarrinhoCompraPerformaceTest {

	@Test(timeout = 1000)
	@Category(Negativo.class)
	public void testTimeout() throws InterruptedException{
		Thread.sleep(1001);
	}
}
