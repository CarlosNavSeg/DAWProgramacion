import java.util.Scanner;

public class ejemplo39 {
    public static void main(String[] args) {
        Scanner valoradividir = new Scanner(System.in);
 
        double valor = valoradividir.nextDouble();

        int [] divisores = new int[(int) valor];


        for (int i = 0; i < valor/2; i++) {

            if (valor%i == 0) {
                divisores[i] = i;
            
            }
        }
        
        for (int i = 0; i < divisores.length; i++) {
            if (divisores[i] != 0)
            System.out.println(divisores[i] );
        }

        valoradividir.close();
    }
}
