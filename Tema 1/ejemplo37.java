import java.util.Scanner;

public class ejemplo37 {
    public static void main(String[] args) {
        Scanner llenararray = new Scanner(System.in);

        int menor = 10000;
        int mayor = -1000;
        int [] valores = new int [10];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = llenararray.nextInt();
        }

        for (int i = 8; i >= 0; i--) {
            if (valores[i]> mayor ) {
                mayor = valores[i];
            }
            if (valores[i] < menor ) {
                menor = valores[i];
            }

        }




        System.out.println(mayor);
        System.out.println(menor);
        llenararray.close();
    }
}
