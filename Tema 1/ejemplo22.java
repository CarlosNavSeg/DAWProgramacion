import java.util.Scanner;

public class ejemplo22 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);

        int contadordepositivos = 0;
        System.out.println("Introduce 10 números");
        
        for(int i = 1; i<10 ; i++) {
            double pregunta = numeros.nextDouble();
            if (pregunta > 0) {
                contadordepositivos++;
            }

        }
        System.out.println("Hay:" +contadordepositivos+ "numeros positivos");
        
        numeros.close();
    }
}
