package javacore.padroesdeprojeto.tests;

import javacore.padroesdeprojeto.classes.Aviao;

/**
 * TestAviao
 */
public class TestAviao {

  public static void main(String[] args) {
    agendarAssento("1A");
    agendarAssento("1A");
  }

  private static void agendarAssento(String assento) {
    Aviao a = new Aviao();

    System.out.println(a.bookAssentos(assento));
  }
}