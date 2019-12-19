package javacore.enums.testes;

import javacore.enums.classe.Cliente;
import javacore.enums.classe.TipoCliente;

/**
 * ClienteTest
 */
public class ClienteTest {

  public static void main(String[] args) {
    Cliente cliente = new Cliente("Rhaira Gabrielle", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.APRAZO);

    System.out.println(cliente);
    System.out.println(TipoCliente.PESSOA_FISICA.getId());
    System.out.println(TipoCliente.PESSOA_JURIDICA.getId());
  }
}