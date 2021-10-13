import java.util.Scanner;

public class ejemplo17 {
    public static void main(String[] args) {
        //Hay que buscar optimizar
        Scanner kdb = new Scanner(System.in);
        System.out.println("Introduzca un mes (en valor númerico) para ver sus días");

        int mes = kdb.nextInt();
        
        kdb.close();

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            System.out.println("El mes de Enero tiene 31 días ");
            break;

            case 2:
            System.out.println("El mes tiene 28 días");
            break;

            case 4:
            case 6:
            case 9:
            case 11:
            System.out.println("El mes tiene 30 días");
            break;

            default:
            System.out.println("Los meses solo van del 1 al 12");
            break;

        }
    }
}
