package app;

/**
 * TiposPrimitivos
 */
public class TiposPrimitivos {

  public static void main(String[] args) {
    int idade = 10;
    double salarioDouble = 300;
    float salarioFloat = 300;
    byte idadeByte = 19;
    boolean verdadeiro = true;
    boolean falso = false;
    long numeroGrande = 1000000L;
    char caracter = '\u0041'; // 2 Bytes
    String nome = "Leandro Dias";

    System.out.println(salarioDouble + " " + salarioFloat + " " + idadeByte + " " + verdadeiro + " " + falso + " "
        + verdadeiro + " " + numeroGrande);
    System.out.println(nome + " de idade: " + idade);
    System.out.println(caracter);
  }
}