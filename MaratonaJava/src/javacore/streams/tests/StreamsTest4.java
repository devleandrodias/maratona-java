package javacore.streams.tests;

import java.util.Arrays;
import java.util.stream.Stream;

import javacore.streams.classe.Pessoa;

/**
 * StreamsTest4
 */
public class StreamsTest4 {

  public static void main(String[] args) {
    System.out.println(getStream().reduce((x, y) -> x * y).get());
    System.out.println(getStream().reduce((x, y) -> x + y).get());
    System.out.println(getStream().reduce(0, (x, y) -> x + y));

    System.out.println(getStream().reduce(Integer::sum).get());
    System.out.println(getStream().reduce(Integer::max).get());

    System.out.println(Pessoa.bancoDePessoas().stream().filter(x -> x.getSalario() >= 4000).map(Pessoa::getSalario)
        .reduce(Double::sum).get());

    // Stream Especializados (Performance)
    System.out.println(
        Pessoa.bancoDePessoas().stream().filter(x -> x.getSalario() >= 5000).mapToDouble(Pessoa::getSalario).sum());
  }

  public static Stream<Integer> getStream() {
    return Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream();
  }
}