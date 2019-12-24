package javacore.expressoesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Os meta caracteres foram feitos para facilitar busca de determinados
 * caracteres.
 */
public class ExpressoesRegularesTest {

  public static void main(String[] args) {
    // Exemplos de caracteres (Principais)

    // \d - todos os dígitos (número)
    // \D - tudo o que não for dígito
    // \s - espaços em brancos \t \n \f \r
    // \S - caracter que não é branco
    // \w - caracteres de palavras a-z, A-Z, dígitos, _
    // \W - tudo o que não for palavra (tudo que não estiver em \w)

    String regex = "\\w";
    String texto = "aba235ab235ba\r35&2ab62ab6#";

    Pattern pattern = Pattern.compile(regex); // Compilar a expressão regular
    Matcher matcher = pattern.matcher(texto); // Procurar dentro do texto da expressão compilada

    System.out.println("texto: " + texto);
    System.out.println("expressão regular: " + matcher.pattern()); // Expressão usada
    System.out.println(" - posições que o padrão foi encontrado - ");

    // Enquanto matcher encontrar padrão
    while (matcher.find()) {
      // Onde encontrou o match
      System.out.print(matcher.start() + " ");
    }
  }
}