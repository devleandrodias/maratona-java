package app;

/**
 * Dado um valor de um carro descubre em quantas vezes ele pode ser parcelado.
 * As parcelas não podem passar de R$1000.00
 */
public class ControleFluxoBreakContinue {
  public static void main(String[] args) {
    double valorTotal = 43000.00;

    for (int quantidadeParcelas = 15; quantidadeParcelas <= valorTotal; quantidadeParcelas++) {
      double valorParcela = (valorTotal / quantidadeParcelas);

      if (valorParcela < 1000)
        continue; // Ele volta para o começo da operação

      System.out.println("Parcela " + quantidadeParcelas + " R$" + valorParcela);
    }
  }
}