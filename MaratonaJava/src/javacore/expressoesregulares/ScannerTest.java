package javacore.expressoesregulares;

import java.util.Scanner;

/**
 * ScannerTest
 */
public class ScannerTest {

  public static void main(String[] args) {
    Scanner scaner = new Scanner("a true 100 oi");
    scaner.useDelimiter(" "); // Padrão é um espaço em branco

    // Verifica se existe
    while (scaner.hasNext()) {
      System.out.println(scaner.next());
    }

    scaner.close();

    System.out.println("========================");
    Scanner scaner2 = new Scanner("a true 100 oi");

    while (scaner2.hasNext()) {
      if (scaner2.hasNextInt()) {
        int inteiro = scaner2.nextInt();
        System.out.println(inteiro);
      } else if (scaner2.hasNextBoolean()) {
        boolean bool = scaner2.nextBoolean();
        System.out.println(bool);
      } else {
        System.out.println(scaner2.next());
      }
    }

    scaner2.close();
  }
}