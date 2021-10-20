public class ejemplo29 {
    public static void main(String[] args) {
        
        for(int i=3; i <= 100 ; i++ ) {
            int j = 2;
            int match = 0;
            while (j<=i/2) {
                if (i%j == 0) {
                    match++;
                }

                j++;
            }
            if (match == 0) {
                System.out.println(i);
            }
        }
    }
}