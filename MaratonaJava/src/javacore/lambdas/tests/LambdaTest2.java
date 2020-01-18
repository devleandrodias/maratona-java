package javacore.lambdas.tests;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import static java.util.Arrays.asList;

import java.util.ArrayList;

/**
 * Consumer, Function
 */
public class LambdaTest2 {

  public static void main(String[] args) {
    forEach(asList("Willian", "Leandro Dias", "Alberto Gomes"), (String s) -> System.out.println(s));

    List<Integer> list = map(asList("Willian", "Leandro Dias", "Alberto Gomes"), (String s) -> s.length());

    System.out.println(list);
  }

  /**
   * Quando você precisar acessar um T e fazer algum tipo de operação nele
   */
  public static <T> void forEach(List<T> list, Consumer<T> c) {
    for (T e : list) {
      c.accept(e);
    }
  }

  /**
   * Quando você passa um tipo e precisa retornar outro tipo
   */
  public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
    List<R> result = new ArrayList<>();

    for (T e : list) {
      result.add(f.apply(e));
    }

    return result;
  }
}