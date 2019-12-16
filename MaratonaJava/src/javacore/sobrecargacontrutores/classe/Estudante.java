package javacore.sobrecargacontrutores.classe;

/**
 * Estudante
 */
public class Estudante {

  private String matricula, nome, dataMatricula;
  private double[] notas;

  public Estudante() {

  }

  public Estudante(String matricula, String nome, double[] notas) {
    this.matricula = matricula;
    this.nome = nome;
    this.notas = notas;
  }

  public Estudante(String matricula, String nome, double[] notas, String dataMatricula) {
    /**
     * Assim método especial para chamar um construtor dentro de outro, por padrão
     * vem default. Só pode chamar um contrutor dentro de outro construtor nunca
     * pode chamar um contrutor dentro de um método. Quando for fazer a chamada de
     * um contrutor dentro de outro obrigatoriamento a chamada de this() precisa
     * obrigatoriamente se a primeira linha
     */
    this(matricula, nome, notas);
    this.dataMatricula = dataMatricula;
  }

  public void imprimeEstudante() {
    System.out.println(this.nome);
    System.out.println(this.matricula);
    for (double nota : notas) {
      System.out.println(nota + " ");
    }
  }

  /**
   * @param matricula the matricula to set
   */
  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  /**
   * @return the matricula
   */
  public String getMatricula() {
    return matricula;
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
   * @return the notas
   */
  public double[] getNotas() {
    return notas;
  }

  /**
   * @param notas the notas to set
   */
  public void setNotas(double[] notas) {
    this.notas = notas;
  }

  /**
   * @param dataMatricula the dataMatricula to set
   */
  public void setDataMatricula(String dataMatricula) {
    this.dataMatricula = dataMatricula;
  }

  /**
   * @return the dataMatricula
   */
  public String getDataMatricula() {
    return dataMatricula;
  }

}