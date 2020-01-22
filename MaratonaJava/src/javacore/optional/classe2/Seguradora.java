package javacore.optional.classe2;

import java.util.Objects;

/**
 * Seguradora
 */
public class Seguradora {

  private String nome;

  public Seguradora() {
  }

  public Seguradora(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Seguradora nome(String nome) {
    this.nome = nome;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Seguradora)) {
      return false;
    }
    Seguradora seguradora = (Seguradora) o;
    return Objects.equals(nome, seguradora.nome);
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