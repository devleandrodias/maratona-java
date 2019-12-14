package app;

/**
 * OperadoresJava
 */
public class OperadoresJava {

  public static void main(String[] args) {
    int numero1 = 10;
    int numero2 = 20;
    int soma = numero1 + numero2;

    // Soma (+)
    System.out.println(numero1 + numero2); // Isso dá certo para adição
    System.out.println("Soma é: " + numero1 + numero2); // Isso forma uma concatenação
    System.out.println("Soma é: " + (numero1 + numero2)); // Aqui você pode realizar a adição
    System.out.println("Soma é: " + soma); // Aqui o valor já vem pronto

    // Divisão (/). Se você utilizar variável inteira o valor vem inteiro
    System.out.println("Divisão de " + numero1 + " / " + numero2 + " = " + (numero1 / numero2)); // Por mais que o valor
                                                                                                 // real seja 0.5
  }
}

// Operadores Unários
// ++ incremental;
// -- decremental;
// + adição;
// - subtração;
// * - multiplicação;
// / - divisão;
// () - cast;
// ! - negação;