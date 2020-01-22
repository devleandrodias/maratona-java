package javacore.optional.test;

import java.util.Optional;

/**
 * OptionalTest1
 */
public class OptionalTest1 {

  private String nome;

  public static void main(String[] args) {
    OptionalTest1 ot = new OptionalTest1();

    // NullPointerException (Evitando), Ela pode ou não existir
    // Optional<String> optional1;

    // Quando tem certeza que não vai ser nulo
    Optional<String> optional2 = Optional.of("DevDojo");

    // Quando Optional vem vazio
    Optional<String> optional3 = Optional.empty();

    // Quando tem uma váriavel mas não tem certeza que tem valor
    Optional<String> optional4 = Optional.ofNullable(ot.nome);

    System.out.println(optional2);
    System.out.println(optional3);
    System.out.println(optional4);

    // Buscando valores

    // Se váriavel for nula vai ter problemas
    System.out.println(optional2.get());

    // Se existir retorna, caso constrario, retorne isso/
    System.out.println(optional3.orElse("Não Encontrado..."));
    System.out.println(optional3.orElse(null));

    System.out.println(optional4.isPresent());
  }
}