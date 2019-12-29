package javacore.colecoes.testes;

import java.util.ArrayList;
import java.util.List;

import javacore.colecoes.classe.Celular;

/**
 * ListCelularTest
 */
public class ListCelularTest {

  public static void main(String[] args) {
    Celular celular1 = new Celular("Galaxy S10 Plus", "23543p4o5934yt93hg");
    Celular celular2 = new Celular("Galaxy 11 Pro Max", "8937tu0384ut93t9348ut");
    Celular celular3 = new Celular("Xiomi Mi9 SE", "92r902r029u092f9024");

    List<Celular> celularList = new ArrayList<>();

    celularList.add(celular1);
    celularList.add(celular2);
    celularList.add(celular3);

    for (Celular celular : celularList) {
      System.out.println(celular);
    }

    Celular celular4 = new Celular("Xiomi Mi9 SE", "92r902r029u092f9024");

    System.out.println("Tem " + celular4.getNome() + " na lista? " + (celularList.contains(celular4) ? "Sim" : "Não"));
  }
}