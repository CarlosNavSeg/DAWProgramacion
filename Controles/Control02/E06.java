package Control02;

import java.util.Scanner;
import java.lang.Math;

public class E06 {
    public static void main(String[] args) {
        Scanner datostriangulo = new Scanner(System.in);

        System.out.print("Ingrese cateto a: ");
        double catetoa = datostriangulo.nextDouble();

        System.out.print("Ingrese cateto b: ");
        double catetob = datostriangulo.nextDouble();

        System.out.println("La hipotenusa es: " + Math.sqrt(Math.pow(catetoa, 2) + Math.pow(catetob, 2)));

        datostriangulo.close();
    }
}
