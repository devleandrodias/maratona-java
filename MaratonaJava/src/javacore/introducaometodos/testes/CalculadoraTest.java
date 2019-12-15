package javacore.introducaometodos.testes;

import javacore.introducaometodos.classe.Calculadora;

/**
 * CalculadoraTest
 */
public class CalculadoraTest {

  public static void main(String[] args) {
    Calculadora calculadora = new Calculadora();
    int retornoFuncao;

    calculadora.somaDoisNumeros(1, 4);

    calculadora.subtraiDoisNumeros(10, 2);

    calculadora.multiplicaValorPorDois(25);

    retornoFuncao = calculadora.retornaSomaNumeroMaisDez(15);

    System.out.println(retornoFuncao);
  }
}