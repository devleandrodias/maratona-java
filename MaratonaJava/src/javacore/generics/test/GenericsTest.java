package javacore.generics.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Generics só funcionam em tempo de compilação
 */
public class GenericsTest {

  public static void main(String[] args) {
    // type erasure, verifica o tipo em tempo de compilação

    List<String> lista = new ArrayList<>();

    lista.add("String 1");
    lista.add("String 2");
    lista.add("String 3");

    for (String string : lista) {
      System.out.println(string);
    }

    // add(lista, 1L);

    // for (String string : lista) {
    // System.out.println(string);
    // }

  }

  // public static void add(List list, Long l) {
  // list.add(l);
  // }
}