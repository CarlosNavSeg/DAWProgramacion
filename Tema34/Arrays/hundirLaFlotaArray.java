package Tema34.Arrays;

import java.util.Scanner;

public class hundirLaFlotaArray {
    public static void createShips(int numShips, int[][] shipPlaces) {
        int r1, r2;
        int barcosVivos = 0;

        while (barcosVivos < numShips) {
            r1 = (int) (Math.random() * 8);
            r2 = (int) (Math.random() * 8);
            if (shipPlaces[r1][r2] != 1) {
                shipPlaces[r1][r2] = 1;
                barcosVivos++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner posicionesUsuario = new Scanner(System.in);

        int[][] shipPlaces = new int[8][8];
        createShips(10, shipPlaces);

        int ataques = 0;
        int barcosHundidos = 0;

        String[][] tableroStrings = new String[8][8];
        for (int j = 0; j < tableroStrings.length; j++) {
            for (int j2 = 0; j2 < tableroStrings.length; j2++) {
                tableroStrings[j][j2] = " ";
            }
        }

        while (ataques < 12) {
            boolean hit = false;
            boolean ataqueCompletado = false;

            System.out.print("Introduce la letra de la fila (A-H): ");

            String fila = posicionesUsuario.next();
            String filaUpperCase = fila.toUpperCase();

            char filaEnChar = filaUpperCase.charAt(0);

            char letra = 'A';

            System.out.print("Introduce el numero de la columna(0-7): ");
            int columna = posicionesUsuario.nextInt();

            int filaEnint = 0;

            if (filaEnChar == 'A') {
                filaEnint = 0;
            }
            if (filaEnChar == 'B') {
                filaEnint = 1;
            }
            if (filaEnChar == 'C') {
                filaEnint = 2;
            }
            if (filaEnChar == 'D') {
                filaEnint = 3;
            }
            if (filaEnChar == 'E') {
                filaEnint = 4;
            }
            if (filaEnChar == 'F') {
                filaEnint = 5;
            }
            if (filaEnChar == 'G') {
                filaEnint = 6;
            }
            if (filaEnChar == 'H') {
                filaEnint = 7;
            }

            if (filaEnChar < 'A' || filaEnChar > 'Z' || columna < 0 || columna >= 8) {
                System.out.println("La coordenada propuesta no existe");
            }

            else {
                ataqueCompletado = true;
                ataques++;
            }

            if (ataqueCompletado == true) {

                if (shipPlaces[filaEnint][columna] == 1) {
                    hit = true;
                    barcosHundidos++;
                }

                for (int j = 0; j < tableroStrings.length; j++) {
                    for (int j2 = 0; j2 < tableroStrings[j].length; j2++) {
                        if (j == filaEnint && j2 == columna) {
                            if (hit == true) {
                                tableroStrings[j][j2] = "X";
                            } else {
                                tableroStrings[j][j2] = "O";
                            }
                        }
                    }

                }
                System.out.println("  1 2 3 4 5 6 7 8");
                for (int i2 = 0; i2 < tableroStrings.length; i2++) {
                    System.out.print(letra);
                    for (int j = 0; j < tableroStrings[i2].length; j++) {
                        System.out.print(" " + tableroStrings[i2][j]);
                    }
                    System.out.println("");
                    letra++;
                }
                
            }
        }

        System.out.println("Barcos hundidos: " + barcosHundidos + " Tiros: 12");
        posicionesUsuario.close();

    }

}
