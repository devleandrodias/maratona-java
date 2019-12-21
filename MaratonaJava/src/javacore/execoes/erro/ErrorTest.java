package javacore.execoes.erro;

/**
 * Aqui temos um erro, erros inesperados impedem o funcionamento do seu
 * programa; Execções e Erros são lançados e passam pela stack até que algum
 * método os trate, caso não forem tratados, estorarão o erro.
 * 
 * Checked (Checado) - Sempre obrigado a criar um tipo de tratamento para aquela
 * exeção (Filhos de Execption)
 * 
 * Unchekd (Não Checado) - Não precisa criar tratamentos (Erros de lógica do
 * programador) (RuntatimeExecption e seus filhos)
 */
public class ErrorTest {

  public static void main(String[] args) {
    stackOverflowErro();
  }

  public static void stackOverflowErro() {
    stackOverflowErro();
  }
}