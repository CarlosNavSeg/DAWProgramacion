import java.util.Scanner;

public class ejemplo4 {
    public static void main(String[] args) {
        Scanner kdb = new Scanner(System.in);
        System.out.println("Enter the side:");
        float x = kdb.nextFloat();
        double squareArea = x*x;
        System.out.println(squareArea);
        kdb.close();

    }
}
