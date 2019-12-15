package javacore.introducaoclasses.testes;

import javacore.introducaoclasses.classe.Professor;

/**
 * ProfessorTest
 */
public class ProfessorTest {

  public static void main(String[] args) {
    Professor professor = new Professor();
    Professor professorSubstituto = new Professor();

    professor.nome = "Viviana";
    professor.cpf = "500.011.014-12";
    professor.rg = "24.253.523-X";
    professor.matricula = "234252A";

    System.out.println(professor.nome);
    System.out.println(professor.cpf);
    System.out.println(professor.rg);
    System.out.println(professor.matricula);

    System.out.println("=================================");

    professorSubstituto.nome = "Eduardo";
    professorSubstituto.cpf = "500.235.253-25";
    professorSubstituto.rg = "23.223.233-X";
    professorSubstituto.matricula = "2342553A";

    System.out.println(professorSubstituto.nome);
    System.out.println(professorSubstituto.cpf);
    System.out.println(professorSubstituto.rg);
    System.out.println(professorSubstituto.matricula);
  }
}