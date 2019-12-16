package javacore.blocoinicializacao.classe;

/**
 * Cliente
 */
public class Cliente {
  private int[] parcelas;

  // Isso é um bloco de inicialização
  {
    System.out.println("Executado dentro do bloco de inicialização.");

    parcelas = new int[48];

    for (int i = 1; i <= 48; i++) {
      parcelas[i - 1] = i;
    }
  }

  public Cliente() {
    /**
     * Regra de inicialização
     * 
     * 1 - Alocado espaço na memória para objeto que será criado;
     * 
     * 2 - Cada atributo de classe é criado e inicializado com seus valores default;
     * ou valores explicitos;
     * 
     * 3 - Bloco de inicialização é executado (Não pode passar valores para ele);
     * 
     * 4 - Contrutor é executado;
     */
    System.out.println("Dentro do construtor.");
  }

  /**
   * @param parcelas the parcelas to set
   */
  public void setParcelas(int[] parcelas) {
    this.parcelas = parcelas;
  }

  /**
   * @return the parcelas
   */
  public int[] getParcelas() {
    return parcelas;
  }
}