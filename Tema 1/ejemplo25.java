import java.util.Scanner;

public class ejemplo25 {
    public static void main(String[] args) {
        Scanner numeroafactorizar = new Scanner(System.in);

        System.out.println("Introduzca el numero a factorizar");
        int numero = numeroafactorizar.nextInt();

        numeroafactorizar.close();
        int comienzo = 1;

        for (int i=1; i <= numero ; i++) {
            int resultado = comienzo * i;
            comienzo = resultado;
            System.out.println(comienzo);
        }

    }
}