package javacore.acertivas;

/**
 * AssertTest
 */
public class AssertTest {

  public static void main(String[] args) {
    calculaSalario(-1234.234);
  }

  private static void calculaSalario(double salario) {
    /**
     * Ele garante que salário sempre vai ser maior que zero, por que se o salário
     * vier menor o programa para pois não é possível continuar.
     * 
     * Usar sempre da maioria das vezes o assert utilize quando modificador de
     * acesso for zero.
     * 
     * Por padrão as acertivas são desativadas em produção, em desenvolvimento
     * precisa habilita-la.
     */
    assert (salario > 0) : "Salário não pode ser negativo";
    // Fazer calculo
  }
}