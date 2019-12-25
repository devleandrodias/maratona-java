package javacore.inputoutput;

import java.io.Console;

/**
 * ConsoleTest
 */
public class ConsoleTest {

  public static void main(String[] args) {
    lerDadosUsuario();
  }

  public static void lerDadosUsuario() {
    Console console = System.console();

    String nome = console.readLine("Digite seu nome: ");
    String idade = console.readLine("Digite sua idade: ");

    // é um array de char pois assim não entra no pool de strings do java
    char[] senha = console.readPassword("Digite sua senha: ");

    System.out.println("Seu nome é " + nome + ", e sua idade é " + idade + " anos. Salvamos sua senha "
        + senha.toString() + "em nosso banco de dados.");
  }
}