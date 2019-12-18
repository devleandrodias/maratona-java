package javacore.heranca.classe;

/**
 * O modificador de acesso protected permite a visibilidade dos métodos apenas
 * para classes que serão herdeiras e pela própria classe.
 */
public class Pessoa extends Object {

  // Todas as classes são filhas de uma classe mais abstrata Object

  protected String nome, cpf;
  protected Endereco endereco;

  public Pessoa(String nome) {
    super(); // Implicitamente sempre está aqui.
    this.nome = nome;
  }

  public Pessoa(String nome, String cpf) {
    this(nome);
    this.cpf = cpf;
  }

  public void imprime() {
    System.out.println("Contribuinte: " + this.nome + ", inscrito pelo CPF de nº " + this.cpf
        + ", sediado no endereço rua " + this.endereco.getRua() + " no bairro " + this.endereco.getBairro());
  }

  public String getNome() {
    return nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public Endereco getEndereco() {
    return endereco;
  }
}