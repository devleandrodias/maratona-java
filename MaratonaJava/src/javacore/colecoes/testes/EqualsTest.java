package javacore.colecoes.testes;

import javacore.colecoes.classe.Celular;

/**
 * EqualsTest
 */
public class EqualsTest {

  public static void main(String[] args) {
    String nome1 = "Leandro Dias";
    String nome2 = new String("Leandro Dias");

    Integer int1 = 10;
    Integer int2 = new Integer(10);

    System.out.println("==");
    System.out.println(nome1 == nome2); // == compara a referência
    System.out.println(int1 == int2); // == compara a referência

    System.out.println("equals");
    System.out.println(nome1.equals(nome2)); // equals compara o valor
    System.out.println(int1.equals(int2)); // equals compara o valor

    Celular cel1 = new Celular("iPhone 11 Pro Max", "12345145436sdfsd223414");
    Celular cel2 = new Celular("iPhone 11 Pro Max", "12345145436sdfsd223414");

    System.out.println("Celulares igualis (==)");
    System.out.println(cel1 == cel2);

    System.out.println("Celulares igualis (equals)");
    System.out.println(cel1.equals(cel2));
  }
}