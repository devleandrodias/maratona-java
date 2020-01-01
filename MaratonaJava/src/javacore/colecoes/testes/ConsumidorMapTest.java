package javacore.colecoes.testes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javacore.colecoes.classe.Consumidor;
import javacore.colecoes.classe.Produto;

/**
 * ConsumidorMapTest
 */
public class ConsumidorMapTest {

  public static void main(String[] args) {
    Consumidor consumidor1 = new Consumidor("Leandro", "123.123.123-1");
    Consumidor consumidor2 = new Consumidor("DevDojo", "523.643.634-2");

    Produto produto1 = new Produto("123124", "MacBook Air 2017", 3999.99);
    Produto produto2 = new Produto("235252", "iMac 2018", 13999.99);
    Produto produto3 = new Produto("345224", "iPhone 11 Pro Max", 7999.99);
    Produto produto4 = new Produto("253232", "Mac Mini", 4999.99);

    Map<Consumidor, List<Produto>> map = new HashMap<>();

    List<Produto> produtoListConsumidor1 = new ArrayList<>();

    produtoListConsumidor1.add(produto1);
    produtoListConsumidor1.add(produto3);

    List<Produto> produtoListConsumidor2 = new ArrayList<>();

    produtoListConsumidor2.add(produto2);
    produtoListConsumidor2.add(produto4);

    map.put(consumidor1, produtoListConsumidor1);
    map.put(consumidor2, produtoListConsumidor2);

    // Entry é quando você quer a chave e valor

    for (Map.Entry<Consumidor, List<Produto>> entry : map.entrySet()) {
      System.out.println(entry.getKey().getNome());

      for (Produto produto : entry.getValue()) {
        System.out.println(produto.getNome());
      }
    }
  }
}