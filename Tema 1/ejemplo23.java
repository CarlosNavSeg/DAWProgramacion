import java.util.Scanner;

public class ejemplo23 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        
        System.out.println("Introduce cualquier número '0' para acabar"); 

       double entrada;

    do {
        
        entrada = numeros.nextDouble();  
        
       } while(entrada != 0);

       numeros.close();
       
    }
}
