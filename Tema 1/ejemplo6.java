import java.util.Scanner;
public class ejemplo6 {
    public static void main(String[] args) {
        Scanner kdb = new Scanner(System.in);
        System.out.println("Introduzca el radio:");
        float radio = kdb.nextFloat();
        double pi = 3.141516;
        double length = pi*2*radio;
        double area = pi*radio*radio;
        System.out.println("Perímetro:" + length);
        System.out.println("Area:" + area);
        kdb.close();
    }
}
