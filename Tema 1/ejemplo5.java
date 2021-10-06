import java.util.Scanner;
public class ejemplo5 {
    public static void main(String[] args) {
       
        Scanner kdb = new Scanner(System.in);
        System.out.println("Introduce el primer valor:");
        int x = kdb.nextInt();
        
        System.out.println("Introduce el segundo valor:");
        int y = kdb.nextInt();
        
        int sum = x+y;
        
        int sub = x-y;
       
        int mult = x*y;
        
        int div = x/y;
        
        System.out.println("Sum:" + sum);
        System.out.println("Sub:" + sub);
        System.out.println("Mult:" + mult);
        System.out.println("Div:" + div);
        
        kdb.close();

    }
}
