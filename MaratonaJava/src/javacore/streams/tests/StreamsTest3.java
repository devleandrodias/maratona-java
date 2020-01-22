package javacore.streams.tests;

import java.util.Comparator;
import java.util.List;

import javacore.streams.classe.Pessoa;

/**
 * StreamsTest3
 */
public class StreamsTest3 {

  public static void main(String[] args) {
    List<Pessoa> pessoas = Pessoa.bancoDePessoas();

    // Existe algum elemento dentro do stream
    System.out.println(pessoas.stream().anyMatch(p -> p.getSalario() > 4000));

    // Se todo mundo na list possui o elemento
    System.out.println(pessoas.stream().allMatch(p -> p.getIdade() > 18));

    // Verifica o inverso do elemento
    System.out.println(pessoas.stream().noneMatch(p -> p.getIdade() < 18));

    // Retorna um Lista de Optional
    pessoas.stream().filter(p -> p.getIdade() < 25).findAny().ifPresent(p -> System.out.println(p.getNome()));

    // Retorna um Optional
    pessoas.stream().filter(p -> p.getIdade() > 30).sorted(Comparator.comparing(Pessoa::getIdade).reversed())
        .findFirst().ifPresent(p -> System.out.println(p.getNome()));
  }
}