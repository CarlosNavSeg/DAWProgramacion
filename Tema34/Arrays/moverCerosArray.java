package Tema34.Arrays;

public class moverCerosArray {
    public static void main(String[] args) {

        int controlPoscion = 1;
        int el0;
        int [] arrayEjemplo = {0, 2, 1, 0, 5, 0, 1, 7, 9, 4, 2, 4, 18};

        for (int i = 0; i < arrayEjemplo.length; i++) {
            if (arrayEjemplo[i] == 0 && arrayEjemplo[arrayEjemplo.length-1] != 0) {
                el0 = arrayEjemplo[i];
                arrayEjemplo[i] = arrayEjemplo[arrayEjemplo.length-1];
                arrayEjemplo[arrayEjemplo.length-1] = el0;
            }
            else if (arrayEjemplo[i] == 0 && arrayEjemplo[arrayEjemplo.length-1] == 0) {
                if (arrayEjemplo[i+1] == 0){
                    break;
                }
                controlPoscion++;
                el0 = arrayEjemplo[i];
                arrayEjemplo[i] = arrayEjemplo[arrayEjemplo.length-controlPoscion];
                arrayEjemplo[arrayEjemplo.length-controlPoscion] = el0;
                
            }
        }
        for (int i = 0; i < arrayEjemplo.length; i++) {
            System.out.print(arrayEjemplo[i] + " ");
        }
    }
}
