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
    // [] - procure nessa frase apenas (case sensitive)

    // quantificadores falam que você deve procurar por uma ou mais ocorrências
    // ? 0 ou 1 ocorrência
    // * 0 ou mais ocorrências
    // + 1 ou mais ocorrências
    // {n, m} de n até m ocorrências
    // () agrupar uma expressão
    // | colocar OU
    // $ fim da linha

    // Exemplos

    // maca(rr|c)ão - macarrão, macacão

    // int numeroHexa = 0XaFF; // Número hexadecimal
    // String regex = "[abcA-Z]";
    String regexNumeroHexadecimais = "0[xX]([0-9a-fA-F])+(\\s|$)";

    // String texto = "aba235ab235ba\r35&2ab62ab6#";
    // String texto2 = "cafeBABE";
    String texto3 = "12 0x 0X 0xFFABC 0x10G 0x1";

    Pattern pattern = Pattern.compile(regexNumeroHexadecimais); // Compilar a expressão regular
    Matcher matcher = pattern.matcher(texto3); // Procurar dentro do texto da expressão compilada

    System.out.println("texto: " + texto3);
    System.out.println("expressão regular: " + matcher.pattern()); // Expressão usada
    System.out.println(" - posições que o padrão foi encontrado - ");

    // Enquanto matcher encontrar padrão
    while (matcher.find()) {
      // Onde encontrou o match
      System.out.println(matcher.start() + " " + matcher.group());
    }
  }
}