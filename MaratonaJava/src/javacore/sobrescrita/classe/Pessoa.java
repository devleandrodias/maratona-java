package javacore.sobrescrita.classe;

/**
 * Pessoa
 */
public class Pessoa extends Object {

  private String nome;
  private int idade;

  @Override
  public String toString() {
    return "Nome: " + this.nome + ", de idade " + this.idade + " anos.";
  }

  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}