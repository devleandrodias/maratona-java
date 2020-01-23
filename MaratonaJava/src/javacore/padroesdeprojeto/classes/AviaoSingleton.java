package javacore.padroesdeprojeto.classes;

import java.util.HashSet;
import java.util.Set;

/**
 * Padrão de Projeto Singleton, fazer com que a classe possa ser instância
 * apenas uma única vez.
 */
public class AviaoSingleton {

  // EAGER INITIALIZATION
  // private static final AviaoSingleton INSTANCE = new AviaoSingleton();
  //
  private static AviaoSingleton INSTANCE; // Forma Lazy

  private Set<String> assentosDisponiveis;

  public AviaoSingleton() {
    this.assentosDisponiveis = new HashSet<>();

    assentosDisponiveis.add("1A");

    assentosDisponiveis.add("1B");
  }

  // LAZY INITIALIZATION
  public static AviaoSingleton getINSTANCE() {
    if (INSTANCE == null) {
      synchronized (AviaoSingleton.class) {
        if (INSTANCE == null) {
          INSTANCE = new AviaoSingleton(); // Forma Lazy (Carrega na memória apenanas se getINSTANCE for chamado)
        }
      }
    }

    return INSTANCE;
  }

  public boolean bookAssentos(String assento) {
    return assentosDisponiveis.remove(assento);
  }
}