package javacore.generics.test;

import java.util.ArrayList;
import java.util.List;

/**
 * WildCardTest
 */
abstract class Animal {

  public abstract void consulta();
}

class Cachorro extends Animal {

  @Override
  public void consulta() {
    System.out.println("Consultado cachorro...");
  }
}

class Gato extends Animal {

  @Override
  public void consulta() {
    System.out.println("Consultando gato...");
  }
}

public class WildCardTest {
  public static void main(String[] args) {
    // Cachorro[] cachorros = { new Cachorro(), new Cachorro() };
    // Gato[] gatos = { new Gato(), new Gato() };

    // consultarAnimais(cachorros);
    // consultarAnimais(gatos);

    List<Cachorro> cachorrosList = new ArrayList<>();
    cachorrosList.add(new Cachorro());

    List<Gato> gatoList = new ArrayList<>();
    gatoList.add(new Gato());

    /**
     * Quando você trabalha com coleções deve-se obrigatoriamente passar o tipo da
     * coleção
     */

    // consultarAnimais(gatoList);

    List<Animal> listAnimais = new ArrayList<>();
    consultarAnimaisList(listAnimais);
    consultarAnimaisList(cachorrosList);
    consultarAnimaisList(gatoList);
  }

  public static void consultarAnimais(Animal[] animais) {
    for (Animal animal : animais) {
      animal.consulta();
    }
  }

  /**
   * Essa lista pode ser uma lista de Animal ou qualquer subclasse de animal,e
   * prometo que não vou adionar nada.
   * 
   * @param animais
   */
  public static void consultarAnimaisList(List<? extends Animal> animais) {
    for (Animal animal : animais) {
      animal.consulta();
    }
  }

  /**
   * Qualquer classe, ou super classe de Cachorro, Java vai aceitar qualquer lista
   * ou Cachorro ou superclasse de cachorro
   */
  public static void consultarCachorrosList(List<? super Cachorro> cachorroList) {
    Cachorro c = new Cachorro();
    // Animal a = new Cachorro();
    // Object o = new Cachorro();

    cachorroList.add(c);
  }

  /**
   * Você nunca pode usar a palavra implements, sempre será extends, qualquer
   * lista que seja que passe no teste é um Comparable
   */
  // public static void ordernarLista(List<? extends Comparable> lista) {
  // Collections.sort(lista);
  // }
}