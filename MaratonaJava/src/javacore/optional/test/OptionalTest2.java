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
    Pessoa pessoa = new Pessoa(carro, "Leandro Dias", 19);

    checkNomeSeguradora(seguradora);
    checkNomeSeguradoraOptional(seguradora);

    getNomeSeguradora(Optional.ofNullable(pessoa));
    System.out.println(getNomeSeguradoraComIdade(pessoa, 18));

    System.out.println(stringToInt("A"));
  }

  /**
   * 
   * @param numero em formato string que será convertido para inteiro
   * @return caso não seja possível converter string em um inteiro será retornado
   *         um Optional.empty()
   */
  private static Optional<Integer> stringToInt(String numero) {
    try {
      return Optional.ofNullable(Integer.parseInt(numero));
    } catch (NumberFormatException e) {
      return Optional.empty();
    }
  }

  private static void checkNomeSeguradora(Seguradora s) {
    if (s != null && s.getNome().equals("Santander Seguros Automotivos")) {
      System.out.println("É Seguradora do Santander");
    }
  }

  private static void checkNomeSeguradoraOptional(Seguradora s) {
    Optional.ofNullable(s).filter(x -> x.getNome().equals("Santander Seguros Automotivos"))
        .ifPresent(y -> System.out.println("É Seguradora do Santander"));
  }

  public static String getNomeSeguradoraComIdade(Pessoa p, int idadeMinima) {
    return Optional.ofNullable(p).filter(pessoa -> pessoa.getIdade() >= idadeMinima).flatMap(Pessoa::getCarro)
        .flatMap(Carro::getSeguradora).map(Seguradora::getNome)
        .orElse("Não existe seguradora, ou idade mínima não foi atingida");
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