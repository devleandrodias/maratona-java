package javacore.sobrescrita.testes;

import javacore.sobrescrita.classe.Pessoa;

/**
 * PessoaTest
 */
public class PessoaTest {

  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa();

    pessoa.setNome("Beatriz Castro");
    pessoa.setIdade(19);

    // Esse método .toString() foi sobrescrito
    System.out.println(pessoa);

    /**
     * Por baixo dos panos toda vez que tentamos imprimir uma referência de objeto o
     * java chama o método presente na classe Object .toString()
     */
  }
}