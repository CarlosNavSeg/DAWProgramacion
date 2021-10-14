import java.util.Scanner;

public class ejemplo20 {
    public static void main(String[] args) {
        Scanner cajera = new Scanner(System.in);

        System.out.println("Introduce el precio del producto:");
        double precio = cajera.nextInt();

        cajera.close();

        if(precio >= 6 && precio < 60) {
            precio = precio * 0.95;
            System.out.println(precio);
        }
        else if (precio>60) {
            precio = precio * 0.9;
            System.out.println(precio);
        }

    }
}
