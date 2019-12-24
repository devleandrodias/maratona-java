package javacore.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * ResourceBundleTest
 */
public class ResourceBundleTest {

  public static void main(String[] args) {
    System.out.println("Língua atual do sistema: " + Locale.getDefault());

    // messages_en_US era do basename messages
    ResourceBundle rbUS = ResourceBundle.getBundle("messages", new Locale("en", "US"));

    System.out.println(rbUS.getString("good.morning"));
    System.out.println(rbUS.getString("show"));

    // Basename
    ResourceBundle rbBR = ResourceBundle.getBundle("messages", Locale.getDefault());

    System.out.println(rbBR.getString("good.morning"));
    System.out.println(rbBR.getString("show")); // sobrevendo

    // Modo recursivo de encontrar os resource bundle

    // ResourceBundle.getBundle("messages", new Locale("fr", "CA"));

    // messages_fr_CA.properties
    // messages_fr.properties
    // messages_pt_BR.properties // Língua padrão com país
    // messages_pt.properties // Língua padrão do S.O
    // messages.properties
    // Não encontrou resource bundle
  }
}