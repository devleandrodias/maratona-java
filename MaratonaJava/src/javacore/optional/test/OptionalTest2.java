package javacore.optional.test;

import java.util.Optional;

import javacore.optional.classe.Carro;
import javacore.optional.classe.Pessoa;
import javacore.optional.classe.Seguradora;

/**
 * OptionalTest2
 */
public class OptionalTest2 {

  public static void main(String[] args) {
    Seguradora seguradora = new Seguradora("Santander Seguros Automotivos");
    Carro carro = new Carro(seguradora, "Kia Cerato");
    Pessoa pessoa = new Pessoa(carro, "Leandro Dias");
    pessoa = null;
    getNomeSeguradora(Optional.ofNullable(pessoa));
  }

  /**
   * Usar FlatMap se função retornar um Optinal, usar Map se função devolver
   * resultado final
   */

  private static String getNomeSeguradora(Optional<Pessoa> p) {
    return p.flatMap(Pessoa::getCarro).flatMap(Carro::getSeguradora).map(Seguradora::getNome)
        .orElse("Não existe seguradora");
  }
}