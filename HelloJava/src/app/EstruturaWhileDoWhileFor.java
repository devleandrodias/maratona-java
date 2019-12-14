package app;

/**
 * EstruturaWhileDoWhile
 */
public class EstruturaWhileDoWhileFor {

  public static void main(String[] args) {
    int contador = 0;
    int contadorDois = 5;

    while (contador <= 10)
      System.out.println(contador++);

    do {
      System.out.println(contadorDois--);
    } while (contadorDois >= 0);

    for (int i = 100; i >= 10; i--)
      System.out.println(i);
  }
}