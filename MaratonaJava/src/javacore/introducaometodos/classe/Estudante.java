package javacore.introducaometodos.classe;

/**
 * Crie uma classe Estudante com seguintes atributos Nome; Idade; Notas (Três
 * notas);
 * 
 * Crie um método para imprimir os dados e tirar a média desse aluno caso a
 * média seja maior que 6 imprimir aprovado se não reprovado
 */
public class Estudante {
  private String nome;
  private int idade;
  private double[] notas;

  /**
   * Calcular média do aluno
   */
  public void calculaMediaAluno() {
    String status;
    double media = 0;

    if (notas == null) {
      System.out.println("Por favor informe as notas do aluno.");
      return;
    }

    for (double nota : notas) {
      media += nota;
    }

    media = (media / notas.length);

    status = media >= 6 ? "Aprovado" : "Reprovado";

    System.out.println(
        "A média do aluno: " + this.nome + " de idade " + this.idade + " anos." + " Teve uma média de:  " + media);
    System.out.println("E o aluno está: " + status);

  }

  /**
   * Métodos de Acesso(Getter; Setter;) Emcapsulam os atributos oferecendo mais
   * proteção dos dados que podem ser setados e obtidos
   */

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public void setIdade(int idade) {
    if (idade <= 0) {
      System.out.println("Não pode atribuir idade 0 ou negativa para o aluno.");
      return;
    }

    this.idade = idade;
  }

  public int getIdade() {
    return this.idade;
  }

  public void setNotas(double[] notas) {
    this.notas = notas;
  }

  public double[] getNotas() {
    return this.notas;
  }
}