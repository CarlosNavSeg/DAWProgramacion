package Control02;

import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {
        Scanner reloj = new Scanner(System.in);

        System.out.print("Hora actual: ");
        int hora = reloj.nextInt();

        System.out.print("Cantidad de horas: ");
        int horaspasadas = reloj.nextInt();

        System.out.println("En " + horaspasadas + " horas, el reloj marcara las " + (hora + horaspasadas) % 12);

        reloj.close();
    }
}
