package javacore.introducaometodos.testes;

import javacore.introducaometodos.classe.Estudante;

/**
 * EstudanteTest
 */
public class EstudanteTest {

  public static void main(String[] args) {
    Estudante estudante = new Estudante();

    estudante.nome = "Thaísa Castro";
    estudante.idade = 20;
    // estudante.notas = new double[] { 3.1, 4.2, 8.1, 7.2 };

    estudante.calculaMediaAluno();
  }
}