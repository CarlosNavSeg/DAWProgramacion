import java.util.Scanner;
import java.lang.Math;

public class ejemplo45 {
    public static void main(String[] args) {
        int numero, exp, digito;
        double binario;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero entero >= 0: ");
        numero = sc.nextInt();
        exp = 0;
        binario = 0;

        while (numero != 0) {
            digito = numero % 2;
            binario = binario + digito * Math.pow(10, exp);
            exp++;
            numero = numero / 2;
        }
        System.out.printf("Binario: %.0f %n", binario);
        sc.close();
    }

}
