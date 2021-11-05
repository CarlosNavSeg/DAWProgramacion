import java.util.Scanner;

public class ejemplo28 {
    public static void main(String[] args) {
        Scanner valorAComprobar = new Scanner(System.in);

        boolean divisorEncontrado = false;

        System.out.println("Dime el número que quieres comprobar si es primo o no");
        int numPrimoono = valorAComprobar.nextInt();

        valorAComprobar.close();

        for(int i=2; i <= numPrimoono/2 ; i++ ) {

            if(numPrimoono % i == 0) {
                divisorEncontrado = true;
            }
           

        }
        if (divisorEncontrado == true) {
            System.out.println("Número no primo");
        } 

        else {
            System.out.println("Número primo");
        }

    }
}
