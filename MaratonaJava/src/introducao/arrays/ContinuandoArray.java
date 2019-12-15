package introducao.arrays;

/**
 * ContinuandoArray
 */
public class ContinuandoArray {

  public static void main(String[] args) {
    /**
     * Todos os itens do array tem padrão de inicialização byte, shot, int, long,
     * float, double = 0; char = '\u0000' ' ' boolean = false references = null
     */

    boolean[] idades = new boolean[3];

    System.out.println(idades[0]);
    System.out.println(idades[1]);
    System.out.println(idades[2]);

    /**
     * Regras criação de arrays, deve-se definir o tamanho do array ao ser
     * inicializado e não pode ser alterado em tempo de execução, caso for
     * necessário criar um novo array
     */

    String[] nomes = new String[3];

    nomes[0] = "Naruto";
    nomes[1] = "Goku";
    nomes[2] = "Lulu de Sisnei";

    for (int i = 0; i < nomes.length; i++) {
      System.out.println((i + 1) + "º nome: " + nomes[i]);
    }
  }
}