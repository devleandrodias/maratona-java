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

    // pessoa.imprime();

    Funcionario funcionario = new Funcionario("Thaísa Castro");
    // Funcionario funcionario2 = new Funcionario("Thaísa Castro");

    // Ordem de inicialização

    /**
     * 1 - Espaço em memória é alocado para o objeto sendo construido.
     * 
     * 2- Cada um dos atributos do objeto é criado e inicializado com os valores
     * default.
     * 
     * 3 - O construtor da da superclasse é chamado.
     * 
     * 4 - A inicialização dos atributos via declaração e o código do bloco de
     * inicialização da superclasse são executados na ordem de procedência.
     * 
     * 5 - O código do construtor da superclasse é chamado.
     * 
     * 6 - Passo 4 para a subclasse é executado.
     * 
     * 7 - O código do construtor da classe é executado.
     * 
     * 8 - Os métodos estáticos ão executados apenas uma vez.
     */

    funcionario.setSalario(13417.04);

    funcionario.setNome("Algusto Silva");
    funcionario.setCpf("124.234.243-4");

    endereco.setBairro("Vila do Golfe");
    endereco.setRua("Rua Santos Dumont");

    funcionario.setEndereco(endereco);

    // funcionario.imprime();
    // funcionario.imprimeReciboPagamento();
  }
}