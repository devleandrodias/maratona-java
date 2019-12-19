package javacore.classesabstratas.testes;

import javacore.classesabstratas.classe.Gerente;
import javacore.classesabstratas.classe.Vendedor;

/**
 * FunctionarioTest
 */
public class FunctionarioTest {

  public static void main(String[] args) {
    Vendedor vendedor = new Vendedor("Marcos Antônio", "27352-2", 2024.50, 4000);
    Gerente gerente = new Gerente("Ana Vieira", "22252-2", 3014.42);

    gerente.calculaSalario();
    vendedor.calculaSalario();

    System.out.println(vendedor);
    System.out.println(gerente);
  }
}