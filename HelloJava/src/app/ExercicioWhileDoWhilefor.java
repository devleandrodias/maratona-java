package app;

/**
 * Imprima todos os números pares de 0 até 100000;
 */
public class ExercicioWhileDoWhilefor {

  public static void main(String[] args) {
    int valorTotal = 1000;

    for (int i = 0; i <= valorTotal; i++) {
      if (i % 2 == 0)
        System.out.println(i);
    }

    for (int i = 0; i < 10; i++) {
      System.out.println("Valor de i é: " + i);

      // Faz ele sair dor FOR
      if (i == 5)
        break;
    }
  }
}