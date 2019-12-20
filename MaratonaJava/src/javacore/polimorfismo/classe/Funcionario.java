package javacore.polimorfismo.classe;

/**
 * Funcionario
 */
public abstract class Funcionario {

  protected String nome;
  protected double salario;

  public Funcionario() {

  }

  public Funcionario(String nome, double salario) {
    this.nome = nome;
    this.salario = salario;
  }

  public abstract void calcularPagamento();

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public String getNome() {
    return this.nome;
  }

  public double getSalario() {
    return this.salario;
  }
}