package app;

/**
 * MaisArrays
 */
public class MaisArrays {

  public static void main(String[] args) {
    // Difrentes formas de inicializar um array

    int[] numerosDois = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // Indície vai até 9
    int[] numerosTres = new int[] { 1, 22, 31, 456, 54 }; // Indície vai até 4

    for (int i = 0; i < numerosDois.length; i++) {
      System.out.println(numerosDois[i]);
    }

    System.out.println("============================================");

    /**
     * A cada iteração o valor da váriavel aux, ela não é numérica. Cada posição do
     * número é colocado na váriável aux a cada iteração
     */

    for (int valorIteracao : numerosTres) {
      System.out.println(valorIteracao);
    }

    System.out.println("============================================");

    /**
     * valorIteracao o escopo dela é apenas para função do for, entretando não se
     * pode declarar uma mesma váriavel de escopo maior
     */

    String[] nomes = { "Leandro", "Thaísa", "Beatriz", "Rhaira" };

    for (String string : nomes) {
      System.out.println(string);
    }
  }
}