package Control02;

import java.util.Scanner;

public class E08 {
    public static void main(String[] args) {
        Scanner numeroadescomponer = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        String numero = numeroadescomponer.next();

        int partentera = Integer.parseInt(numero);
        double partedecimal = Double.parseDouble(numero);

        System.out.println(partedecimal - partentera);

        numeroadescomponer.close();
    }

}