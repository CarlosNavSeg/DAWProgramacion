import java.util.Scanner;

public class ejemplo47 {
    public static void main(String[] args) {
        Scanner cadenasTexto = new Scanner(System.in);

        String [] cadenas = new String[5];

        for (int i = 0; i < cadenas.length; i++) {
            cadenas[i] = cadenasTexto.next();
        }
        System.out.println("********************");
        for (int i = 0; i < cadenas.length; i++) {
            System.out.println("* " + cadenas[i] + "                    *");
        }
        System.out.println("********************");
    }
}
