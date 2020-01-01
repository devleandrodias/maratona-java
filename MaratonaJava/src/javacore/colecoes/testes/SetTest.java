package javacore.colecoes.testes;

import javacore.colecoes.classe.Produto;

import java.util.HashSet;
import java.util.Set;

/**
 * SetTest
 */
public class SetTest {

  public static void main(String[] args) {
    Produto produto1 = new Produto("123124", "MacBook Air 2017", 3999.99);
    Produto produto2 = new Produto("235252", "iMac 2018", 13999.99);
    Produto produto3 = new Produto("345224", "iPhone 11 Pro Max", 7999.99);
    Produto produto4 = new Produto("253232", "Mac Mini", 4999.99);

    // SET Não permite elementos duplicados, ele não é indexado
    Set<Produto> produtosSet = new HashSet<>();

    // LinkedHashSet mantém a ordem de inserção

    produtosSet.add(produto1);
    produtosSet.add(produto2);
    produtosSet.add(produto3);
    produtosSet.add(produto4);

    // SET Não tem nenhum tipo de ordenação
    for (Produto produto : produtosSet) {
      System.out.println(produto);
    }
  }
}