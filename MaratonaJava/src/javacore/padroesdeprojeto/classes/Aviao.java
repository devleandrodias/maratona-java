package javacore.padroesdeprojeto.classes;

import java.util.HashSet;
import java.util.Set;

/**
 * Aviao
 */
public class Aviao {

  private Set<String> assentosDisponiveis;

  public Aviao() {
    this.assentosDisponiveis = new HashSet<>();

    assentosDisponiveis.add("1A");
    assentosDisponiveis.add("1B");
  }

  public boolean bookAssentos(String assento) {
    return assentosDisponiveis.remove(assento);
  }
}