package javacore.introducaometodos.testes;

import javacore.introducaometodos.classe.Calculadora;

/**
 * CalculadoraTest
 */
public class CalculadoraTest {

  public static void main(String[] args) {
    Calculadora calculadora = new Calculadora();

    calculadora.somaDoisNumeros(1, 4);

    calculadora.subtraiDoisNumeros(10, 2);

    calculadora.multiplicaValorPorDois(25);

    System.out.println(calculadora.retornaSomaNumeroMaisDez(15));

    System.out.println(calculadora.divideDoisNumero(10, 10));

    calculadora.imprimeDoisNumerosDivididos(10, 0);

    int[] numeros = { 1, 12, 14, 235 };

    calculadora.somaArray(numeros);

    calculadora.somaVarArgs(1, 2, 234, 235, 2);
  }
}