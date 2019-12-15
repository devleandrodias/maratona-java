package javacore.introducaoclasses.testes;

import javacore.introducaoclasses.classe.Carro;

/**
 * CarroTest
 */
public class CarroTest {

  public static void main(String[] args) {
    /**
     * Os mesmos valores padrão de array de inicilização de instância são válidos
     * para variáveis de referência
     */
    Carro carro = new Carro();

    carro.modelo = "HB20S";
    carro.placa = "RDS-2542";
    carro.velocidadeMaxima = 124.12;

    System.out.println(carro.modelo);
    System.out.println(carro.placa);
    System.out.println(carro.velocidadeMaxima);
  }
}