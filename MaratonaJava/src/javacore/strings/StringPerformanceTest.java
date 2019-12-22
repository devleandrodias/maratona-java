package javacore.strings;

/**
 * StringPerformanceTest
 */
public class StringPerformanceTest {

  public static void main(String[] args) {
    long inicionormal = System.currentTimeMillis();
    concatString(50000);
    long fimnormal = System.currentTimeMillis();
    System.out.println("Tempo gasto: " + (fimnormal - inicionormal) + "ms");

    long iniciobuilder = System.currentTimeMillis();
    concatStringBuilder(500000);
    long fimbuilder = System.currentTimeMillis();
    System.out.println("Tempo gasto: " + (fimbuilder - iniciobuilder) + "ms");

    long iniciobuffer = System.currentTimeMillis();
    concatStringBuffer(500000);
    long fimbuffer = System.currentTimeMillis();
    System.out.println("Tempo gasto: " + (fimbuffer - iniciobuffer) + "ms");

  }

  private static void concatString(long tam) {
    // String string = "";

    // for (int i = 0; i < tam; i++) {
    // string += i;
    // }

  }

  // Não permite multitred
  private static void concatStringBuilder(int tam) {
    StringBuilder stringBuilder = new StringBuilder(tam);

    for (int i = 0; i < tam; i++) {
      stringBuilder.append(i);
    }
  }

  // São sinconizados protegidos de acessode multiplas treds
  private static void concatStringBuffer(int tam) {
    StringBuffer stringBuffer = new StringBuffer(tam);

    for (int i = 0; i < tam; i++) {
      stringBuffer.append(i);
    }
  }
}