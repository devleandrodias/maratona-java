package javacore.modificadorestatico.classe;

/**
 * Classe de Cliente
 */
public class Cliente {
  private static int[] parcelas;

  /**
   * CUIDADO! O bloco de inicialização estático é executado apenas uma vez quando
   * carregada.
   * 
   * Se tiver mais de um bloco estático serão executados apenas uma vez na sua
   * ordem de precedência.
   * 
   * E é executado antes de qualquer coisa.
   */

  {
    System.out.println("Bloco de inicialização não estático.");
  }

  static {
    System.out.println("Executado dentro do bloco de inicialização estático.");

    parcelas = new int[48]; // Quantidade de parcelas independe da quantidade de objetos criados

    for (int i = 1; i <= 48; i++) {
      parcelas[i - 1] = i;
    }
  }

  {
    System.out.println("Bloco de inicialização não estático 2.");
  }

  public Cliente() {

  }

  /**
   * @return the parcelas
   */
  public static int[] getParcelas() {
    return parcelas;
  }
}