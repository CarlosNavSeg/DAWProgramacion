package Arrays;

import java.util.Scanner;

public class sumaIgualAArrays {
    public static void main(String[] args) {
        Scanner resultadoUsuario = new Scanner(System.in);

        int resultadoSuma = resultadoUsuario.nextInt();

        int[] arrayEjemplo = { 5, 4, 10, 9, 1, 2, 4, 8 };

        for (int i = 0; i < arrayEjemplo.length; i++) {
            for (int j = i + 1; j < arrayEjemplo.length; j++) {

                if(arrayEjemplo[i] + arrayEjemplo[j] == resultadoSuma){
                    System.out.println("El elemento de indice: " + i + " y el elemento de indice: " + j + " que son: " + arrayEjemplo[i] + " y " + arrayEjemplo[j] + " coinciden con el resultado del Usuario que es: " + resultadoSuma);
                }

            }
        }
        resultadoUsuario.close();
    }

}
