import java.util.Scanner;

public class ejemplo43 {
    public static void main(String[] args) {
        Scanner valorEntradasResta = new Scanner(System.in);

        System.out.print("Introduce el dividendo: ");
        int dividendo = valorEntradasResta.nextInt();

        System.out.print("Introduce el divisor");
        int divisor = valorEntradasResta.nextInt();

        while (dividendo >= divisor) {
            dividendo = dividendo - divisor;
        }

        System.out.println(dividendo);

        valorEntradasResta.close();
    }
}
