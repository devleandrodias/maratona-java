package javacore.classesinternas.test;

/**
 * ClassesInternasTest
 */
public class ClassesInternasTest {
  private String nome = "Leandro Dias";

  /**
   * Você precisa obrigatoriamento chamar um objeto da classee externa para depois
   * chamar um objeto da classe interna
   */
  // Private, Abstract, Public, Protected, Static, Strictfp
  class Interna {
    public void verClasseExterna() {
      System.out.println(nome);
      /**
       * Referência o objeto da classe que está sendo chamado (Classe interna)
       */
      System.out.println(this);

      /**
       * Referência a classe externa
       */
      System.out.println(ClassesInternasTest.this);
    }
  }

  public static void main(String[] args) {
    /**
     * Forma de chamar uma classe mais interna de uma classe externa
     */
    ClassesInternasTest externa = new ClassesInternasTest();

    /**
     * Duas formas de chamar os métodos mais internas, mas as duas precisar
     * obrigatoriamente de um objto da classe mais externa
     */
    ClassesInternasTest.Interna interna = externa.new Interna();

    ClassesInternasTest.Interna interna2 = new ClassesInternasTest().new Interna();

    interna.verClasseExterna();
    interna2.verClasseExterna();
  }
}

// class Externa {
// private String nome = "Leandro Dias";

// /**
// * Uma classe interna tem acesso a todos os atributos da classe superior
// * inclusive os privados
// */
// class Interna {
// public void verClasseExterna() {
// System.out.println(nome);
// }
// }
// }