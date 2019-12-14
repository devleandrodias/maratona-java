package app;

/**
 * OperadoresAtribuicao
 */
public class OperadoresAtribuicao {

  public static void main(String[] args) {

    float salario = 2048.25f;

    salario += 1000;

    System.out.println(salario);

    salario -= 1000;

    System.out.println(salario);

    salario *= 0.1;

    System.out.println(salario);

    salario /= 2;

    System.out.println(salario);

    salario %= 1000;

    System.out.println((int) salario);
  }
}

// Operadores de atribuição
// = - Igual;
// -= - Menos igual;
// += - Mais igual;
// *= - Vezes igual;
// /= - Divisão igual;
// %= - Porcentagem igual;