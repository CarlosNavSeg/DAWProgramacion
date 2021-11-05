package Control02;

import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        Scanner datosaconvertir = new Scanner(System.in);

        System.out.print("Ingrese longitud: ");
        double longitud = datosaconvertir.nextDouble();

        System.out.println(longitud/2.54);

        datosaconvertir.close();
    }
}
