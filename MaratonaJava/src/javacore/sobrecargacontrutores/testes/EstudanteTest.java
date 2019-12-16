package javacore.sobrecargacontrutores.testes;

import javacore.sobrecargacontrutores.classe.Estudante;

/**
 * Estudantetest
 */
public class EstudanteTest {

  public static void main(String[] args) {
    Estudante estudante = new Estudante("265466", "Leandro Dias", new double[] { 5.6, 8.9, 9.7 }, "07/12/2000");

    estudante.imprimeEstudante();
  }
}