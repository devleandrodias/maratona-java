package introducao.controles;

/**
 * Váriavel salário e calcule o Impost de Renda em cima do valor salario < 1000,
 * 5% de imposto salario >= 1000 && salario < 2000, 10% de imposto salario >=
 * 2000 && salario < 4000, 15% de imposto
 */
public class ExercicioControleFluxo {

  public static void main(String[] args) {
    float salario = 3022.32f;
    float imposto = 0;
    float totalImposto = 0;

    if (salario < 1000) {

      imposto = 0.05f;
      totalImposto = salario * imposto;
    } else if (salario >= 1000 && salario < 2000) {

      imposto = 0.1f;
      totalImposto = salario * imposto;
    } else {

      imposto = 0.15f;
      totalImposto = salario * imposto;
    }

    System.out.println("Seu salário de " + salario + " menos o imposto de " + ((int) (imposto * 100)) + "%. Igual a "
        + (salario - totalImposto));
  }
}