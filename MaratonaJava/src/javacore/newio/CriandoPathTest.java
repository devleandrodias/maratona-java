package javacore.newio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * CriandoPathTest
 */
public class CriandoPathTest {

  public static void main(String[] args) {
    Path p1 = Paths.get("E:\\maratona-java\\MaratonaJava\\core\\Arquivo.txt");
    Path p2 = Paths.get("E:\\maratona-java\\MaratonaJava\\core", "Arquivo.txt");
    Path p3 = Paths.get("E:", "maratona-java\\MaratonaJava\\core", "Arquivo.txt");
    Path p4 = Paths.get("E:", "maratona-java", "MaratonaJava", "core", "Arquivo.txt");

    System.out.println(p1.toAbsolutePath());
    System.out.println(p2.toAbsolutePath());
    System.out.println(p3.toAbsolutePath());
    System.out.println(p4.toAbsolutePath());

    // Path path1 = Paths.get("container");
    // Path path2 = Paths.get("container\\subpasta\\subpasta");
    Path path3 = Paths.get("container\\subpasta\\subpasta\\subpasta\\files.txt");
    // Path arquivo = Paths.get("container\\subpasta\\file.txt");

    // getParent isso pega apenas o diretório excluindo ultima parte
    try {
      if (Files.notExists(path3.getParent()))
        Files.createDirectories(path3.getParent()); // Mais de um diretório
      // Files.createFile(arquivo);
    } catch (IOException e) {
      e.printStackTrace();
    }

    Path source = Paths.get("E:\\maratona-java\\MaratonaJava\\core\\Arquivo.txt");
    Path target = Paths.get("container\\subpasta\\arquivoCopiado.txt");

    try {
      Files.copy(source, target);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}