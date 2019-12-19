package javacore.classesabstratas.classe;

/**
 * Vendedor
 */
public class Vendedor extends Funcionario {

  private double totalVendas;

  public Vendedor() {

  }

  public Vendedor(String nome, String clt, double salario, double totalVendas) {
    super(nome, clt, salario);
  }

  @Override
  public void calculaSalario() {
    this.salario = salario + (this.totalVendas * 0.05);
  }

  public double getTotalVendas() {
    return totalVendas;
  }

  public void setTotalVendas(double totalVendas) {
    this.totalVendas = totalVendas;
  }

}