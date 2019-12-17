package javacore.associacao.testes;

import javacore.associacao.desafio.Aluno;
import javacore.associacao.desafio.Local;
import javacore.associacao.desafio.Professor;
import javacore.associacao.desafio.Seminario;

/**
 * AssociacaoTest
 */
public class AssociacaoTest {

  public static void main(String[] args) {
    Aluno aluno = new Aluno("Leandro Dias", 19);
    Aluno aluno2 = new Aluno("Thaísa", 20);
    Aluno aluno3 = new Aluno("Rhaira", 19);

    System.out.println("=============== RELATÓRIO DE SEMINÁRIOS ===============");

    Seminario seminario = new Seminario("Como ser um grande desenvolvedor!");

    Professor professor = new Professor("Yoda", "Usar a força para programar.");

    Local local = new Local("Rua Aurora", "Vila Tibério");

    aluno.setSeminario(seminario);
    aluno2.setSeminario(seminario);
    aluno3.setSeminario(seminario);

    seminario.setProfessor(professor);

    seminario.setLocal(local);

    seminario.setAlunos(new Aluno[] { aluno, aluno2, aluno3 });

    Seminario[] seminarioArray = new Seminario[1];
    seminarioArray[0] = seminario;
    professor.setSeminarios(seminarioArray);

    seminario.printSeminario();
  }
}