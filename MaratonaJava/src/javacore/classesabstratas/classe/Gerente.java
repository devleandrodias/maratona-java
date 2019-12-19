package javacore.classesabstratas.classe;

/**
 * Gerente
 */
public class Gerente extends Funcionario {

  public Gerente() {

  }

  public Gerente(String nome, String clt, double salario) {
    super(nome, clt, salario);
  }

  @Override
  public void calculaSalario() {
    this.salario = salario + (salario * 0.05);
  }

  // Métodos abstratos devem ser implmentados na primeira classe concreta;

  @Override
  public void imprime() {

  }
}