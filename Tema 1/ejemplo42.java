import java.util.Scanner;

public class ejemplo42 {
    public static void main(String[] args) {
        Scanner lectorEntradasSumas = new Scanner(System.in);

        System.out.print("Introduce el valor x: ");
        int x = lectorEntradasSumas.nextInt();

        System.out.print("Introduce el valor y: ");
        int y = lectorEntradasSumas.nextInt();

        int mult = x;
        for (int i = 1; i < y; i++) {
            mult = mult + y;
        }
        System.out.println(mult);

        lectorEntradasSumas.close();
    }
}
