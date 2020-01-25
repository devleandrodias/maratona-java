package javacore.classesinternas.test;

/**
 * ClassesLocaisTest
 */
public class ClassesLocaisTest {

  private String nome = "Thaísa";

  public void fazAlgumaCoisa() {
    final String sobrenome = "Castro";

    // só pode usar final ou abstract
    class Interna {
      public void imprimeNome() {
        System.out.println(nome);
        System.out.println(sobrenome);
      }
    }

    Interna interna = new Interna();
    interna.imprimeNome();
  }

  /**
   * Você não tem acesso a uma classe local dentro de um método uma vez que você
   * saiu de dentro daquele metódo, mesmo que você chame o método que tem a
   * classe, apenas se você antes de finalizar método você criar objeto da classe
   * mais externa
   */

  /**
   * No Java 7 para trás, classe interna ela não pode utilizar atributos locais de
   * métodos a não ser que eles sejam finais
   * 
   * No Java 8 os atributos locais podem ser finais ou efetivamente final (Quando
   * não altarado)
   */

  public static void main(String[] args) {
    ClassesLocaisTest externa = new ClassesLocaisTest();
    externa.fazAlgumaCoisa();
  }
}