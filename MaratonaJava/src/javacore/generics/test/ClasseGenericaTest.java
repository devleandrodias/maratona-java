package javacore.generics.test;

import java.util.ArrayList;
import java.util.List;

import javacore.generics.classes.Carro;

/**
 * T = type; E = element (Nas coleções);
 */
public class ClasseGenericaTest {
  public static void main(String[] args) {
    List<Carro> carrosDisponiveis = new ArrayList<>();

    carrosDisponiveis.add(new Carro("Volvo XC90"));
    carrosDisponiveis.add(new Carro("Range Rolver Evoque"));
    carrosDisponiveis.add(new Carro("Toyta Camary"));

    ObjetosAlugaveis<Carro> carrosAlugaveis = new ObjetosAlugaveis<>(carrosDisponiveis);
    Carro carro = carrosAlugaveis.getObjetoDisponivel();
    System.out.println("Usando carro: " + carro + " por um mês");
    carrosAlugaveis.devolverObjeto(carro);
  }
}

class ObjetosAlugaveis<T> {
  private List<T> objetosDisponiveis = new ArrayList<>();

  public ObjetosAlugaveis(List<T> objetosDisponiveis) {
    this.objetosDisponiveis = objetosDisponiveis;
  }

  public T getObjetoDisponivel() {
    T t = objetosDisponiveis.remove(0);
    System.out.println("Alugando objeto: " + t);
    System.out.println("Objetos disponíveis: " + objetosDisponiveis);
    return t;
  }

  public void devolverObjeto(T c) {
    System.out.println("Devolvendo objeto: " + c);
    objetosDisponiveis.add(c);
    System.out.println("Objetos disponíveis: " + objetosDisponiveis);
  }
}