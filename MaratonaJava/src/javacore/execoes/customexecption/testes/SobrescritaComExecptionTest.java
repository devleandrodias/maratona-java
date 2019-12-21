package javacore.execoes.customexecption.testes;

import java.io.FileNotFoundException;

import javacore.execoes.customexecption.exception.Funcionario;
import javacore.execoes.customexecption.exception.LoginInvalidExcption;
import javacore.execoes.customexecption.exception.Pessoa;

/**
 * SobrescritaComExecptionTest
 */
public class SobrescritaComExecptionTest {

  public static void main(String[] args) {
    Funcionario funcionario = new Funcionario();
    Pessoa pessoa = new Pessoa();

    /**
     * Quando você sobrescrever um método que possui um execção é opcional você
     * repassar o tratamento da execção.
     * 
     * Ou você pode declarar menos execções no método sobrescrito.
     * 
     * Mas não pode declarar execções de uma super classes das que já contem no
     * método ou criar novas execções. Mas pode colocar subclases das classes já
     * declaras do método anterior.
     */

    funcionario.salvarPessoa();

    try {
      pessoa.salvarPessoa();
    } catch (FileNotFoundException | LoginInvalidExcption e) {
      e.printStackTrace();
    }
  }
}