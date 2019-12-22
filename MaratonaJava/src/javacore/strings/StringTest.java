package javacore.strings;

/**
 * String no Java são imutáveis
 */
public class StringTest {

  public static void main(String[] args) {
    String nome = "Leandro";

    // String Constant Pool

    String nomeCompleto = nome.concat(" Dias");

    // Strings são imutáveis
    System.out.println("Olá, Sr." + nomeCompleto);

    // Nome dois aposta para mesmo endereço de memória que o nome, ele não irá
    // dupicar
    String nome2 = "Leandro";

    System.out.println(nome);
    System.out.println(nome2);

    /**
     * 1 Váriavel de referência, 2 Um objeto tipo string, Uma string no pool de
     * strings
     */

    String nome3 = new String("Ferdinando"); // Por questões de porformance não usamos dessa forma

    System.out.println(nome3);

    String nomeGoku = "Goku";
    String nomeGokuZuado = "    gOKu ";
    String quebrandoString = "123456789";

    System.out.println(nomeGoku.charAt(2));
    System.out.println(nomeGoku.equalsIgnoreCase(nomeGokuZuado));
    System.out.println(nomeGoku.length());
    System.out.println(nomeGoku.replace('o', 'a'));
    System.out.println(nomeGoku.toLowerCase());
    System.out.println(nomeGoku.toUpperCase());
    System.out.println(quebrandoString.substring(1, 2)); // Início, Quantidade
    System.out.println(nomeGokuZuado.trim());
  }
}