package introducao.arrays;

/**
 * ArraysMultidimensionais
 */
public class ArraysMultidimensionais {

  public static void main(String[] args) {
    /**
     * - Arrays Multidimencionais - No Java só é necessário definir o tamanho do
     * array original. Conceito de Matrizes.
     */

    /**
     * Neste exemplo a primeira primeiro array tem duas posições que referência cada
     * um, um array de inteiros de 4 posições
     */
    int[][] arrays = new int[2][4];

    arrays[0][0] = 142;
    arrays[0][1] = 134;
    arrays[0][2] = 163;
    arrays[0][3] = 146;

    arrays[1][0] = 256;
    arrays[1][1] = 623;
    arrays[1][2] = 135;
    arrays[1][3] = 724;

    for (int i = 0; i < arrays.length; i++) {
      System.out.println(arrays[i]); // Isso é um endereço de memória, que faz referência para cada array

      for (int j = 0; j < arrays[i].length; j++) {
        System.out.println(arrays[i][j]);
      }
    }

    for (int[] referenciaArray : arrays) {
      for (int valor : referenciaArray) {
        System.out.println(valor);
      }
    }
  }
}