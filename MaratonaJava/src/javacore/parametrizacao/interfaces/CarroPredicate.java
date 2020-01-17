package javacore.parametrizacao.interfaces;

import javacore.parametrizacao.classes.Carro;

/**
 * CarroPredicate
 */
public interface CarroPredicate {

  boolean test(Carro carro);
}