package javacore.associacao.desafio;

/**
 * Aluno
 */
public class Aluno {
  private String nome;
  private int idade;

  private Seminario seminario;

  public Aluno() {

  }

  public Aluno(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  public void printAluno() {
    System.out.println("Nome: " + this.nome);
    System.out.println("Idade: " + this.idade);

    if (this.seminario != null)
      System.out.println("Seminário inscrito: " + this.seminario.getTitulo());
    else
      System.out.println("Aluno não inscrito em nenhum seminário.");
  }

  /**
   * @return seminario
   */
  public Seminario getSeminario() {
    return seminario;
  }

  /**
   * @param seminario seminario
   */
  public void setSeminario(Seminario seminario) {
    this.seminario = seminario;
  }

  /**
   * @param nome the nome to set
   */
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * @return the nome
   */
  public String getNome() {
    return nome;
  }

  /**
   * @param idade the idade to set
   */
  public void setIdade(int idade) {
    this.idade = idade;
  }

  /**
   * @return the idade
   */
  public int getIdade() {
    return idade;
  }
}