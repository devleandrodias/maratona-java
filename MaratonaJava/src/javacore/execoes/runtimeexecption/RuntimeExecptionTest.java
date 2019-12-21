package javacore.execoes.runtimeexecption;

/**
 * Uncheked
 * 
 * Erro em tempo de execução (Necessário tratar) - ArithmeticException
 * NullPointerException váriavel do tipo referência que é nula.
 * ArrayIndexOutOfBoundsException - Não existe index no array. Sempre trabalhe
 * com Tipo Mais Específico mehlhor
 */
public class RuntimeExecptionTest {

  public static void main(String[] args) {
    tratamentoExcptions();

    try {

      divisao(10, 0);
    } catch (RuntimeException e) {

      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }

  private static void tratamentoExcptions() {
    try {
      // Object object = null;
      // System.out.println(object.toString());
    } catch (NullPointerException e) {

      e.printStackTrace();
    }

    try {
      int a = 10;
      int b = 0;
      int c = a / b;

      System.out.println(c);
    } catch (ArithmeticException e) {

      e.printStackTrace();
    }

    try {
      int[] array = new int[2];

      System.out.println(array[2]);
    } catch (ArrayIndexOutOfBoundsException e) {

      e.printStackTrace();
    }

    System.out.println("Por mais que deu várias execções ainda sim código continua a executar.");
  }

  private static void divisao(double num1, double num2) {

    if (num2 == 0)
      throw new IllegalArgumentException("Não é possível divisão por zero.");

    double result = (num1 / num2);

    System.out.println(result);
  }
}