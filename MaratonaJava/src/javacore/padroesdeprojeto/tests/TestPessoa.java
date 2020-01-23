package javacore.padroesdeprojeto.tests;

import javacore.padroesdeprojeto.classes.Pessoa;

/**
 * TestPessoa
 */
public class TestPessoa {

  public static void main(String[] args) {
    Pessoa p = new Pessoa.PessoaBuilder("Leandro").nomeMeio("Bemfica").ultimoNome("Dias").apelido("Leandrinho")
        .nomePai("Ronaldo").build();

    System.out.println(p);
  }
}