package javacore.introducaometodos.classe;

/**
 * Crie uma classe Estudante com seguintes atributos Nome; Idade; Notas (Três
 * notas);
 * 
 * Crie um método para imprimir os dados e tirar a média desse aluno caso a
 * média seja maior que 6 imprimir aprovado se não reprovado
 */
public class Estudante {
  public String nome;
  public int idade;
  public double[] notas;

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
}