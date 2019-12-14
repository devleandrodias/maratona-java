package app;

/**
 * EstruturaSwitch
 */
public class EstruturaSwitch {

  public static void main(String[] args) {
    byte dia = 0;

    // char, int, byte, short, enum, String
    switch (dia) {
    case 1:
      System.out.println("Domingo");
      break;
    case 2:
      System.out.println("Segunda");
      break;
    case 3:
      System.out.println("Terça");
      break;
    case 4:
      System.out.println("Quarta");
      break;
    case 5:
      System.out.println("Quinta");
      break;
    case 6:
      System.out.println("Sexta");
      break;
    case 7:
      System.out.println("Sábado");
      break;
    default:
      System.out.println("Data da semana inválida!");
    }

    char sexo = 'F';

    switch (sexo) {
    case 'F':
      System.out.println("Feminino");
      break;
    case 'M':
      System.out.println("Masculino");
    default:
      System.out.println("Sexo inválido!");
      break;
    }
  }
}