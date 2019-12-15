package introducao.arrays;

/**
 * ArraysSimples
 */
public class ArraysSimples {

  public static void main(String[] args) {
    // Toda referência de um array é um objeto

    /**
     * Sempre precisa especificar o tamanho do array na hora que ele for
     * instanciado, nunca quando se cria a variavel de referência
     */

    // Só pode usar new quando for instanciar um objeto (Array é um objeto)

    int[] idades = new int[10];

    idades[0] = 10;
    idades[1] = 12;
    idades[2] = 14;
    idades[3] = 16;
    idades[4] = 12;
    idades[5] = 13;
    idades[6] = 25;
    idades[7] = 32;
    idades[8] = 26;
    idades[9] = 21;

    System.out.println(idades[2]);
  }
}