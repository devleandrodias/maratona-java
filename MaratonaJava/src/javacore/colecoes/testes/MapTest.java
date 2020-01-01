package javacore.colecoes.testes;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * MapTest
 */
public class MapTest {

  public static void main(String[] args) {
    // Key, Value
    Map<String, String> map = new LinkedHashMap<>();

    /**
     * Não pode existir chaves duplicadas
     * 
     * Para manter ordem de Insersão LinkedHashMap
     */

    map.put("tecklado", "teclado");
    map.put("mause", "mouse");
    map.put("vc", "você");
    map.put("vc", "você2"); // sobrescreve
    map.put("vc", "voce");

    // Não existe elementos duplicados por isso um SET
    for (String key : map.keySet()) {
      System.out.println(key);
    }

    for (String key : map.values()) {
      System.out.println(key);
    }

    // Pegar chave e valor
    for (Map.Entry<String, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }
}