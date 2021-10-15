public class ejemplo29 {
    public static void main(String[] args) {
        
        boolean esPrimo = false;

        for(int i=3; i <= 100 ; i++ ) {

            int j = 2;
            esPrimo = false;

            while (j <= i/2) {

                if (i%j == 0) {
                    esPrimo = false;
                }

                else {
                    esPrimo = true;
                }
                
                j++;

            }

        }
    }
}