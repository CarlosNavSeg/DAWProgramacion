import java.util.Scanner;
public class ejemplo7 {
    public static void main(String[] args) {
        Scanner kdb = new Scanner(System.in);
        System.out.println("Introduce el precio real");
        float precioreal = kdb.nextFloat();
        System.out.println("Introduce el precio rebajado");
        float preciorebajado = kdb.nextFloat();
        kdb.close();
        double descuento = ((precioreal-preciorebajado)/precioreal * 100);
        System.out.println(descuento);
    }
}
