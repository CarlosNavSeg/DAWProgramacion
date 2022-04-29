package Tema34.Arrays;

public class paresOImparesArray {
    public static void main(String[] args) {

        String[] arrayEjemplo = { "1", "5", "1", "7", "9", "4", "2", "4", "18" };

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < arrayEjemplo.length; i++) {
            if (arrayEjemplo[i].charAt(arrayEjemplo[i].length() - 1) == '2') {
                pares++;
            }
            else if (arrayEjemplo[i].charAt(arrayEjemplo[i].length() - 1) == '4') {
                pares++;
            }
            else if (arrayEjemplo[i].charAt(arrayEjemplo[i].length() - 1) == '6') {
                pares++;
            }
            else if (arrayEjemplo[i].charAt(arrayEjemplo[i].length() - 1) == '8') {
                pares++;
            } 
            else {
                impares++;
            }
        }
        System.out.println("Pares: " + pares + " Impares: " + impares);
    }
}
