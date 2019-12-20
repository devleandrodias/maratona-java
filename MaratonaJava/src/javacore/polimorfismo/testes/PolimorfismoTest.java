package javacore.polimorfismo.testes;

import javacore.polimorfismo.classe.Gerente;
import javacore.polimorfismo.classe.RelatorioPagamento;
import javacore.polimorfismo.classe.Vendedor;

/**
 * Polimorfismo
 */
public class PolimorfismoTest {

  public static void main(String[] args) {
    Gerente gerente = new Gerente("Oswaldo", 5922.23, 2331.23);
    Vendedor vendedor = new Vendedor("Rhaira Gabrielle", 1220.10, 10102.12);

    RelatorioPagamento relatorio = new RelatorioPagamento();

    // relatorio.relatorioPagamentoGerente(gerente);
    // relatorio.relatorioPagamentoVendedor(vendedor);

    /**
     * Isso seria um exemplo de cast uadeny método espera um Funcionário, só que
     * Gerente e Vendedor são um Funcionário
     */

    relatorio.relatorioPagamentoGenerico(gerente);

    // Isso dá um erro quando executado em tempo de compilação (use o instanceof)
    relatorio.relatorioPagamentoGenerico(vendedor);

    // Um funcionário referênciando um gerênte (Um gerênte é um Funcionário);
  }
}