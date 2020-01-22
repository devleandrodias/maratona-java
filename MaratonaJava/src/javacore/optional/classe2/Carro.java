package javacore.optional.classe2;

import java.util.Objects;

/**
 * Carro
 */
public class Carro {
  private Seguradora seguradora;
  private String nome;

  public String getNomeSeguradora(Pessoa p) {
    if (p != null) {
      Carro c = p.getCarro();
      if (c != null) {
        Seguradora s = c.getSeguradora();
        if (s != null) {
          return s.getNome();
        }
      }
    }
    return "";
  }

  public Carro() {
  }

  public Carro(Seguradora seguradora, String nome) {
    this.seguradora = seguradora;
    this.nome = nome;
  }

  public Seguradora getSeguradora() {
    return this.seguradora;
  }

  public void setSeguradora(Seguradora seguradora) {
    this.seguradora = seguradora;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Carro seguradora(Seguradora seguradora) {
    this.seguradora = seguradora;
    return this;
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
    return Objects.equals(seguradora, carro.seguradora) && Objects.equals(nome, carro.nome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seguradora, nome);
  }

  @Override
  public String toString() {
    return "{" + " seguradora='" + getSeguradora() + "'" + ", nome='" + getNome() + "'" + "}";
  }

}