package orientacaoobjetos.introducaoclassestest;

import orientacaoobjetos.introducaoclasses.Estudante;

/**
 * EstudanteTest
 */
public class EstudanteTest {

  public static void main(String[] args) {
    Estudante leandroEstudante = new Estudante();
    Estudante thaisEstudante = new Estudante();
    Estudante rhairaEstudante = new Estudante();

    leandroEstudante.nome = "Leandro";
    thaisEstudante.nome = "Thaísa";
    rhairaEstudante.nome = "Rhaira";

    leandroEstudante.idade = 19;
    thaisEstudante.idade = 20;
    rhairaEstudante.idade = 19;

    leandroEstudante.matricula = "WGWEG@#$@@#";
    thaisEstudante.matricula = "FGSRGSERG@#$";
    rhairaEstudante.matricula = "SEGSERGE@$%";

    System.out.println(leandroEstudante.nome);

  }
}