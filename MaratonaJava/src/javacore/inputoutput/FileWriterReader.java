package javacore.inputoutput;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriterReader
 */
public class FileWriterReader {

  public static void main(String[] args) {
    File file = new File("src\\documents\\Arquivo.txt");

    // Try resource
    try (FileWriter fileWriter = new FileWriter(file, true); FileReader fileReader = new FileReader(file);) {

      fileWriter.write("Escrevendo uma mensagem no arquivo\n pulando de linha escrevendo mais..");
      fileWriter.flush();

      char[] in = new char[500];

      int sizeArray = fileReader.read(in);

      System.out.println("Tamanho array de bytes: " + sizeArray);

      for (char c : in) {
        System.out.print(c);
      }

    } catch (IOException e) {
      e.printStackTrace();
    }

    // try {
    // FileWriter fileWriter = new FileWriter(file, true);
    // fileWriter.write("Escrevendo uma mensagem no arquivo\n pulando de linha
    // escrevendo mais..");
    // fileWriter.flush();
    // fileWriter.close();

    // FileReader fileReader = new FileReader(file);

    // char[] in = new char[500];

    // int sizeArray = fileReader.read(in);

    // System.out.println("Tamanho array de bytes: " + sizeArray);

    // for (char c : in) {
    // System.out.print(c);
    // }

    // fileReader.close();
    // } catch (IOException e) {
    // e.printStackTrace();
    // }
  }
}