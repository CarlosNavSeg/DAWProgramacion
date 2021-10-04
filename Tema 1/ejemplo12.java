import java.util.Scanner;
public class ejemplo12 {
    public static void main(String[] args) {
        Scanner kdb = new Scanner(System.in);
        System.out.println("Introduzca el primer valor:");
        double primer = kdb.nextDouble();
        System.out.println("Introduzca el segundo valor");
        double segon = kdb.nextDouble();
        kdb.close();
        if (primer>segon) {
            System.out.println(primer);
        }
        else  {
            System.out.println(segon);
        }
    }
}
