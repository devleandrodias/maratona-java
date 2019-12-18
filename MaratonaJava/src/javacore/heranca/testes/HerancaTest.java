package javacore.heranca.testes;

import javacore.heranca.classe.Endereco;
import javacore.heranca.classe.Funcionario;
import javacore.heranca.classe.Pessoa;

/**
 * A classe Pessoa é mais genérica e a classe Funcionário que herda de Pessoa é
 * mais especializada.
 */
public class HerancaTest {

  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Ademilson");
    Endereco endereco = new Endereco();

    pessoa.setNome("Leandro Dias");
    pessoa.setCpf("124.124.311-4");

    endereco.setBairro("Vila Tibério");
    endereco.setRua("Rua Aurora");

    pessoa.setEndereco(endereco);

    pessoa.imprime();

    Funcionario funcionario = new Funcionario("Thaísa Castro");

    funcionario.setSalario(13417.04);

    funcionario.setNome("Algusto Silva");
    funcionario.setCpf("124.234.243-4");

    endereco.setBairro("Vila do Golfe");
    endereco.setRua("Rua Santos Dumont");

    funcionario.setEndereco(endereco);

    funcionario.imprime();
    funcionario.imprimeReciboPagamento();
  }
}