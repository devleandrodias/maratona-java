package introducao.controles;

/**
 * OperadoresComparacao
 */
public class OperadoresComparacao {

  public static void main(String[] args) {
    boolean dezMaiorQueVinte = 10 > 20;
    boolean dezMenorQueVinte = 10 < 20;
    boolean dezIgualQueVinte = 10 == 20;

    System.out.println("Dez é maior que 20?: " + dezMaiorQueVinte);
    System.out.println("Dez é menor que 20?: " + dezMenorQueVinte);
    System.out.println("Dez é igual que 20?: " + dezIgualQueVinte);
  }
}

// Operações de comparação, todos retornam true, ou false
// < - menor que;
// > - maior que;
// <= - menor igual a;
// >= - menor igual a;
// == - igual a;
// != - diferente de;