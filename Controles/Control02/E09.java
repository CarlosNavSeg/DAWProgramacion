package Control02;

import java.util.Scanner;

public class E09 {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);
        
        System.out.print("Ingrese nota certamen 1: ");
        double notacertamen1 = notas.nextDouble();

        System.out.print("Ingrese nota certamen 2: ");
        double notacertamen2 = notas.nextDouble();

        System.out.print("Ingrese nota laboratorio: ");
        double notalaboratorio = notas.nextDouble();
        
        double notacertamen3 = (((notacertamen1 + notacertamen2)/3) * 0.7) + (notalaboratorio * 0.3)%60;

        System.out.println("Necesita nota " + notacertamen3 + " en el certamen 3");

        notas.close();
        
    }
}
