import java.util.Scanner;

public class ejemplo16 {
    public static void main(String[] args) {
        Scanner kdb = new Scanner(System.in);
        System.out.println("Introduzca dos números enteros");

        int x = kdb.nextInt();
        int y = kdb.nextInt();

        System.out.println("Introduzca el carácter de la operación que quiere realizar");
        String operación = kdb.next();

        kdb.close();

        switch(operación) {
            case "+" :
            System.out.println(x + y);
            break;

            case "-" :
            System.out.println(x - y);
            break;

            case "*" :
            System.out.println(x * y);
            break;

            case "/" :
            System.out.println(x / y);
            break;

            default:
            System.out.println("Eso no es un carácter operador");
            break;
        }

    }
}

        
    

