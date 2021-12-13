package Arrays;

import java.util.Scanner;

class eliminarArray {
    public static void main(String[] args) {
        Scanner indiceUsuario = new Scanner(System.in);

        String[] arrayIndexado = { "hola", "jefes", "quetal", "estais" };

        System.out.println("Introduce el índice del elemento que deseas eliminar");
        int indice = indiceUsuario.nextInt();

        System.out.println("Estos son los elementos del array:");
        for (int i = 0; i < arrayIndexado.length; i++) {
            System.out.println(arrayIndexado[i] + " " + "\n");
        }
        boolean salidaArray = false;

        while (salidaArray == false) {
            if (indice > arrayIndexado.length || indice < 0) {
                System.out.println("Tete te saliste del array");
            }

            else {
                while (indice < arrayIndexado.length - 1) {
                    String guardar = arrayIndexado[indice + 1];

                    arrayIndexado[indice + 1] = arrayIndexado[indice];
                    arrayIndexado[indice] = guardar;
                    indice++;

                }
                arrayIndexado[indice] = "";
                salidaArray = true;
            }
            for (int i = 0; i < arrayIndexado.length; i++) {
                System.out.println(arrayIndexado[i]);
            }
            System.out.println("Como ves, el elemento que había en el índice ha sido eliminado");
            indiceUsuario.close();

        }
    }
}
