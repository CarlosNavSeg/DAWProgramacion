package Arrays;

public class duplicadosEnArray {
    public static void main(String[] args) {
        int [] arrayEjemplo = {1, 5, 1, 7, 9, 4, 2, 4};

        for (int i = 0; i < arrayEjemplo.length; i++) {
            int numeroabuscar = arrayEjemplo[i];
            for (int j = i+1; j < arrayEjemplo.length ; j++) {
                if(arrayEjemplo[j] == numeroabuscar) {
                    System.out.println("El elemento " + arrayEjemplo[j] + " está repetido en el array");
                    j = arrayEjemplo.length-1;
                }                
            }
        }
    }
}
