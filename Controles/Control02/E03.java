package Control02;

import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);

        System.out.print("Primera nota: ");
        double primeranota = notas.nextDouble();

        System.out.print("Segunda nota: ");
        double segundanota = notas.nextDouble();

        System.out.print("Tercera nota: ");
        double terceranota = notas.nextDouble();

        System.out.print("Cuarta nota: ");
        double cuartanota = notas.nextDouble();

        System.out.println("El promedio es: " + (primeranota + segundanota + terceranota + cuartanota) / 4);

        notas.close();
    }
}
