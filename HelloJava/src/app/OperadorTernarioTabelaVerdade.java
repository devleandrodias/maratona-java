package app;

/**
 * OperadorTernarioTabelaVerdade
 */
public class OperadorTernarioTabelaVerdade {

  public static void main(String[] args) {
    int idade = 20;
    String nome = "Leandro Dias";
    String adulto;

    adulto = idade >= 18 ? "Verdadeiro" : "Falso";

    // Operador ternário
    System.out.println("Sr.(a) " + nome + " é maior de idade?: " + adulto);
  }
}

// Tabela Verade (E)
// V E V = V
// V E F = F
// F E V = F
// F E F = F

// Tabela Verdade (OU)
// V OU V = V
// V OU F = V
// F OU V = V
// F OU F = F