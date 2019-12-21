package javacore.execoes.testes;

/**
 * Aqui temos um erro, erros inesperados impedem o funcionamento do seu
 * programa; Execções e Erros são lançados e passam pela stack até que algum
 * método os trate, caso não forem tratados, estorarão o erro.
 */
public class ErrorTest {

  public static void main(String[] args) {
    stackOverflowErro();
  }

  public static void stackOverflowErro() {
    stackOverflowErro();
  }
}