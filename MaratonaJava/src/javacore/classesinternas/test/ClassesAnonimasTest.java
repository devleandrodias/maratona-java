package javacore.classesinternas.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javacore.classesinternas.classes.Carro;

class Animal {
  public void andar() {
    System.out.println("Animal andando...");
  }
}

/**
 * Classe anônima é uma classe definida em um certo ponto do código onde ela não
 * pode ter nome e ela simplismente vai deixar de existir assim que você
 * utiliza-la
 */

public class ClassesAnonimasTest {

  public static void main(String[] args) {
    // Isso é uma classe anônima
    Animal animal = new Animal() {
      @Override
      public void andar() {
        System.out.println("Andando rapidamente...");
      }
    };
    animal.andar();

    List<Carro> carrosList = new ArrayList<>();

    carrosList.add(new Carro("Volvo XC90"));
    carrosList.add(new Carro("Range Rolver Evoque"));
    carrosList.add(new Carro("Toyta Camary"));

    // Collections.sort(carrosList, new CarroComparator());

    // Aqui você está criando um classe anônima que implementa Comparator<Carro>
    Collections.sort(carrosList, new Comparator<Carro>() {
      @Override
      public int compare(Carro o1, Carro o2) {
        return o1.getNome().compareTo(o2.getNome());
      }
    });
  }
}

// Se você vai usar só uma vez, você pode criar uma classe anônima
// class CarroComparator implements Comparator<Carro> {

// @Override
// public int compare(Carro o1, Carro o2) {
// return o1.getNome().compareTo(o2.getNome());
// }
// }