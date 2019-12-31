package javacore.colecoes.testes;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Retorna o índicie do elemento caso o encontre
 */
public class BuscaBinaria {

  public static void main(String[] args) {
    List<Integer> numeros = new ArrayList<>();

    numeros.add(3);
    numeros.add(0);
    numeros.add(4);
    numeros.add(4);
    numeros.add(2);

    /**
     * A lista já precisa estar ordenada.
     * 
     * (-(ponto de inserção) -1)
     */

    Collections.sort(numeros);
    // 0, 1, 2, 3, 4
    // 0, 2, 3, 4, 4
    System.out.println(Collections.binarySearch(numeros, 2));
    System.out.println(numeros.get(Collections.binarySearch(numeros, 2)));
  }
}