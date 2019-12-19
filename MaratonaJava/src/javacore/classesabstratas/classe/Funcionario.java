package javacore.classesabstratas.classe;

/**
 * Classes abstratas não podem ser instânciadas, só poderá ser unicamente
 * extendida. E possui caracteristicas que serão usadas pela subclasse.
 */
public abstract class Funcionario extends Pessoa {

  protected String clt;
  protected double salario;

  /**
   * Métodos abstratos devem ser implmentados na primeira classe concreta que não
   * foram implementados anteriormente;
   * 
   * Casos imprimir for implmentado em Funcionário, Gerente e Vendedor não
   * precisam implementa-lo.
   */

  public Funcionario() {

  }

  public Funcionario(String nome, String clt, double salario) {
    this.nome = nome;
    this.clt = clt;
    this.salario = salario;
  }

  // Isso e é um método não abstratos (Concreto), e está correto.
  @Override
  public String toString() {
    return this.nome + ", ganha: R$" + this.salario;
  }

  /**
   * Métodos abstratos não possuem implementação e devem <obrigatóriamente> ser
   * sobrescritos pelas classes que as herdam. E deve obrigatóriamente estar em
   * uma classe abstratas, mas uma classa abstrata pode ter um ou mais ou nenhum
   * método abstrato.
   */
  public abstract void calculaSalario();

  public String getNome() {
    return nome;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public String getClt() {
    return clt;
  }

  public void setClt(String clt) {
    this.clt = clt;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

}