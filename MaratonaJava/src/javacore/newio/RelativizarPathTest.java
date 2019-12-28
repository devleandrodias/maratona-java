package javacore.newio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Estou no Path 1 e como faço para chegar no Path 2 (Relativizando path)
 */
public class RelativizarPathTest {

  public static void main(String[] args) {
    Path dir = Paths.get("/home/leandro");
    Path classe = Paths.get("/home/leandro/dev/java/helloWorld.java");

    Path pathClass = dir.relativize(classe);

    System.out.println(pathClass);

    Path absoluto1 = Paths.get("/home/leandro");
    Path absoluto2 = Paths.get("/usr/local");
    Path absoluto3 = Paths.get("/home/leandro/dev/java/helloWorld.java");
    Path relativo1 = Paths.get("temp");
    Path relativo2 = Paths.get("temp/Funcionario.java");

    System.out.println("1: " + absoluto1.relativize(absoluto3));
    System.out.println("2: " + absoluto3.relativize(absoluto1));
    System.out.println("3: " + absoluto1.relativize(absoluto2));
    System.out.println("4: " + relativo1.relativize(relativo2));
    // System.out.println("5: " + absoluto1.relativize(relativo1));
  }
}