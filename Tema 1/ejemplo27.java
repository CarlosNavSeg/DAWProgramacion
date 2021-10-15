import java.util.Scanner;

class ejemplo27{
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Introduzca el numero a escribir por líneas");
        int n = numero.nextInt();
        numero.close();

        for (int i=0; i <= n ; i++) {
            for (int j=1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("\n");
        }

    }
}