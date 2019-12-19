package javacore.modificadorfinal.classe;

/**
 * Clases que tem o método final não poderá ser extendida. Mas díficil de ser
 * usado é mais usada para classes mais báses.
 */
public final class Carro {

  private String nome, marca;

  /**
   * Operador final faz com que se crie uma constânte que nuca vai mudar nem com
   * set, e sempre tem que ser inicializada.
   * 
   * Se váriavel não for estático pode se inicializar no construtor. Caso for
   * estático pode-se inicializa-la em um bloco de inicialização estático. Ou no
   * momento da declaração.
   * 
   * Operadir final para váriaveis do tipo referência. Não se pode alterar a
   * referência ele pode ter seus valores alterador se não for estático mas nunca
   * sua referência.
   */

  private static final double VELOCIDADE_LIMITE;
  private final Comprador comprador = new Comprador();

  static {
    VELOCIDADE_LIMITE = 250;
  }

  /**
   * Métodos com modificador final, não podem ser sobrescritas.
   */
  public final void imprimir() {
    System.out.println(this.marca);
  }

  @Override // Isso é um data annotation
  public String toString() {
    return "Carro: " + this.nome + ", de marca: " + this.marca;
  }

  public Comprador getComprador() {
    return comprador;
  }

  public static double getVelocidadeLimite() {
    return VELOCIDADE_LIMITE;
  }

  public String getNome() {
    return nome;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}