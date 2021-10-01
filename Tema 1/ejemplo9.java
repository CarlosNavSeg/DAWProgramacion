import java.util.Scanner;

public class ejemplo9 {
    public static void main(String[] args) {
        System.out.println("Introduzca su edad:");
        Scanner kdb = new Scanner(System.in);
        int edad = kdb.nextInt();
        if (edad>18) {
            System.out.println("Tienes la edad legal");
        }
        else {
            System.out.println("No tienes la edad legal");
        }
    
    }
}