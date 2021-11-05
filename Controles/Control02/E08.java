package Control02;

import java.util.Scanner;

public class E08 {
    public static void main(String[] args) {
        Scanner numeroadescomponer = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        String numero = numeroadescomponer.next();

        System.out.println(numero.charAt(numero.lastIndexOf('.' + 1)));

        numeroadescomponer.close();
    }

}