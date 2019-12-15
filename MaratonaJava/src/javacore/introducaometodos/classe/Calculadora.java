package javacore.introducaometodos.classe;

/**
 * Classe responsável por fazer cálculos matemáticos
 */
public class Calculadora {

  /**
   * Método que soma dois números
   * 
   * @param num1 - Primeiro valor a ser somado
   * @param num2 - Segundo valor a ser somado
   */
  public void somaDoisNumeros(int num1, int num2) {
    System.out.println(num1 + num2);
  }

  /**
   * Método que subtrai dois valores
   * 
   * @param num1 - Primeiro valor
   * @param num2 - Segundo valor
   */
  public void subtraiDoisNumeros(int num1, int num2) {
    System.out.println(num1 - num2);
  }

  /**
   * Método que multiplica um número por dois
   * 
   * @param num - Valor a ser multiplicado por dois
   */
  public void multiplicaValorPorDois(int num) {
    System.out.println(num * 2);
  }

  /**
   * Método que retorna uma soma de um número mais 10
   * 
   * @param num - Número a ser passado como parâmetro
   * @return - Retorna um número inteiro
   */
  public int retornaSomaNumeroMaisDez(int num) {
    return num + 10;
  }

  /**
   * Método que divide dois números
   * 
   * @param num1 - Número 1
   * @param num2 - Número 2
   * @return - Retorna um valor double
   */
  public double divideDoisNumero(double num1, double num2) {
    if (num2 != 0) {
      return num1 / num2;
    }

    return 0;
  }

  /**
   * Método que imprime dois números divididos
   * 
   * @param num1 - Núemro 1
   * @param num2 - Número 2
   */
  public void imprimeDoisNumerosDivididos(int num1, int num2) {
    if (num2 != 0) {
      System.out.println(num1 / num2);
      return;
    }

    System.out.println("Não é possível dividir por zero.");
  }

  /**
   * Método que altera dois números
   * 
   * @param num1 - Número 1
   * @param num2 - Número 2
   */
  public void alteraDoisNuemro(int num1, int num2) {
    num1 = 30;
    num2 = 40;

    System.out.println("Dentro de alterando dois números");
    System.out.println("num1: " + num1);
    System.out.println("num2: " + num2);
  }
}