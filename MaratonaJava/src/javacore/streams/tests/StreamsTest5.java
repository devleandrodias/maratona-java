package javacore.streams.tests;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Criando Streams
 */
public class StreamsTest5 {

  public static void main(String[] args) {
    // Inclui o ultimo número
    IntStream.rangeClosed(1, 100).filter(x -> x % 2 == 0).forEach(y -> System.out.print(y + " "));

    System.out.println();

    // Não inclui o último número
    IntStream.range(1, 100).filter(x -> x % 2 == 0).forEach(y -> System.out.print(y + " "));

    System.out.println();

    Stream<String> nomes = Stream.of("Leandro", "Rhaira", "Thaísa");
    nomes.map(String::toUpperCase).forEach(x -> System.out.print(x + " "));

    Stream.empty();

    int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    OptionalDouble average = Arrays.stream(nums).average();
    System.out.println(average.getAsDouble());

    try (Stream<String> lines = Files.lines(Paths.get("E:", "maratona-java", "MaratonaJava", "home", "arquivo.txt"),
        Charset.defaultCharset())) {
      lines.flatMap(line -> Arrays.stream(line.split("\n")).filter(p -> p.contains("linha")))
          .forEach(System.out::println);
    } catch (Exception e) {
      e.printStackTrace();
    }

    // Streams infinitos
    // Stream.iterate(1, n -> n + 2).limit(50000).forEach(System.out::println);

    // Sequência de Fibonacci
    // 0, 1, 1, 2, 3, 5, 8 ...
    // (0,1) (1,1) (1,2) (2,3) (3,5)
    Stream.iterate(new int[] { 0, 1 }, x -> new int[] { x[1], x[0] + x[1] }).limit(100).map(y -> y[0])
        .forEach(System.out::println);
    // UnaryOperator retorna o argumento que você passar de entrada

    Stream.generate(Math::random).limit(500).forEach(System.out::println);
  }
}