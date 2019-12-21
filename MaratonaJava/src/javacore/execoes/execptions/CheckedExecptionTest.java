package javacore.execoes.execptions;

import java.io.File;
import java.io.IOException;

/**
 * CheckedExecptionTest
 */
public class CheckedExecptionTest {

  public static void main(String[] args) {
    try {
      criarArquivo();
      criarArquivo2();

    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  /**
   * Esse método apenas vai criar um novo arquivo caso lançar uma execção quem
   * terá o trabalho de fazer as tratativas necessárias será quem está chamando o
   * método, apenas especificamos que o método pode lançar uma execção.
   */

  // Obrigatóriamente deve-se criar um tratamento de execção.
  public static void criarArquivo() throws IOException {
    File file = new File("Teste.txt");

    System.out.println("Arquivo criado?: " + file.createNewFile());

    System.out.println("Arquivo criado com sucesso!");
  }

  public static void criarArquivo2() throws IOException {
    File file = new File("Teste.txt");

    try {
      System.out.println("Arquivo criado?: " + file.createNewFile());
      System.out.println("Arquivo criado com sucesso!");

    } catch (IOException e) {

      e.printStackTrace();
      throw e; // Não usamos o new pois já existe o objeto de execção criado
    } finally {

      System.out.println("Sempre será executado tanto se cair ou não no catch, mesmo se tiver um return");
    }
  }
}
