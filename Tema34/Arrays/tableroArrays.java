package Tema34.Arrays;

public class tableroArrays {
    public static void main(String[] args) {
        int [][] tablero =  new int [8][8];

        int max = 3;
        int min = 0;

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = (int) (Math.random() * (max - min + 1) + min);
            }
        }

        String [][] tableroString =  new String[8][8];
     
        for (int i = 0; i < tableroString.length; i++) {
            for (int j = 0; j < tableroString.length; j++) {
                
                int valorAConvertir = tablero[i][j];

                String valorConvertido = Integer.toString(valorAConvertir);

                tableroString[i][j] = valorConvertido;

                if(valorAConvertir == 0) {
                    tableroString[i][j] = ".";
                }

                if(valorAConvertir == 1 ) {
                    tableroString[i][j] = "+";
                }

                if(valorAConvertir == 2) {
                    tableroString[i][j] = "0";
                }

                if(valorAConvertir == 3) {
                    tableroString[i][j] = "X";
                }

            }
        }
        for (int i = 0; i < tableroString.length; i++) {
            for (int j = 0; j < tableroString[i].length; j++) {
                System.out.print(tableroString[i][j]);
            }
            System.out.println("");
        }

    }
}
