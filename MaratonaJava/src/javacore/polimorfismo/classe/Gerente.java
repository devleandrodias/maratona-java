package javacore.polimorfismo.classe;

/**
 * Gerente
 */
public class Gerente extends Funcionario {

  private double participacaoLucrosResultados;

  public Gerente(String nome, double salario, double participacaoLucrosResultados) {
    super(nome, salario);
    this.participacaoLucrosResultados = participacaoLucrosResultados;
  }

  public double getParticipacaoLucrosResultados() {
    return participacaoLucrosResultados;
  }

  public void setParticipacaoLucrosResultados(double participacaoLucrosResultados) {
    this.participacaoLucrosResultados = participacaoLucrosResultados;
  }

  @Override
  public void calcularPagamento() {
    this.salario += this.participacaoLucrosResultados;
  }

}