package javacore.polimorfismo.classe;

/**
 * ArquivoDAOImplement
 */
public class ArquivoDAOImplement implements IGenericDAO {

  @Override
  public void save() {
    System.out.println("Salvando dados nos arquivos.");
  }
}