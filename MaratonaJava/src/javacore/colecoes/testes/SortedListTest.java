package javacore.colecoes.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * SortedListTest
 */
public class SortedListTest {

  public static void main(String[] args) {
    List<String> nomes = new ArrayList<>();

    nomes.add("Leandro Dias");
    nomes.add("Thaísa Castro");
    nomes.add(0, "Rhaira Gabrielle");

    Collections.sort(nomes);

    List<Double> numeros = new ArrayList<>();

    numeros.add(1.235);
    numeros.add(1.221);
    numeros.add(1.0);
    numeros.add(1.521);
    numeros.add(1.124);

    for (String nome : nomes) {
      System.out.println(nome);
    }

    for (Double numero : numeros) {
      System.out.println(numero);
    }
  }
}