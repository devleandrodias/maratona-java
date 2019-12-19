package javacore.interfaces.classe;

/**
 * Interface é como se fosse um contrato que deve sem implementado, mas não se
 * diz como deve ser implementado. Podem haver várias interfaces sendo
 * implementadas na classe.
 */
public class Produto implements ITributavel, ITransportavel {

  private String nome;
  private double peso, preco, precoFinal, valorFrete;

  public Produto() {
    super();
  }

  public Produto(String nome, double peso, double preco) {
    this.nome = nome;
    this.peso = peso;
    this.preco = preco;
  }

  @Override
  public void calcularImposto() {
    precoFinal = ((this.preco + (this.preco * IMPOSTO)) + valorFrete);
  }

  @Override
  public void calcularFrete() {
    this.valorFrete = (this.preco / peso * 0.1);
  }

  @Override
  public String toString() {
    return "O produto " + this.nome + ", de valor R$" + this.preco + ", tem imposto de " + (IMPOSTO * 100)
        + "%. Tem frete no valor de R$" + this.valorFrete + " e preço final igual a R$" + this.precoFinal;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPrecoFinal() {
    return precoFinal;
  }

  public double getValorFrete() {
    return valorFrete;
  }
}