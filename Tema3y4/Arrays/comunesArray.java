package Arrays;

public class comunesArray {
    public static void main(String[] args) {
        int[] Array1 = { 2, -1, 5, 7, 9, -4, -7, 8 };
        int[] Array2 = { 7, -2, 6, 10, 18, -4, 20, 8 };
        for (int i = 0; i < Array1.length; i++) {
            int posibleComun = Array1[i];
            for (int j = 0; j < Array2.length; j++) {
                if (posibleComun == Array2[j]) {
                    System.out.println("El elemento " + posibleComun + " está repetido en el índice " + i);
                }

            }

        }
    }
}
