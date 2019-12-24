package javacore.inputoutput;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * FileTest
 */
public class FileTest {

  public static void main(String[] args) {

    File file = new File("C:\\Users\\leand\\Desktop\\arquivoJava.txt");

    try {
      System.out.println("Arquivo criado: " + file.createNewFile());

      System.out.println("Pode ser lido: " + file.canRead());

      System.out.println("Caminho do arquivo: " + file.getPath());

      System.out.println("Diretório: " + file.isDirectory());

      System.out.println("Arquivo oculto: " + file.isHidden());

      System.out.println("Ultima alteração: " + new Date(file.lastModified()));

      if (file.exists())
        System.out.println("Deletado: " + file.delete());

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}