public class recorridoArray {
    public static void main(String[] args) {
        int [] arrayEjemplo = new int[1000];
        int multiplo3 = 3;
        int multiplo7 = 7;
        for (int i = 0; i < arrayEjemplo.length; i++) {
            

            if(i%2 == 0) {
                if(i == 0) {
                    arrayEjemplo[i] = 3;
                }
                else{
                arrayEjemplo[i] = multiplo3 += 3;
                }
            }

            else {
                arrayEjemplo[i] = multiplo7 += 7;
            }
        }
        for (int i = 0; i < arrayEjemplo.length; i++) {
            if(arrayEjemplo[i] % 13 == 0) {
                System.out.println(arrayEjemplo[i]);
            }
        }
    }
}
