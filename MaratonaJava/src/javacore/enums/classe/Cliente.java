package javacore.enums.classe;

/**
 * Cliente
 */
public class Cliente {

  private String nome;
  private TipoCliente tipo;

  public Cliente(String nome, TipoCliente tipo) {
    this.nome = nome;
    this.tipo = tipo;
  }

  @Override
  public String toString() {
    return "Nome: " + this.nome + ", " + this.tipo;
  }

  public String getNome() {
    return nome;
  }

  public TipoCliente getTipo() {
    return tipo;
  }

  public void setTipo(TipoCliente tipo) {
    this.tipo = tipo;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

}