package javacore.interfaces.classe;

/**
 * Você sempre implementa uma interface. E todos os métodos são abstratos.
 */
public interface ITributavel {
  // Interfaces podem ter atributos, mas todos atributos serão constantes.

  // public static final é implícito
  public static final double IMPOSTO = 0.2;

  // Todos os métodos implicitamente serão public e abstract.

  public abstract void calcularImposto();
}