package javacore.padroesdeprojeto.classes;

import java.util.Objects;

/**
 * Pessoa
 */
public class Pessoa {

  private String nome;
  private String ultimoNome;
  private String nomeMeio;
  private String apelido;
  private String nomePai;

  private Pessoa(String nome, String ultimoNome, String nomeMeio, String apelido, String nomePai) {
    this.nome = nome;
    this.ultimoNome = ultimoNome;
    this.nomeMeio = nomeMeio;
    this.apelido = apelido;
    this.nomePai = nomePai;
  }

  public static class PessoaBuilder {
    private String nome;
    private String ultimoNome;
    private String nomeMeio;
    private String apelido;
    private String nomePai;

    public PessoaBuilder(String nome) {
      this.nome = nome; // Isso torna o nome obrigatório
    }

    public PessoaBuilder nome(String nome) {
      this.nome = nome;
      return this;
    }

    public PessoaBuilder ultimoNome(String ultimoNome) {
      this.ultimoNome = ultimoNome;
      return this;
    }

    public PessoaBuilder nomeMeio(String nomeMeio) {
      this.nomeMeio = nomeMeio;
      return this;
    }

    public PessoaBuilder apelido(String apelido) {
      this.apelido = apelido;
      return this;
    }

    public PessoaBuilder nomePai(String nomePai) {
      this.nomePai = nomePai;
      return this;
    }

    public Pessoa criarPessoa() {
      return new Pessoa(nome, ultimoNome, nomeMeio, apelido, nomePai);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Pessoa)) {
      return false;
    }
    Pessoa pessoa = (Pessoa) o;
    return Objects.equals(nome, pessoa.nome) && Objects.equals(ultimoNome, pessoa.ultimoNome)
        && Objects.equals(nomeMeio, pessoa.nomeMeio) && Objects.equals(apelido, pessoa.apelido)
        && Objects.equals(nomePai, pessoa.nomePai);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, ultimoNome, nomeMeio, apelido, nomePai);
  }

  @Override
  public String toString() {
    return "{" + " nome='" + getNome() + "'" + ", ultimoNome='" + getUltimoNome() + "'" + ", nomeMeio='" + getNomeMeio()
        + "'" + ", apelido='" + getApelido() + "'" + ", nomePai='" + getNomePai() + "'" + "}";
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getUltimoNome() {
    return this.ultimoNome;
  }

  public void setUltimoNome(String ultimoNome) {
    this.ultimoNome = ultimoNome;
  }

  public String getNomeMeio() {
    return this.nomeMeio;
  }

  public void setNomeMeio(String nomeMeio) {
    this.nomeMeio = nomeMeio;
  }

  public String getApelido() {
    return this.apelido;
  }

  public void setApelido(String apelido) {
    this.apelido = apelido;
  }

  public String getNomePai() {
    return this.nomePai;
  }

  public void setNomePai(String nomePai) {
    this.nomePai = nomePai;
  }
}