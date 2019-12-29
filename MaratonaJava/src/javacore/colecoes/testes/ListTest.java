package javacore.colecoes.testes;

import java.util.ArrayList;
import java.util.List;

/**
 * ListTest
 */
public class ListTest {

  public static void main(String[] args) {
    // List nomes = new ArrayList(); Isso é permitido, Java 5
    List<String> nomes = new ArrayList<>();
    List<String> nomes2 = new ArrayList<>();

    nomes.add("Leandro");
    nomes.add("Thaísa");
    nomes.add("Beatriz");

    nomes.add("Leandro2");
    nomes.add("Thaísa2");
    nomes.add("Beatriz2");

    nomes.addAll(nomes2);

    for (String nome : nomes) {
      System.out.println(nome);
    }

    nomes.add("Rhaira");
    nomes.remove("Beatriz"); // Utiliza método equals para encontrar

    System.out.println("==========");

    for (int i = 0; i < nomes.size(); i++) {
      System.out.println(nomes.get(i));
    }

    System.out.println("==========");

    List<Integer> numeros = new ArrayList<>();

    numeros.add(10);

    for (Integer numero : numeros) {
      System.out.println(numero);
    }
  }
}