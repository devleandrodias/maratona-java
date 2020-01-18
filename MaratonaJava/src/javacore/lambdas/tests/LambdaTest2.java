package javacore.lambdas.tests;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

import javacore.lambdas.classes.Carro;

import static java.util.Arrays.asList;

import java.util.ArrayList;

/**
 * Consumer, Function
 */
public class LambdaTest2 {

  public static void main(String[] args) {
    forEach(asList("Willian", "Leandro Dias", "Alberto Gomes"), (String s) -> System.out.println(s));

    List<Integer> list = map(asList("Willian", "Leandro Dias", "Alberto Gomes"), (String s) -> s.length());

    List<Carro> listCarros = asList(new Carro("Branco", 2000), new Carro("Preto", 2015), new Carro("Verde", 2023),
        new Carro("Prata", 1992), new Carro("Branco", 1942));

    List<String> listCores = map(listCarros, (Carro c) -> c.getCor());

    System.out.println(list);
    System.out.println(listCores);

    Predicate<Integer> pares = (Integer i) -> i % 2 == 0;
    System.out.println(pares.test(1000));

    /**
     * Interfaces funcionais que não permitem boxing e autoboxing dos
     * wrappers,eveita processamento desnecessário para alta performance
     */

    IntPredicate impar = (int i) -> i % 2 == 0;

    System.out.println(impar.test(2025));

    /**
     * TargetType o que aquela lambda está esperando != Function Description
     */

    // Tem mesmo target e mesmo description

    // Callable<Integer> c = () -> 100;
    // PrivilegedAction<Integer> p = () -> 100;

    // Retornar um valor quando expressão não retorna nenhum valor

    // Stetman Expression, ele consegue ignorar o retorno quando retorno for void
    Predicate<String> predicate = (String s) -> listCores.add(s);
    predicate.test("Amarelo");
    System.out.println(listCores);

    Consumer<String> consumer = (String s) -> listCores.add(s);
    consumer.accept("AMARELO");
    System.out.println(listCores);

    /**
     * Não é necessário passar tipo (String s), Java Consegue deduzir interface
     * funcional pelo contexto
     */

    Consumer<String> consumerSimplificado = s -> listCores.add(s);
    consumerSimplificado.accept("AMARELO");
    System.out.println(listCores);

    /**
     * Quando você pode ou não pode passar váriaveis locais em expressões labdas
     */

    String cor = "VERMELHO";

    Consumer<String> consumerVariavelLocal = s -> listCores.add(cor);
    /**
     * cor = "Preto"; // Ela não é essensialmente final por que trocamos seu valor,
     * ao longo do código
     */
    consumerVariavelLocal.accept("VERMELHO");
    System.out.println(listCores);

    final String corFinal = "VERMELHO";

    Consumer<String> consumerVariavelLocalFinal = s -> listCores.add(corFinal);
    /**
     * cor = "Preto"; // Ela não é essensialmente final por que trocamos seu valor,
     * ao longo do código
     */
    consumerVariavelLocalFinal.accept("ROSA");
    System.out.println(listCores);

    // Interface funcional Supplier serve para retornar alguma coisa
    Supplier<String> supplier = () -> "OI";
    Supplier<Carro> supplierCarro = () -> new Carro("Cinza", 2017);

    System.out.println(supplier.get());
    System.out.println(supplierCarro.get());
  }

  /**
   * Quando você precisar acessar um T e fazer algum tipo de operação nele, quando
   * temos váriaveis final ou efetivamente finais, sempre pode usar váriaveis de
   * instância e váriaveis estáticas, váriaveis local não são compartilhadas entre
   * várias treds
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