package javacore.colecoes.classe;

/**
 * Consumidor
 */
public class Consumidor {

  private String nome, cpf;

  public Consumidor(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }

  @Override
  public String toString() {
    return "nome: " + nome + ", inscrito CPF: " + cpf;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;

    if (obj == null || getClass() != obj.getClass())
      return false;

    Consumidor consumidor = (Consumidor) obj;

    return cpf != null ? cpf.equals(consumidor.cpf) : consumidor.cpf == null;
  }

  @Override
  public int hashCode() {
    return cpf != null ? cpf.hashCode() : 0;
  }

  public String getNome() {
    return nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}