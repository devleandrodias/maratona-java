package javacore.colecoes.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javacore.colecoes.classe.Produto;

/**
 * SortedProdutoTest
 */
public class SortedProdutoTest {

  public static void main(String[] args) {
    List<Produto> produtos = new ArrayList<>();

    Produto produto1 = new Produto("123456789", "MacBook Air 2017", 3999.99);
    Produto produto2 = new Produto("987654321", "Dell Vostro 2020", 3999.99);
    Produto produto3 = new Produto("235425362", "Teclado Logitech Gamer", 710.99);
    Produto produto4 = new Produto("262423423", "Samsung A20", 1233.99);

    produtos.add(produto1);
    produtos.add(produto2);
    produtos.add(produto3);
    produtos.add(produto4);

    Collections.sort(produtos);

    for (Produto produto : produtos) {
      System.out.println(produto);
    }
  }
}