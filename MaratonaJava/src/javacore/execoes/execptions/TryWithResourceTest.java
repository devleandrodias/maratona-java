package javacore.execoes.execptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * TryWithResourceTest
 */
public class TryWithResourceTest {

  public static void main(String[] args) {

  }

  // Até versão 6
  public static void lerArquivoOld() {
    Reader reader = null;

    try {
      reader = new BufferedReader(new FileReader("text.txt"));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } finally {
      try {
        if (reader != null)
          reader.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  // Try With Resource, Precisa implentar a interface Closed ou Autoclosed
  public static void lerArquivoNew() throws IOException {
    try (Reader reader = new BufferedReader(new FileReader("text.txt"))) {

    }
  }
}