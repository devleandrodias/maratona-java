package javacore.classesinternas.test;

class Externa {
  static class Interna {
    public void imprimir() {
      System.out.println("OI");
    }
  }
}

/**
 * Classes estáticas são membros estaticas e regras de atributos estáticos e não
 * estáticos são aplicados aqui
 */

public class ClassesInternasEstaticasTest {

  public static void main(String[] args) {
    Externa.Interna teste = new Externa.Interna();
    teste.imprimir();

    // Diferença de quando você vai chamar uma classe estática interna
    Interna2 teste2 = new Interna2();
    teste2.imprimir();
  }

  static class Interna2 {
    public void imprimir() {
      System.out.println("OI Interna 2");
    }
  }
}