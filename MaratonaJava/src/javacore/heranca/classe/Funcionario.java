package javacore.heranca.classe;

/**
 * Não existe múltipla herança em Java. O método imprime de Funcionário
 * sobrescreveu o método Imprime de Pessoa desde que seja igual. se não ele vira
 * sobrecargas.
 * 
 * super ele chama os métodos da classe pai.
 * 
 * Sobrescrita de métodos
 */
public class Funcionario extends Pessoa {

  private double salario;

  public void imprime() {
    super.imprime();
    System.out.println("Salário: " + this.salario);
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }
}
