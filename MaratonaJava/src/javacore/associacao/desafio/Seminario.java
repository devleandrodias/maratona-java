package javacore.associacao.desafio;

/**
 * Seminario
 */
public class Seminario {
  private String titulo;

  private Aluno[] alunos;
  private Professor professor;
  private Local local;

  public Seminario() {

  }

  public Seminario(String titulo) {
    this.titulo = titulo;
  }

  public void printSeminario() {
    System.out.println("Título: " + this.titulo);
    System.out.println("Professor palestrante: " + this.professor.getNome());

    if (this.local != null)
      System.out.println("Local, rua " + this.local.getRua() + ", bairro " + this.local.getBairro());
    else
      System.out.println("Nenhum local cadastrado para esse seminário.");

    if (alunos != null && alunos.length != 0) {

      System.out.println("-- Alunos participantes --");

      for (Aluno aluno : alunos) {
        System.out.println("Aluno: " + aluno.getNome());
      }

      return;
    }

    System.out.println("Nenhum aluno encontrado.");
  }

  public Local getLocal() {
    return local;
  }

  public void setLocal(Local local) {
    this.local = local;
  }

  public Professor getProfessor() {
    return professor;
  }

  public void setProfessor(Professor professor) {
    this.professor = professor;
  }

  public Aluno[] getAlunos() {
    return alunos;
  }

  public void setAlunos(Aluno[] alunos) {
    this.alunos = alunos;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getTitulo() {
    return titulo;
  }
}