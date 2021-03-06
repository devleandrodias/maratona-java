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

  {
    System.out.println("Bloco de inicialização funcionário");
  }

  static {
    System.out.println("Bloco de inicialização estático funcionário");
  }

  // Construtor obrigatório em Funcionário por que herda de Pessoa
  public Funcionario(String nome) {
    super(nome); // Deve ser primeira linha do construtor;
    System.out.println("Dentro do construtor de funcionário");
  }

  private double salario;

  public void imprime() {
    super.imprime();
    System.out.println("Salário: " + this.salario);
  }

  public void imprimeReciboPagamento() {
    System.out.println("Eu: " + super.nome + ", recebi o pagamento de: U$" + this.salario);
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }
}
