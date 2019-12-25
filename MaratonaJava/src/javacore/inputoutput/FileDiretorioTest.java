package javacore.inputoutput;

import java.io.File;
import java.io.IOException;

/**
 * FileDiretorioTest
 */
public class FileDiretorioTest {

  public static void main(String[] args) throws IOException {

    // File diretorio = new File("resources");

    // System.out.println("Deretório criado: " + diretorio.mkdir());

    // File arquivo = new File(diretorio, "Arquivo.txt");

    // System.out.println("Arquivo criado: " + arquivo.createNewFile());

    // File arquivoNovoNome = new File(diretorio, "Arquivo novo renomeado.txt");

    // System.out.println("Renomeado: " + arquivo.renameTo(arquivoNovoNome));

    // File diretorioRenomeado = new File("core");

    // System.out.println("Diretório renomeado: " +
    // diretorio.renameTo(diretorioRenomeado));

    buscarArquivos();
  }

  // Busca de arquivos dentro de um diretório
  public static void buscarArquivos() {
    File file = new File("E:\\maratona-java\\MaratonaJava\\src");

    String[] list = file.list();

    for (String arquivo : list) {
      System.out.println(arquivo);
    }
  }
}