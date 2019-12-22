package javacore.strings;

/**
 * StringBuilderTest
 */
public class StringBuilderTest {

  public static void main(String[] args) {
    String s = "Uma string";
    StringBuilder sb = new StringBuilder(16);
    StringBuilder sbnum = new StringBuilder("123456789");

    // Ele não criamais um objeto na memória, reutiliza mesmo objeto
    sb.append("Uma frase comum");
    sb.append(", novamente");

    s = sb.toString();

    System.out.println(s);
    System.out.println(sb.reverse());
    System.out.println(sbnum.insert(2, "Afgadbgdfbgdfkbg]fda")); // Começa do 1
    System.out.println(sbnum.delete(0, 5));
  }
}