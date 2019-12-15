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
}