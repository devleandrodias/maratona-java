package javacore.introducaometodos.testes;

import javacore.introducaometodos.classe.Professor;

/**
 * ProfessorTest
 */
public class ProfessorTest {

  public static void main(String[] args) {
    Professor professorTitular = new Professor();
    Professor professorSubstituto = new Professor();

    professorTitular.cpf = "235.235.235-2";
    professorTitular.nome = "Luís Fernando";
    professorTitular.rg = "24.235.235-X";
    professorTitular.matricula = "WGGW1422";

    professorSubstituto.cpf = "145.253.154-2";
    professorSubstituto.nome = "Marcos";
    professorSubstituto.rg = "14.652.235-X";
    professorSubstituto.matricula = "WG5531422";

    professorTitular.imprimeProfessor();

    System.out.println("===================================");

    professorSubstituto.imprimeProfessor();
  }
}