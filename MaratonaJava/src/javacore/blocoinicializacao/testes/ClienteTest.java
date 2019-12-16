package javacore.blocoinicializacao.testes;

import javacore.blocoinicializacao.classe.Cliente;

/**
 * ClienteTest
 */
public class ClienteTest {

  public static void main(String[] args) {
    Cliente cliente = new Cliente();

    System.out.println("Exibindo quantidade de parcelas possíveis.");

    for (int parcela : cliente.getParcelas()) {
      System.out.println(parcela);
    }
  }
}