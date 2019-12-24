package javacore.expressoesregulares;

/**
 * TokenTest
 */
public class TokenTest {

  public static void main(String[] args) {
    String str = "Willian, Paulo, Joana, Rhaira, Barbará, Thaísa";

    String[] tokens = str.split(",");

    for (String token : tokens) {
      System.out.println(token.trim());
    }
  }
}