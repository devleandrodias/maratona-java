package javacore.modificadorfinal.testes;

import javacore.modificadorfinal.classe.Carro;

/**
 * CarroTest
 */
public class CarroTest {

  public static void main(String[] args) {
    Carro carro = new Carro();

    System.out.println(carro.getComprador());

    carro.getComprador().setNome("Leandrin");

    System.out.println(carro.getComprador());
  }
}