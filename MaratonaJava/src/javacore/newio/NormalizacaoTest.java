package javacore.newio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * NormalizacaoTest
 */
public class NormalizacaoTest {

  public static void main(String[] args) {
    String diretorioProjeto = "MaratonaJava\\home\\leandro\\dev";
    String arquivoTxt = "..\\..\\arquivo.txt";

    Path p1 = Paths.get(diretorioProjeto, arquivoTxt);

    System.out.println(p1.normalize()); // Normalização

    Path p2 = Paths.get("/home/./leandro/./dev/");

    System.out.println(p2);
    System.out.println(p2.normalize());
  }
}