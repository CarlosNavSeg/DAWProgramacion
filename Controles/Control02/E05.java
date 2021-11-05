package Control02;

import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        Scanner digito = new Scanner(System.in);

        System.out.print("Ingrese numero: ");
        String numero = digito.next();

        for (int i = 0; i < numero.length(); i++) {
            System.out.print(numero.charAt(numero.length() - 1 - i));
        }

        System.out.println("");

        digito.close();

    }

}
