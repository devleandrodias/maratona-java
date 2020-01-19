package javacore.lambdas.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

import javacore.lambdas.classes.Carro;
import javacore.lambdas.classes.CompradorCarro;

import static java.util.Arrays.asList;

/**
 * Methodo Refereces, 4 Tipos
 * 
 * - Referência para um método estático
 * 
 * - Referência para uma intância de um método particular
 * 
 * - Referência a um método particular para uma instância de um objeto
 * arbitrario
 * 
 * - Referência para um construtor
 */
public class LambdaTest3 {

  public static void main(String[] args) {
    forEach(asList("Willian", "Leandro Dias", "Alberto Gomes"), s -> System.out.println(s)); // Sem Methodo Refereces
    System.out.println("------------------------------------");
    forEach(asList("Willian", "Leandro Dias", "Alberto Gomes"), System.out::println); // Com Methodo Refereces

    List<Carro> listCarros = asList(new Carro("Branco", 2000), new Carro("Preto", 2015), new Carro("Verde", 2023),
        new Carro("Prata", 1992), new Carro("Branco", 1942));

    // Jeito antigo de fazer uma comparação com Comparator
    Collections.sort(listCarros, new Comparator<Carro>() {
      @Override
      public int compare(Carro c1, Carro c2) {
        return c1.getCor().compareTo(c2.getCor());
      }
    });

    // Nova forma de fazer isso usando Lambdas
    Collections.sort(listCarros, (c1, c2) -> c1.getCor().compareTo(c2.getCor()));

    // References to a static method
    Collections.sort(listCarros, CompradorCarro::compareByColor);

    // References to an instance method of a particular object
    CompradorCarro compradorCarro = new CompradorCarro();
    Collections.sort(listCarros, compradorCarro::compareByYear);

    // References to an instance method of an arbitrary object of a particular type
    List<String> listName = asList("Willian", "Leandro Dias", "Alberto Gomes");
    listName.sort((n1, n2) -> n1.compareTo(n2));
    listName.sort(String::compareTo);
    System.out.println(listName);

    // Método executa o padrão então poderá ser substituido por um method references
    Function<String, Integer> stringToInteger = s -> Integer.parseInt(s);
    Function<String, Integer> stringToIntegerMelhorado = Integer::parseInt;

    System.out.println(stringToInteger.apply("10"));
    System.out.println(stringToIntegerMelhorado.apply("10"));

    // Memsa coisa que o predicate só q recebe dois parâmetros na função test
    // BiPredicate<List<String>, String> contains = (list, element) ->
    // list.contains(element);
    // BiPredicate<List<String>, String> contains2 = List::contains;

    // References to a constructor
    // Supplier<CompradorCarro> supplier = CompradorCarro::new;

    BiFunction<String, Integer, Carro> biFunction = (s, i) -> new Carro(s, i);

    // Não é nessa linha que o carro é instânciado
    BiFunction<String, Integer, Carro> biFunctionCar = Carro::new;
    System.out.println(biFunction.apply("Cerato", 2020));
    System.out.println(biFunctionCar.apply("Cerato", 2020));
  }

  public static <T> void forEach(List<T> list, Consumer<T> c) {
    for (T e : list) {
      c.accept(e);
    }
  }

  public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
    List<R> result = new ArrayList<>();

    for (T e : list) {
      result.add(f.apply(e));
    }

    return result;
  }
}