package javacore.enums.classe;

/**
 * Cliente
 */
public class Cliente {

  public enum TipoPagamento {
    AVISTA, APRAZO
  }

  private String nome;
  private TipoCliente tipo;
  private TipoPagamento tipoPagamento;

  public Cliente(String nome, TipoCliente tipo, TipoPagamento tipoPagamento) {
    this.nome = nome;
    this.tipo = tipo;
    this.tipoPagamento = tipoPagamento;
  }

  @Override
  public String toString() {
    return "Nome: " + this.nome + ", " + this.tipo.getNome() + ", forma de pagamento: " + this.tipoPagamento;
  }

  public TipoPagamento getTipoPagamento() {
    return tipoPagamento;
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