import java.util.Scanner;

public class getInteger_getDouble {
    public static int getInteger() {
        Scanner token = new Scanner(System.in);

        boolean hayInteger = false;

        int valorenInt = 0;
        String valor;

        System.out.println("Introduce lo que quieras");

        while (hayInteger == false) {
            valor = token.next();

            Scanner comprobador = new Scanner(valor);

            if (comprobador.hasNextInt() == true) {
                hayInteger = true;
                valorenInt = Integer.parseInt(valor);
                comprobador.close();

            }
        }

        token.close();

        return valorenInt;
    }

    public static void main(String[] args) {
        System.out.println("El resultado después del bucle es:" + getInteger());
    }

}
