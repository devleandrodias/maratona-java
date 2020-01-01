package javacore.colecoes.testes;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

import javacore.colecoes.classe.Celular;
import javacore.colecoes.classe.Produto;

/**
 * TreeSetTest
 */

class CelularNomeComparator implements Comparator<Celular> {

  @Override
  public int compare(Celular o1, Celular o2) {
    return o1.getNome().compareTo(o2.getNome());
  }
}

public class TreeSetTest {

  public static void main(String[] args) {
    Produto produto1 = new Produto("123124", "MacBook Air 2017", 3999.99);
    Produto produto2 = new Produto("235252", "iMac 2018", 13999.99);
    Produto produto3 = new Produto("345224", "iPhone 11 Pro Max", 7999.99);
    Produto produto4 = new Produto("253232", "Mac Mini", 4999.99);

    Celular celular = new Celular("iPhone 11", "2134234");

    NavigableSet<Produto> produtoNavigableSet = new TreeSet<>();
    NavigableSet<Celular> celularNavigableSet = new TreeSet<>(new CelularNomeComparator());

    /**
     * Regras: Ao celularNavigableSet.add(classe deve implementar a interface
     * Comparable, ou passar um camparator no contrutor)
     */

    celularNavigableSet.add(celular);

    produtoNavigableSet.add(produto1);
    produtoNavigableSet.add(produto2);
    produtoNavigableSet.add(produto3);
    produtoNavigableSet.add(produto4);

    for (Celular cel : celularNavigableSet) {
      System.out.println(cel);
    }

    /**
     * No TreeSet os elementos são ordenador automaticamente
     * 
     * NavigableSet não permite elementos duplicados
     * 
     * .descendingSet() trazer lista invertida
     */

    for (Produto produc : produtoNavigableSet.descendingSet()) {
      System.out.println(produc);
    }

    System.out.println("-----------------------------------");

    /**
     * Lembrar nome, funcionalidade, regra
     */

    // lower <
    // floor <=
    // higher >
    // ceiling >=

    System.out.println(produtoNavigableSet.lower(produto3));

    // Traz e remove o primeiro elemento
    System.out.println(produtoNavigableSet.pollFirst());

    // Traz e remove o ultimo elemento
    System.out.println(produtoNavigableSet.pollLast());

    // Tamanho da lista
    System.out.println(produtoNavigableSet.size());
  }
}