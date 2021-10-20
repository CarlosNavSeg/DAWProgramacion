import java.util.Scanner;

public class ejemplo21 {
    
    public static void main(String[] args) {
        Scanner calendario = new Scanner(System.in);

        System.out.println("Introduzca el año que quiera para saber si es bisiesto");
        int año = calendario.nextInt();

        calendario.close();

        if (año%4 == 0 || año%400 == 0) {

            if(año%100 == 0 && año%400 !=0) {
                System.out.println("Año no bisiesto");
            }
            else{
            System.out.println("Año bisiesto");
        }
            
        }


    }
}
