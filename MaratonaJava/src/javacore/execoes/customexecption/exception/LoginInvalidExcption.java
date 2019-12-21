package javacore.execoes.customexecption.exception;

/**
 * LoginInvalidExcption
 */
public class LoginInvalidExcption extends Exception {

  private static final long serialVersionUID = 1L;

  public LoginInvalidExcption() {
    super("Usuário ou senha inválidos.");
  }
}