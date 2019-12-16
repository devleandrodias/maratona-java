package javacore.modificadorestatico.testes;

import javacore.modificadorestatico.classe.Carro;

/**
 * CarroTest
 */
public class CarroTest {

  public static void main(String[] args) {
    Carro carroUm = new Carro("HB20S", 140);
    Carro carroDoi = new Carro("Ford Ka", 120);
    Carro carroTres = new Carro("Novo Corolla", 225);

    carroUm.imprimeCarro();
    carroDoi.imprimeCarro();
    carroTres.imprimeCarro();

    System.out.println("*********************");

    /**
     * Atributos estáticos por mais que possam ser alterados apartir de um
     * referência, não é recomendado, é recomendado alterar um atributo estático
     * usando a própria classe. Ele é indepêndente e vínculado a classe.
     * 
     * Alterou para todos a velocidade limite para 220.
     */

    Carro.velocidadeLimite = 220;

    carroUm.imprimeCarro();
    carroDoi.imprimeCarro();
    carroTres.imprimeCarro();
  }
}