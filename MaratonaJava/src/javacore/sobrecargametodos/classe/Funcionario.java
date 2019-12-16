package javacore.sobrecargametodos.classe;

/**
 * Classe de funcionário
 */
public class Funcionario {
  private String nome, cpf, rg;
  private double salario;

  public void init(String nome, String cpf, double salario) {
    this.nome = nome;
    this.cpf = cpf;
    this.salario = salario;
  }

  // Métodos de sobrecarga (Overload), Mesmo nome mas quantidade de parêmtros é
  // diferente
  public void init(String nome, String cpf, double salario, String rg) {
    init(nome, cpf, salario);
    this.rg = rg;
  }

  public void imprimeFuncionario() {
    System.out.println(this.nome);
    System.out.println(this.cpf);
    System.out.println(this.salario);
    System.out.println(this.rg);
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getCpf() {
    return this.cpf;
  }

  public void setRg(String rg) {
    this.rg = rg;
  }

  public String getRg() {
    return rg;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public double getSalario() {
    return this.salario;
  }
}