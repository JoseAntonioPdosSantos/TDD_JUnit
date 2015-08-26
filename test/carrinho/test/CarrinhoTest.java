package carrinho.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;

import carrinho.de.compras.CarrinhoDeCompra;
import carrinho.de.compras.Produto;
import carrinho.de.compras.exception.ProdutoNaoEncontradoException;
import category.Negativo;
import category.Positivo;

public class CarrinhoTest {

	CarrinhoDeCompra carrinho;
	@Rule
    public ExpectedException thrown = ExpectedException.none();
	
	@Before
	public void preCodicao(){
		carrinho = new CarrinhoDeCompra();
		carrinho.add(new Produto("Café Brasileiro",7.8));
		carrinho.add(new Produto("Nescal",9.99));
	}
	
	@After 
	public void posCodicao(){
		System.out.println("Executando a pós condição");
	}
	
	@Test
	@Category(Positivo.class)
	public void testQuatidadeTotalDeProdutosNoCarrinho() {
		assertEquals(2,carrinho.getQtdProdutos());
	}
	
	@Test 
	@Category(Positivo.class)
	public void testValorTotalDeProdutosNoCarrinho() {
		assertEquals(17.79 ,carrinho.getValorTotal(),0.0);
	}
	
	@Test
	@Category(Positivo.class)
	public void testValorTotalDeProdutosNoCarrinhoVazio() {
		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		assertEquals(0,carrinho.getQtdProdutos());
	}
	
	@Test
	@Category(Negativo.class)
	public void testPesquisaProduto() throws ProdutoNaoEncontradoException{
		assertNotNull(carrinho.getProduto("Nescal"));
		Produto nescal = new Produto("Nescal");
		Produto p = carrinho.getProduto("Nescal");
		assertEquals(nescal,p);
	}
	
	@Test
	@Category(Positivo.class)
	public void testPesquisaProdutoNaoEncontrado() throws ProdutoNaoEncontradoException{
		
		 thrown.expect(ProdutoNaoEncontradoException.class);
		 thrown.expectMessage("Produto não encontrado");
		 carrinho.getProduto("Acucar");

	}
	

}
