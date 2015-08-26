package carrinho.de.compras;

import java.util.ArrayList;
import java.util.List;

import carrinho.de.compras.exception.ProdutoNaoEncontradoException;

public class CarrinhoDeCompra {

	private List<Produto> produtos;
	
	public CarrinhoDeCompra() {
		produtos = new ArrayList<Produto>();
	}
	
	public void add(Produto produto){
		produtos.add(produto);
	}
	
	public int getQtdProdutos(){
		return produtos.size();
	}
	
	public double getValorTotal(){
		return produtos.stream().mapToDouble(produto -> produto.getPreco()).sum();
	}
	
	public Produto getProduto(String nome) throws ProdutoNaoEncontradoException{
		int position = produtos.indexOf(new Produto(nome));
		if(position < 1) 
			throw new ProdutoNaoEncontradoException("Produto não encontrado");
		return produtos.get(position);
	}
}
