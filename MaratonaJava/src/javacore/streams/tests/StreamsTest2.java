package javacore.streams.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * StreamsTest2
 */
public class StreamsTest2 {

  public static void main(String[] args) {
    List<List<String>> nomes = new ArrayList<>();

    nomes.add(Arrays.asList("DevDojo", "Valeu por aumentar a letra"));
    nomes.add(Arrays.asList("William", "pq você demorou 180 para isso?"));

    List<String> stream = nomes.stream().flatMap(Collection::stream).collect(Collectors.toList());

    System.out.println(stream);

    List<String> palavras = Arrays.asList("Olá", "Goku");

    String[] splits = palavras.get(0).split("");

    System.out.println(Arrays.toString(splits));

    palavras.stream().map(p -> p.split("")).collect(Collectors.toList());

    // Pegar um array e transformar em Streams de String
    Stream<String> stream2 = Arrays.stream((String[]) palavras.toArray());

    System.out.println(stream2);

    List<String> collect2 = palavras.stream() // Stream<String>
        .map(p -> p.split("")) // Stream<String[]>
        .flatMap(Arrays::stream) // Stream<String>
        .collect(Collectors.toList());

    System.out.println(collect2);

    /**
     * Map: ele é uma função aplicada para cada um dos elementos e vai retornar os
     * valores coletados em um novo stream
     * 
     * FlatMap: ele é uma função que recebe um stream e vai retornar um stream de
     * valores combinando todos aqueles valores (Extrair valores de dentro de algum
     * lugar)
     */
  }
}