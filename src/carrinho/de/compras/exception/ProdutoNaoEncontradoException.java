package carrinho.de.compras.exception;

@SuppressWarnings("serial")
public class ProdutoNaoEncontradoException extends Exception {

	public ProdutoNaoEncontradoException() {
		super();
	}

	public ProdutoNaoEncontradoException(String mensage) {
			super(mensage);
	}
}
