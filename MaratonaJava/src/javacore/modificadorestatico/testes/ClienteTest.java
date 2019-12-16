package javacore.modificadorestatico.testes;

import javacore.modificadorestatico.classe.Cliente;

/**
 * ClienteTest
 */
public class ClienteTest {

  public static void main(String[] args) {

    /**
     * A cada objeto criado é executado o bloco de inicilização com os mesmos
     * valores
     */

    System.out.println("Exibindo quantidade de parcelas possíveis.");

    System.out.println("Quantidade parcelas: " + Cliente.getParcelas().length + " vezes.");
    System.out.println("Quantidade parcelas: " + Cliente.getParcelas().length + " vezes.");
  }
}