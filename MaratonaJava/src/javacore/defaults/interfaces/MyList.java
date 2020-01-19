package javacore.defaults.interfaces;

/**
 * Agora nós podemos ter métodos estáticos em interfaces (Obrigatoriamente
 * precisam ter corpo); Podemos usar métodos concretos, opcionais;
 * 
 * Diferenças entre classes abstratas e interfaces do Java 8 pra frente é:
 * Classe abstrata você só pode extender uma Classe e você pode implementar
 * multiplas interfaces, nas interfaces você pode usar váriaveis de instância,
 * nas interfaces você pode usar métodos opionais;
 * 
 * Três regras: Uma classe sempre vai ter prioridade sobre interfaces; Caso você
 * tenha subinterfaces método de mesma subassinatura vai ser selecionado; Se
 * você tiver uma opção ambigua a classe estiuver herdando de multiplas
 * interfaces você deve dizer qual método quer sobrescrever;
 */
public interface MyList {

  static void sort() {
    System.out.println("Dentro do sort");
  }

  void add();

  default void remove() {
    System.out.println("Você pode sobrescrever ou não");
  };
}