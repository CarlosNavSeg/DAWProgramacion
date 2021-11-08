import java.util.Scanner;

public class ejemplo36 {
    public static void main(String[] args) {
        Scanner llenararray = new Scanner(System.in);

        int mayor = -1000;
        int [] valores = new int [10];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = llenararray.nextInt();
        }

        for (int i = 8; i >= 0; i--) {
            if (valores[i]<valores[i+1] && valores[i+1] > mayor ) {
                mayor = valores[i+1];
            }

        }

        System.out.println(mayor);
        llenararray.close();
    }
}
