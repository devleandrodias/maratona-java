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

  public static double velocidadeLimite = 240;

  public Carro() {

  }

  public Carro(String nome, double velocidadeMaxima) {
    this.nome = nome;
    this.velocidadeMaxima = velocidadeMaxima;
  }

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
}