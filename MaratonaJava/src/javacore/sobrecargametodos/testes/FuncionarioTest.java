package javacore.sobrecargametodos.testes;

import javacore.sobrecargametodos.classe.Funcionario;

/**
 * FuncionarioTest
 */
public class FuncionarioTest {

  public static void main(String[] args) {
    Funcionario funcionario = new Funcionario();

    funcionario.init("Leandro Dias", "545.454.542-39", 15116.55, "57.974.848-X");

    funcionario.imprimeFuncionario();
  }
}