package Control02;

import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        Scanner datosproblema = new Scanner(System.in);

        System.out.print("Ingrese el radio: ");
        double radio = datosproblema.nextDouble();

        System.out.print("Perimetro: ");
        double perimetro = datosproblema.nextDouble();

        System.out.println("Área: " + perimetro/2*radio);

        datosproblema.close();

    }
}
