package javacore.padroesdeprojeto.interfaces;

import javacore.padroesdeprojeto.enums.PaisEnum;
import javacore.padroesdeprojeto.interfaces.Moeda;

/**
 * MoedaFactory
 */
public class MoedaFactory {

  public static Moeda criarMoeda(PaisEnum pais) {
    if (pais.equals(PaisEnum.BRASIL))
      return new Real();

    else if (pais.equals(PaisEnum.EUA))
      return new USDolar();

    else
      throw new IllegalArgumentException("Não existe esse país");
  }
}