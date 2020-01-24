package javacore.padroesdeprojeto.tests;

import javacore.padroesdeprojeto.enums.PaisEnum;
import javacore.padroesdeprojeto.interfaces.Moeda;
import javacore.padroesdeprojeto.interfaces.MoedaFactory;

/**
 * Padrão Factory, a complexidade de padrão de um objeto é responsabilidade de
 * outra classe
 */
public class TestMoedaFactory {

  public static void main(String[] args) {
    Moeda moedaBR = MoedaFactory.criarMoeda(PaisEnum.BRASIL);
    Moeda moedaUS = MoedaFactory.criarMoeda(PaisEnum.EUA);

    System.out.println(moedaBR.getSimbolo());
    System.out.println(moedaUS.getSimbolo());
  }
}