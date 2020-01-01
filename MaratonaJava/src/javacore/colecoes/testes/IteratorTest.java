package javacore.colecoes.testes;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javacore.colecoes.classe.Produto;

/**
 * IteratorTest
 */
public class IteratorTest {

  public static void main(String[] args) {
    List<Produto> produtos = new LinkedList<>();

    Produto produto1 = new Produto("123124", "MacBook Air 2017", 3999.99);
    Produto produto2 = new Produto("235252", "iMac 2018", 13999.99);
    Produto produto3 = new Produto("345224", "iPhone 11 Pro Max", 7999.99);
    Produto produto4 = new Produto("253232", "Mac Mini", 4999.99);

    produtos.add(produto1);
    produtos.add(produto2);
    produtos.add(produto3);
    produtos.add(produto4);

    // // Você não pode modificar o array em tempo de execução
    // for (Produto produto : produtos) {
    // if (produto.getQuantidade() == 0) {
    // produtos.remove(produto);
    // }
    // }

    Iterator<Produto> produtoIterator = produtos.iterator();

    // hasNext verifica se exista proximo elemento da lista
    // next pega o elemento daquela lista

    System.out.println(produtos.size());

    // Parecido com fila de banco Ex.
    while (produtoIterator.hasNext()) {
      if (produtoIterator.next().getQuantidade() == 0) {
        produtoIterator.remove();
      }
    }

    System.out.println(produtos.size());
  }
}