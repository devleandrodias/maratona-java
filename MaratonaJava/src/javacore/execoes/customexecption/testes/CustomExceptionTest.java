package javacore.execoes.customexecption.testes;

import javacore.execoes.customexecption.exception.LoginInvalidExcption;

/**
 * CustomExceptionTest
 */
public class CustomExceptionTest {

  public static void main(String[] args) {

    try {
      logar();
    } catch (LoginInvalidExcption e) {
      e.printStackTrace();
    }
  }

  private static void logar() throws LoginInvalidExcption {
    String usuario = "devleandrodias";
    String senha = "123456";
    String usuarioDigitado = "devdias";
    String senhaDigitada = "123456";

    if (!usuario.equals(usuarioDigitado) || !senha.equals(senhaDigitada))
      throw new LoginInvalidExcption();
    else
      System.out.println("Usuário Logado com Sucesso!");
  }
}