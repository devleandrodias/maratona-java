package javacore.associacao.desafio;

/**
 * Professor
 */
public class Professor {
  private String nome, especialidade;

  private Seminario[] seminarios;

  public Professor() {

  }

  public Professor(String nome, String especialidade) {
    this.nome = nome;
    this.especialidade = especialidade;
  }

  public void print() {
    System.out.println("Nome do professor: " + this.nome);
    System.out.println("Especialidade do professor: " + this.especialidade);

    if (seminarios != null && seminarios.length != 0) {
      System.out.println("Seminários participantes");

      for (Seminario seminario : seminarios) {
        System.out.println("Seminário: " + seminario.getTitulo());
      }

      return;
    }

    System.out.println("Professor não vínculado a nenhum seminário.");
  }

  public Seminario[] getSeminarios() {
    return seminarios;
  }

  public void setSeminarios(Seminario[] seminarios) {
    this.seminarios = seminarios;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
  }

  public String getEspecialidade() {
    return especialidade;
  }
}