package javacore.optional.classe;

import java.util.Objects;
import java.util.Optional;

/**
 * Pessoa
 */
public class Pessoa {

  private Carro carro;
  private String nome;

  public Pessoa() {
  }

  public Pessoa(Carro carro, String nome) {
    this.carro = carro;
    this.nome = nome;
  }

  public Optional<Carro> getCarro() {
    return Optional.ofNullable(this.carro);
  }

  public void setCarro(Carro carro) {
    this.carro = carro;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Pessoa carro(Carro carro) {
    this.carro = carro;
    return this;
  }

  public Pessoa nome(String nome) {
    this.nome = nome;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Pessoa)) {
      return false;
    }
    Pessoa pessoa = (Pessoa) o;
    return Objects.equals(carro, pessoa.carro) && Objects.equals(nome, pessoa.nome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carro, nome);
  }

  @Override
  public String toString() {
    return "{" + " carro='" + getCarro() + "'" + ", nome='" + getNome() + "'" + "}";
  }

}