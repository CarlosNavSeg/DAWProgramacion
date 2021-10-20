import java.util.Scanner;

public class ejemplo23 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        
        System.out.println("Introduce cualquier número '0' para acabar"); 
        int numerosPositivos = 0;
       double entrada;

    do {
        
        entrada = numeros.nextDouble();

        if (entrada > 0) {
            numerosPositivos++;
        }  
        
       } while(entrada != 0);

       System.out.println("Has introducido " + numerosPositivos + " numeros positivos");

       numeros.close();
       
    }
}
