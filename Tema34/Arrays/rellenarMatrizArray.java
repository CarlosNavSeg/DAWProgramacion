package Tema34.Arrays;

public class rellenarMatrizArray {
    public static void main(String[] args) {
        int max = 1;
        int min = 0;

        int [] [] matrizBinaria = new int[10][10];
        
        for (int i = 0; i < matrizBinaria.length; i++) {
            for (int j = 0; j < matrizBinaria[0].length; j++) {
                matrizBinaria[i][j] = (int) (Math.random() * (max - min + 1) + min);
            }
        }
        for (int i = 0; i < matrizBinaria.length; i++) {
            for (int j = 0; j < matrizBinaria[i].length; j++) {
                System.out.print(matrizBinaria[i][j]);
            }
            System.out.println("");
        }
    }
}
