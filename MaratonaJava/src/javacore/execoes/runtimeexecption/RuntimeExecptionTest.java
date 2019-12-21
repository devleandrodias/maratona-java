package javacore.execoes.runtimeexecption;

/**
 * Uncheked
 * 
 * Erro em tempo de execução (Necessário tratar) - ArithmeticException
 * NullPointerException váriavel do tipo referência que é nula.
 * ArrayIndexOutOfBoundsException - Não existe index no array
 */
public class RuntimeExecptionTest {

  public static void main(String[] args) {
    // Object object = null;

    // int a = 10;
    // int b = 0;
    // int c = a / b;

    // System.out.println(object.toString());

    int[] array = new int[2];

    System.out.println(array[2]);
  }
}