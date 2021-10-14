import java.util.Scanner;

public class ejemplo26 {
    public static void main(String[] args) {
        Scanner numeroafactorizar = new Scanner(System.in);

        System.out.println("Introduzca el numero a factorizar");
        int numero = numeroafactorizar.nextInt();

        numeroafactorizar.close();

        for (int i=0; i<numero ; i++) {
            int resultado = numero * i;
            System.out.println(resultado);
        }

    }
}
