package javacore.lambdas.interfaces;

import javacore.lambdas.classes.Carro;

/**
 * Quando interface tem apenas UM método abstrato (FunctionalInterface)
 * 
 * pode ter mais de um método se os métodos estiverem default que não é
 * obrigatória sobrescrita.
 * 
 * A assinatura do método vai ser responsável pela assinatura da lambda.
 */
@FunctionalInterface
public interface CarroPredicate {

  // Function description
  boolean test(Carro carro);

  // parâmetro -> expressão
  // Carro carro -> (expressão que retorna booleano)
}