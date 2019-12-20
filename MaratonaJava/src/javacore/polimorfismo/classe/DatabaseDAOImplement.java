package javacore.polimorfismo.classe;

/**
 * DatabaseDAOImplement
 */
public class DatabaseDAOImplement implements IGenericDAO {

  @Override
  public void save() {
    System.out.println("Salvando dados no banco de dados.");
  }
}