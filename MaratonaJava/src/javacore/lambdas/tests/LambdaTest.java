package javacore.lambdas.tests;

import javacore.lambdas.classes.Carro;
import javacore.lambdas.interfaces.CarroPredicate;

/**
 * Lambda é uma expressão que pode ser entendida como uma representação anônima
 * que pode ser passada como parâmetro
 */
public class LambdaTest {

  /**
   * anonima, funções, passada por ai, concisa
   * 
   * (Carro carro) -> carro.getCor().equals("verde")
   * 
   * // Parâmetros, Seta, Expressão
   * 
   * Como e quando utilizar; Lambdas só podem ser usadas em interfaces funcionais
   */
  public static void main(String[] args) {

    // Utilizando classe anônima
    CarroPredicate carroPredicate = new CarroPredicate() {

      @Override
      public boolean test(Carro carro) {
        return carro.getCor().equals("Branco");
      }
    };

    System.out.println(carroPredicate.test(new Carro("Branco", 2020)));

    // Exatamente mesma coisa de cima só q usando lamdas
    CarroPredicate carroPredicateLambda = (Carro carro) -> carro.getCor().equals("Branco");

    System.out.println(carroPredicateLambda.test(new Carro("Branco", 2020)));
  }
}