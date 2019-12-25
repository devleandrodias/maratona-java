package javacore.inputoutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Encadeamento de classes
 */
public class BufferedTest {

  public static void main(String[] args) {
    File file = new File("src\\documents\\Arquivo.txt");

    // Try with resources
    try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));) {

      bufferedWriter.write("Escrevendo uma mensagem no arquivo");
      bufferedWriter.newLine();
      bufferedWriter.write("pulando de linha escrevendo mais..");

      bufferedWriter.flush();

      String s = null;

      while ((s = bufferedReader.readLine()) != null) {
        System.out.println(s);
      }

    } catch (IOException e) {
      e.printStackTrace();
    }

    // try {
    // FileWriter fileWriter = new FileWriter(file, true);
    // BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

    // bufferedWriter.write("Escrevendo uma mensagem no arquivo");
    // bufferedWriter.newLine();
    // bufferedWriter.write("pulando de linha escrevendo mais..");

    // bufferedWriter.flush();
    // bufferedWriter.close();

    // FileReader fileReader = new FileReader(file);
    // BufferedReader bufferedReader = new BufferedReader(fileReader);

    // bufferedReader.readLine(); // Lê a linha e retorna uma string
    // String s = null;

    // while ((s = bufferedReader.readLine()) != null) {
    // System.out.println(s);
    // }

    // bufferedReader.close(); // Quando você chama o mais externo ele se ecarrega
    // de fechar os mais internos
    // } catch (IOException e) {
    // e.printStackTrace();
    // }
  }
}