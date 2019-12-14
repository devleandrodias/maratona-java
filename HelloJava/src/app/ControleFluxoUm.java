package app;

/**
 * ControleFluxoUm
 */
public class ControleFluxoUm {

  public static void main(String[] args) {

    int idade = 19;

    // Necessita retornar um valor boolean
    if (idade >= 20)
      System.out.println("Entrou no primeiro if por que a condiçaõ foi verdadeira. Então deixe ele entrar.");
    else if (idade >= 18 || idade < 20)
      System.out.println("Entrou aqui por que a resposta da condição foi falsa. Então deixe entrar acompanhado.");
    else
      System.out.println("Entrou aqui por que nenhuma condição a cima foi satisfeita. Não o deixe entrar.");
  }
}