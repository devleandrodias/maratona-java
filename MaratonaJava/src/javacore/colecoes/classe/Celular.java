package javacore.colecoes.classe;

/**
 * Celular
 */
public class Celular {

  private String nome, IMEI;

  public Celular(String nome, String IMEI) {
    this.nome = nome;
    this.IMEI = IMEI;
  }

  /**
   * Reflexivo = x.equals(x) tem q ser true para tudo que for diferênte de null
   * 
   * Simétrico para x e y diferente de null, se x.quals(y) == true então
   * y.equals(x) tem que ser true
   * 
   * Transitividade para x e y e z diferente de null se x.equals(y) == true logo
   * y.equals(x) == true e x.equals(z) == true logo y.equals(x) também tem que ser
   * true
   * 
   * Consistente x.quals(y) deve sempre retornar o mesmo valor
   * 
   * Para x diferente de null x.equals(null) tem que retornar false;
   */

  @Override
  public boolean equals(Object obj) {
    if (obj == null)
      return false;

    if (this == obj)
      return true;

    if (this.getClass() != obj.getClass())
      return false;

    Celular outroCelular = (Celular) obj;

    return IMEI != null && IMEI.equals(outroCelular.getIMEI());

  }

  public String getNome() {
    return nome;
  }

  public String getIMEI() {
    return IMEI;
  }

  public void setIMEI(String IMEI) {
    this.IMEI = IMEI;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}