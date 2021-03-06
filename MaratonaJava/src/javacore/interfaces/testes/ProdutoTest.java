package javacore.interfaces.testes;

import javacore.interfaces.classe.Produto;

/**
 * ProdutoTest
 */
public class ProdutoTest {

  public static void main(String[] args) {
    Produto produto = new Produto("MacBook Air 2017", 0.975, 4200.00);

    produto.calcularImposto();
    produto.calcularFrete();

    System.out.println(produto);

    /**
     * Não se pode instanciar um interface para gerar um objeto (new). Mas pode-se
     * gerar apenas gerar sua referência.
     */
  }
}