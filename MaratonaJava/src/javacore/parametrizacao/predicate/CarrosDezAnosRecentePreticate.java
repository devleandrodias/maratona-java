package javacore.parametrizacao.predicate;

import java.util.Calendar;

import javacore.parametrizacao.classes.Carro;
import javacore.parametrizacao.interfaces.CarroPredicate;

/**
 * CarrosDezAnosRecentePreticate
 */
public class CarrosDezAnosRecentePreticate implements CarroPredicate {

  @Override
  public boolean test(Carro carro) {
    return carro.getAno() > Calendar.getInstance().get(Calendar.YEAR) - 10;
  }
}