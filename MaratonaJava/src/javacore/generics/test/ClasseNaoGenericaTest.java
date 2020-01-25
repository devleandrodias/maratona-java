package javacore.generics.test;

import java.util.ArrayList;
import java.util.List;

import javacore.generics.classes.Carro;

/**
 * ClasseNaoGenericaTest
 */
public class ClasseNaoGenericaTest {
  public static void main(String[] args) {
    CarroAlugado carroAlugavel = new CarroAlugado();
    Carro carroAlugado = carroAlugavel.getCarroDisponivel();
    System.out.println("Usando carro por um mês");
    carroAlugavel.devolverCarro(carroAlugado);
  }
}

// Alugar Carro, Barco, Motos, Aviões teria que repetir o código

class CarroAlugado {
  private List<Carro> carrosDisponiveis = new ArrayList<>();

  {
    carrosDisponiveis.add(new Carro("Volvo XC90"));
    carrosDisponiveis.add(new Carro("Range Rolver Evoque"));
    carrosDisponiveis.add(new Carro("Toyta Camary"));
  }

  // Alugar
  public Carro getCarroDisponivel() {
    Carro c = carrosDisponiveis.remove(0);
    System.out.println("Alugando carro: " + c);
    System.out.println("Carros disponíveis: " + carrosDisponiveis);
    return c;
  }

  public void devolverCarro(Carro c) {
    System.out.println("Devolvendo carro: " + c);
    carrosDisponiveis.add(c);
    System.out.println("Carros disponíveis: " + carrosDisponiveis);
  }
}