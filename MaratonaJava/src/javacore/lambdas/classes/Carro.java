package javacore.lambdas.classes;

/**
 * Carro
 */
public class Carro {

  private String nome = "GOL";
  private String cor;
  private int ano;

  public Carro(String cor, int ano) {
    this.cor = cor;
    this.ano = ano;
  }

  @Override
  public String toString() {
    return "{" + " nome='" + getNome() + "'" + ", cor='" + getCor() + "'" + ", ano='" + getAno() + "'" + "}";
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCor() {
    return this.cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public int getAno() {
    return this.ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }
}