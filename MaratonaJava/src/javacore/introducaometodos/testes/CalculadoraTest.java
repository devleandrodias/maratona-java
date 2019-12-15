package javacore.introducaometodos.testes;

import javacore.introducaometodos.classe.Calculadora;

/**
 * CalculadoraTest
 */
public class CalculadoraTest {

  public static void main(String[] args) {
    Calculadora calculadora = new Calculadora();

    calculadora.somaDoisNumeros();

    calculadora.subtraiDoisNumeros();
  }
}