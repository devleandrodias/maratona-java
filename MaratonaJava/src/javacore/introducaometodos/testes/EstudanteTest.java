package javacore.introducaometodos.testes;

import javacore.introducaometodos.classe.Estudante;

/**
 * EstudanteTest
 */
public class EstudanteTest {

  public static void main(String[] args) {
    Estudante estudante = new Estudante();

    estudante.setNome("Leandro");
    estudante.setIdade(19);
    estudante.setNotas(new double[] { 2.3, 9.3, 8.3 });

    estudante.calculaMediaAluno();
  }
}