package javacore.introducaometodos.classe;

/**
 * Criar os seguintes atributos para essa classe. Nome, Matricula, RG, CPF.
 * Criar uma classe de teste para o Professor.
 */

public class Professor {
  public String nome, matricula, rg, cpf;

  /**
   * Método que imprime um professor
   * 
   * @param professor - Váriavel de referência de Professor
   */
  public void imprimeProfessor(Professor professor) {

    System.out.println(professor.cpf);
    System.out.println(professor.nome);
    System.out.println(professor.rg);
    System.out.println(professor.matricula);
  }
}