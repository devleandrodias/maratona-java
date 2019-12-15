package app;

/**
 * MaisArraysMultidimencionais
 */
public class MaisArraysMultidimencionais {

  public static void main(String[] args) {
    // int[][] dias = new int[3][];

    // dias[0] = new int[2];
    // dias[1] = new int[] { 123, 412, 144 };
    // dias[2] = new int[5];

    int[][] multiArrays = { { 1, 3, 5 }, { 1, 4 }, { 1 }, { 1, 52, 63, 364, 346 } };

    for (int[] ref : multiArrays) {
      for (int num : ref) {
        System.out.println(num);
      }
    }

  }
}