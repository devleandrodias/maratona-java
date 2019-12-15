package introducao.controles;

/**
 * Imprima no console se dado valor entre 1 a 7, sendo considerado 1 domingo Se
 * é um dia util da semana
 */
public class DesafioEstruturaSwitch {

  public static void main(String[] args) {
    byte diaSemana = 4;

    switch (diaSemana) {
    case 1:
    case 7:
      System.out.println("Final de Semana.");
      break;
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
      System.out.println("Dia útil.");
      break;
    default:
      System.out.println("Dia Inválido.");
      break;
    }
  }
}