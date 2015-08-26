package suites_case;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import carrinho.test.CarrinhoCompraPerformaceTest;
import carrinho.test.CarrinhoTest;
import category.Negativo;
import triangulo.test.TrianguloTest;

@RunWith(Categories.class)
@IncludeCategory(Negativo.class)
@SuiteClasses({CarrinhoTest.class,TrianguloTest.class,CarrinhoCompraPerformaceTest.class})
public class SuiteCaseParaNegativos {

}
