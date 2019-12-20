package javacore.polimorfismo.testes;

import javacore.polimorfismo.classe.ArquivoDAOImplement;
import javacore.polimorfismo.classe.DatabaseDAOImplement;
import javacore.polimorfismo.classe.IGenericDAO;

/**
 * DAOTest
 */
public class DAOTest {

  public static void main(String[] args) {
    // Interface como váriavel de referência

    // Programação orientada a interfaces

    IGenericDAO arquivo = new ArquivoDAOImplement();
    IGenericDAO database = new DatabaseDAOImplement();

    arquivo.save();
    database.save();
  }
}