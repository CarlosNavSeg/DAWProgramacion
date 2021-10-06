import java.util.Scanner;

public class ejemplo15 {
    public static void main(String[] args) {
        //Hay que buscar optimizar
        Scanner kdb = new Scanner(System.in);

        System.out.println("Introduzca un entero entre 1 y 10 para ver su valor en letra");
        int caso = kdb.nextInt();

        kdb.close();
        
        switch (caso) {
            case 1:
            System.out.println("a");
            break;

            case 2:
            System.out.println("b");
            break;

            case 3:
            System.out.println("c");
            break;

            case 4:
            System.out.println("d");
            break;

            case 5:
            System.out.println("e");
            break;

            case 6:
            System.out.println("f");
            break;

            case 7:
            System.out.println("g");
            break;

            case 8:
            System.out.println("h");
            break;
            
            case 9:
            System.out.println("i");
            break;

            case 10:
            System.out.println("j");
            break;

            default:
            System.out.println("No hay letra correspondiente");
            break;

        }
    }
}
