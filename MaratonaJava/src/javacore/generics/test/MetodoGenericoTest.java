package javacore.generics.test;

import java.util.ArrayList;
import java.util.List;

/**
 * MetodoGenericoTest
 */
public class MetodoGenericoTest {

  public static void main(String[] args) {
    List<Cachorro> listCachorro = criarArray(new Cachorro());
    System.out.println(listCachorro);
  }

  /**
   * Em métodos genéricos se inverte a ordem, o tipo <T> vem antes do retorno do
   * método, caso você não defina o tipo no método é necessário definir o tipo
   * genérico T na classe que está o invocando, pode usar extensões usados no
   * WildCard
   */
  public static <T extends Animal> List<T> criarArray(T t) {
    List<T> list = new ArrayList<>();
    list.add(t);
    return list;
  }
}