package javacore.execoes.execptions;

import java.io.File;
import java.io.IOException;

/**
 * CheckedExecptionTest
 */
public class CheckedExecptionTest {

  public static void main(String[] args) {
    criarArquivo();
  }

  public static void criarArquivo() {
    // Obrigatóriamente deve-se criar um tratamento de execção.

    File file = new File("Teste.txt");

    try {

      System.out.println("Arquivo criado?: " + file.createNewFile());

    } catch (IOException e) {

      e.printStackTrace();
    }
  }
}