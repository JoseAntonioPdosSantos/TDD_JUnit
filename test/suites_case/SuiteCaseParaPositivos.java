package suites_case;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import carrinho.test.CarrinhoTest;
import category.Positivo;
import triangulo.test.TrianguloTest;

@RunWith(Categories.class)
@IncludeCategory(Positivo.class)
@SuiteClasses({CarrinhoTest.class,TrianguloTest.class})
public class SuiteCaseParaPositivos {

}
