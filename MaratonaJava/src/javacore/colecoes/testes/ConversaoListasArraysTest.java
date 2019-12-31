package javacore.colecoes.testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ConversaoListasArraysTest
 */
public class ConversaoListasArraysTest {

  public static void main(String[] args) {
    List<Integer> numeros = new ArrayList<>();

    numeros.add(1);
    numeros.add(2);
    numeros.add(3);
    numeros.add(4);
    numeros.add(5);

    Integer[] numerosArray = new Integer[numeros.size()];
    Object[] obj = numeros.toArray();

    numeros.toArray(numerosArray);

    System.out.println(Arrays.toString(obj));
    System.out.println(Arrays.toString(numerosArray));

    Integer[] numerosArray2 = new Integer[4];

    numerosArray2[0] = 1;
    numerosArray2[1] = 2;
    numerosArray2[2] = 3;
    numerosArray2[3] = 4;

    List<Integer> numeros2 = Arrays.asList(numerosArray2);

    // Cuidado pois o que você altera em um reflete no outro

    numeros2.set(0, 25);

    // Caso você queira ter indepêndencia

    List<Integer> numeros3 = new ArrayList<>();

    numeros3.addAll(numeros2);

    numeros3.add(100);

    System.out.println(Arrays.toString(numerosArray2));
    System.out.println(numeros2);
    System.out.println(numeros3);
  }
}