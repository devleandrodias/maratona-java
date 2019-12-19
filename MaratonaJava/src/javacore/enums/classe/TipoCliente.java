package javacore.enums.classe;

/**
 * Nunca vai chamar um contrutor de uma enumeração ele próprio vai se chamar.
 */
public enum TipoCliente {

  // As constantes da enumeração precisam ser a primeira da linha.
  PESSOA_FISICA(1, "Pessoa Física"), PESSOA_JURIDICA(2, "Pessoa Júridica");

  private int tipo;
  private String nome;

  TipoCliente() {

  }

  TipoCliente(int tipo, String nome) {
    this.tipo = tipo;
    this.nome = nome;
  }

  public int getTipo() {
    return tipo;
  }

  public String getNome() {
    return nome;
  }

}