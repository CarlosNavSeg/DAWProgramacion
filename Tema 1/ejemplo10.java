import java.util.Scanner;

public class ejemplo10 {
    public static void main(String[] args) {
        System.out.println("Introduzca un valor");

        Scanner kdb = new Scanner(System.in);
        double x = kdb.nextDouble();

        kdb.close();
        
        if (x<0) {
            System.out.println("Número negativo");
        }
        else {
            System.out.println("Número positivo");
        }
    }
}
