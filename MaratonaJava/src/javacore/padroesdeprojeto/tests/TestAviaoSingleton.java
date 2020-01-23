package javacore.padroesdeprojeto.tests;

import java.lang.reflect.InvocationTargetException;

import javacore.padroesdeprojeto.classes.AviaoSingleton;

/**
 * TestAviaoSingleton
 */
public class TestAviaoSingleton {

  public static void main(String[] args)
      throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

    // AviaoSingleton a = AviaoSingleton.getINSTANCE();
    // AviaoSingleton b = null;

    // Criar um objeto de um construtor privado
    // Constructor[] construtores = AviaoSingleton.class.getDeclaredConstructors();

    // for (Constructor constructor : construtores) {
    // constructor.setAccessible(true);
    // b = (AviaoSingleton) constructor.newInstance();
    // break;
    // }

    // System.out.println(a.hashCode());
    // System.out.println(b.hashCode());

    agendarAssento("1A");
    agendarAssento("1A");
  }

  private static void agendarAssento(String assento) {

    AviaoSingleton a = AviaoSingleton.getINSTANCE();

    System.out.println(a.bookAssentos(assento));
  }
}