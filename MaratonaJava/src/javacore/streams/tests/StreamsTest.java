package javacore.streams.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javacore.streams.classe.Pessoa;

/**
 * Pegar os três primeiros nomes das pessoas com menos de 25 anos.
 * 
 * Ordenar pelo nome
 */
public class StreamsTest {
  public static void main(String[] args) {
    List<Pessoa> pessoas = Pessoa.bancoDePessoas();

    // Até o Java 7
    Collections.sort(pessoas, new Comparator<Pessoa>() {
      public int compare(Pessoa o1, Pessoa o2) {
        return o1.getNome().compareTo(o2.getNome());
      }
    });

    List<String> nomes = new ArrayList<>();

    for (Pessoa pessoa : pessoas) {
      if (pessoa.getIdade() < 25) {
        nomes.add(pessoa.getNome());
        if (nomes.size() >= 3) {
          break;
        }
      }
    }

    System.out.println(nomes);

    /**
     * stream são algo em tempo real (espalhados no tempo) e coleções são
     * armazenados em algum local (no espaço)
     */

    // Apartir do Java 8
    List<String> nomesStreams = pessoas.stream().filter(p -> p.getIdade() < 25)
        .sorted(Comparator.comparing(Pessoa::getNome)).limit(3).map(Pessoa::getNome).collect(Collectors.toList());

    System.out.println(nomesStreams);

    /**
     * Intermediate: retorna outros streams permitindo encadeação de comandos, não
     * nenhum tipo de processamento até que seja invocada no stream
     * 
     * Terminal: Retona um valor que não é um stream. Ex. collect
     */

    long quantidadePessoas = pessoas.stream().filter(p -> p.getIdade() < 25).map(Pessoa::getNome).count();

    System.out.println(quantidadePessoas);

    pessoas.stream().forEach(System.out::println);
  }
}