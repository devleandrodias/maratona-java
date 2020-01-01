package javacore.colecoes.classe;

/**
 * Produto
 */
public class Produto implements Comparable<Produto> {

  private String serialNumber;
  private String nome;
  private double preco;
  private int quantidade;

  public Produto(String serialNumber, String nome, double preco) {
    this.serialNumber = serialNumber;
    this.nome = nome;
    this.preco = preco;
  }

  public Produto(String serialNumber, String nome, double preco, int quantidade) {
    this.serialNumber = serialNumber;
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;

    Produto produto = (Produto) obj;

    return serialNumber != null ? serialNumber.equals(produto.serialNumber) : produto.serialNumber == null;
  }

  @Override
  public int hashCode() {
    return serialNumber != null ? serialNumber.hashCode() : 0;
  }

  @Override
  public String toString() {
    return this.nome;
  }

  @Override
  public int compareTo(Produto outroObjeto) {
    // Negtivo se thisObject < outroObjeto
    // Zero se thisObject == outroObjeto
    // Positivo this.object > outroObjeto

    // compara duas strings de dois objetos
    return this.nome.compareTo(outroObjeto.getNome());
  }

  public String getNome() {
    return nome;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public double getPreco() {
    return preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }
}