package javacore.parametrizacao.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static java.util.Arrays.asList;

import javacore.parametrizacao.classes.Carro;
import javacore.parametrizacao.interfaces.CarroPredicate;
import javacore.parametrizacao.predicate.CarrosCorVerdePreticate;
import javacore.parametrizacao.predicate.CarrosDezAnosRecentePreticate;

/**
 * CarroTest
 */
public class CarroTest {

  public static void main(String[] args) {
    List<Carro> carros = asList(new Carro("Prata", 2008), new Carro("Verde", 2012), new Carro("Verde", 2010),
        new Carro("Branco", 1995));

    List<Integer> numeros = asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    System.out.println(filtrarCarros(carros, new CarrosCorVerdePreticate()));
    System.out.println(filtrarCarros(carros, new CarrosDezAnosRecentePreticate()));

    // Classes Anônimas, será substituido por lâmbda
    System.out.println(filtrarCarros(carros, new CarroPredicate() {
      @Override
      public boolean test(Carro carro) {
        return carro.getCor().equals("Branco");
      }
    }));

    System.out.println(filtrar(carros, new Predicate<Carro>() {
      @Override
      public boolean test(Carro t) {
        return t.getCor().equals("Verde");
      }
    }));

    System.out.println(filtrar(numeros, new Predicate<Integer>() {
      @Override
      public boolean test(Integer t) {
        return t % 2 == 0;
      }
    }));
  }

  // Strategy
  public static List<Carro> filtrarCarros(List<Carro> carros, CarroPredicate carroPredicate) {
    List<Carro> result = new ArrayList<>();

    for (Carro carro : carros) {
      if (carroPredicate.test(carro))
        result.add(carro);
    }

    return result;
  }

  // Mais genérico ainda
  public static <T> List<T> filtrar(List<T> list, Predicate<T> predicate) {
    List<T> result = new ArrayList<>();

    for (T e : list) {
      if (predicate.test(e))
        result.add(e);
    }

    return result;
  }
}