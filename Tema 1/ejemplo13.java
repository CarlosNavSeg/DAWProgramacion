import java.util.Scanner;

public class ejemplo13 {
    public static void main(String[] args) {
        Scanner kdb = new Scanner(System.in);
        
        System.out.println("Introduzca el primer valor:");
        double primer = kdb.nextDouble();

        System.out.println("Introduzca el segundo valor");
        double segon = kdb.nextDouble();
        
        System.out.println("Presione 1 si quiere orden ascendente y 2 si quiere orden descendente");
        int decisión = kdb.nextInt();

        kdb.close();

        if (decisión == 1) {
            if (primer>segon) {
                System.out.println(primer + "," + segon);
            }
            else  {
                System.out.println(segon + "," + primer);
            }
        }
        if (decisión == 2) {
            if (primer<segon) {
                System.out.println(primer + "," + segon);
            }
            else  {
                System.out.println(segon + "," + primer);
            }

        
        }
    }
}
