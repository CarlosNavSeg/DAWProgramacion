package Tema34.Arrays;

public class arraysIguales {
    public static void main(String[] args) {
        int[] arrayEjemplo = {2, 5, 7, -1, -4 };

        int matchErrores = 0;

        int[] arrayEjemplo2 = {2, 4, 7, -1, -4};

        for (int i = 0; i < arrayEjemplo.length; i++) {
            if(arrayEjemplo[i] == arrayEjemplo2[i]) {

            }
            else {
                matchErrores++;
            }
        }
        if (matchErrores == 0) {
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Los arrays no son iguales");
        }
    }
}
