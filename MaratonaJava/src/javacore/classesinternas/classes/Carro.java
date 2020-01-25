package javacore.classesinternas.classes;

import java.util.Objects;

/**
 * Carro
 */
public class Carro {

  private String nome;

  public Carro() {
  }

  public Carro(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Carro nome(String nome) {
    this.nome = nome;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Carro)) {
      return false;
    }
    Carro carro = (Carro) o;
    return Objects.equals(nome, carro.nome);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(nome);
  }

  @Override
  public String toString() {
    return "{" + " nome='" + getNome() + "'" + "}";
  }

}