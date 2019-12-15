package javacore.introducaoclasses.testes;

import javacore.introducaoclasses.classe.Estudante;

/**
 * EstudanteTest
 */
public class EstudanteTest {

  public static void main(String[] args) {
    // As classes devem ter Alta coesão cada classes deve ter um único objetivo
    Estudante leandro = new Estudante();
    Estudante thiasa = new Estudante();
    Estudante rhiara = new Estudante();

    leandro.nome = "Leandro";
    thiasa.nome = "Thaísa";
    rhiara.nome = "Rhaira";

    leandro.idade = 19;
    thiasa.idade = 20;
    rhiara.idade = 19;

    leandro.matricula = "WGWEG@#$@@#";
    thiasa.matricula = "FGSRGSERG@#$";
    rhiara.matricula = "SEGSERGE@$%";

    System.out.println(leandro.nome);

  }
}