package javacore.introducaometodos.classe;

/**
 * Criar os seguintes atributos para essa classe. Nome, Matricula, RG, CPF.
 * Criar uma classe de teste para o Professor.
 */

public class Professor {
  public String nome, matricula, rg, cpf;

  /**
   * Método que imprime um professor
   */
  public void imprimeProfessor() {

    System.out.println(this.cpf);
    System.out.println(this.nome);
    System.out.println(this.rg);
    System.out.println(this.matricula);
  }
}

// O this é usado para pegar os valores do próprio objeto que foi instaciado