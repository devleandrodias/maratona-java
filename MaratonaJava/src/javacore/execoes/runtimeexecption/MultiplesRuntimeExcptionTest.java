package javacore.execoes.runtimeexecption;

/**
 * MultiplesRuntimeExcptionTest
 */
public class MultiplesRuntimeExcptionTest {

  /**
   * Tratamento de multiplas execções
   * 
   * Uma classe mais genérica não pode vir antes de uma subclasse. Caminho topdown
   * para encontrar execção mais específica possivel. Quem for mais genérico
   * coloque mais a baixo.
   */
  public static void main(String[] args) {
    try {
      throw new RuntimeException();
    } catch (ArrayIndexOutOfBoundsException e) {

      System.out.println("Dentro: ArrayIndexOutOfBoundsException");
    } catch (IllegalArgumentException e) {

      System.out.println("Dentro: IllegalArgumentException");

    } catch (NullPointerException e) {
      System.out.println("Dentro: NullPointerException");

    } catch (RuntimeException e) {
      System.out.println("Dentro: NullPointerException");

    } finally {

    }
  }
}