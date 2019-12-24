package javacore.expressoesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ExpressoesRegularesTest
 */
public class ExpressoesRegularesTest {

  public static void main(String[] args) {
    String regex = "ab";
    String texto = "abaabbaababbabababbababababbababbabaababbabababbababbabbab";

    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(texto);

    System.out.println("texto: " + texto);
    System.out.println("índicie: 34323432");
    System.out.println("expressão: " + matcher.pattern());
    System.out.println("padrões encontrados");

    while (matcher.find()) {
      System.out.print(matcher.start() + " ");
    }
  }
}