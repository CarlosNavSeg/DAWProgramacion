import java.util.Scanner;

class ejemplo27{
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Introduzca el numero a factorizar");
        int n = numero.nextInt();
         String cadena = Integer.toString(n);
        numero.close();

        for (int i=0; i<n ; i++) {
            String cadenai = Integer.toString(i);
            cadena.concat(cadenai);
            System.out.println(cadena);
        }

    }
}