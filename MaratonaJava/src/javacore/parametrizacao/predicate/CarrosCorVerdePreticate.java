package javacore.parametrizacao.predicate;

import javacore.parametrizacao.classes.Carro;
import javacore.parametrizacao.interfaces.CarroPredicate;

/**
 * CarrosCorVerdePraticate
 */
public class CarrosCorVerdePreticate implements CarroPredicate {

  @Override
  public boolean test(Carro carro) {
    return carro.getCor().equals("Verde");
  }
}