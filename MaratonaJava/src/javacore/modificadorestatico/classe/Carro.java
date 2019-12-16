package javacore.modificadorestatico.classe;

/**
 * Classe de Carro
 */
public class Carro {

  private String nome;
  private double velocidadeMaxima;

  /**
   * Um operador estático vai servir como um mebro da classe, ele não é específico
   * do objeto e sim da classe. E sempre será compartilhando entre todos os
   * objetos daquela classe.
   */

  private static double velocidadeLimite = 240;

  public Carro() {

  }

  public Carro(String nome, double velocidadeMaxima) {
    this.nome = nome;
    this.velocidadeMaxima = velocidadeMaxima;
  }

  /**
   * A regra diz que você pode transformar qualquer método em estático desde que
   * eles não estejam acessando atributos de classe (this). Antes mesmo de existir
   * objetos em meméria já existem atributos da classe. Ex. this.nome não existe
   * se não for instânciado um objeto da classe, mas o método imprimeCarro pode
   * ser excutado mesmo que não seja instânciado.
   */

  public void imprimeCarro() {
    System.out.println("==============================");
    System.out.println("Modelo: " + this.nome);
    System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
    System.out.println("Velocidade Limite: " + velocidadeLimite);
  }

  /**
   * @param nome the nome to set
   */
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * @return the nome
   */
  public String getNome() {
    return nome;
  }

  /**
   * @param velocidadeMaxima the velocidadeMaxima to set
   */
  public void setVelocidadeMaxima(double velocidadeMaxima) {
    this.velocidadeMaxima = velocidadeMaxima;
  }

  /**
   * @return the velocidadeMaxima
   */
  public double getVelocidadeMaxima() {
    return velocidadeMaxima;
  }

  /**
   * @param velocidadeLimite the velocidadeLimite to set
   */
  public static void setVelocidadeLimite(double velocidadeLimite) {
    Carro.velocidadeLimite = velocidadeLimite;
  }

  /**
   * @param velocidadeLimite the velocidadeLimite to get
   */
  public static void getVelocidadeLimite(double velocidadeLimite) {
    Carro.velocidadeLimite = velocidadeLimite;
  }
}