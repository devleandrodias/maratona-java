package javacore.polimorfismo.classe;

/**
 * RelatorioPagamento
 */
public class RelatorioPagamento {

  public void relatorioPagamentoGerente(Gerente gerente) {
    System.out.println("Gerando relatório de pagamento para gerência");

    gerente.calcularPagamento();

    System.out.println("---------------------------------------------------");
    System.out.println("Nome: " + gerente.getNome());
    System.out.println("Salário do mês de U$" + gerente.getSalario());
    System.out.println("---------------------------------------------------");
  }

  public void relatorioPagamentoVendedor(Vendedor vendedor) {
    System.out.println("Gerando relatório de pagamento para vendedores");

    vendedor.calcularPagamento();

    System.out.println("Nome: " + vendedor.getNome());
    System.out.println("Salário do mês de U$" + vendedor.getSalario());
    System.out.println("---------------------------------------------------");
  }

  public void relatorioPagamentoGenerico(Funcionario funcionario) {
    System.out.println("Gerando relatório de pagamento para funcionário: ");

    funcionario.calcularPagamento();

    System.out.println("---------------------------------------------------");
    System.out.println("Nome: " + funcionario.getNome());
    System.out.println("Salário do mês de U$" + funcionario.getSalario());
    System.out.println("---------------------------------------------------");
  }
}