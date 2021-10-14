import java.util.Scanner;

public class ejemplo22 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);

        System.out.println("Introduce 10 números");
        
        for(int i = 1; i<10 ; i++) {
            double pregunta = numeros.nextDouble();
            if (pregunta < 0) {
                System.out.println("Número negativo");
            }
            else {
                System.out.println("Número positivo");
            }
        }
        
        numeros.close();
    }
}
