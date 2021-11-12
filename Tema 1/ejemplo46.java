import java.util.*;
public class ejemplo46 {

    public static void main(String[] args) {
        int max = 100;
        int min = 0;

        int numSecreto = (int) (Math.random() * (max - min + 1) + min);
        Scanner entradasUsuario = new Scanner(System.in);

        System.out.println("Dame un número");
        int numUsuario = entradasUsuario.nextInt();
        
        
        while(numUsuario != numSecreto && numUsuario != -1) {
            System.out.println("Dame un número");
            
            if(numUsuario < numSecreto) {
                System.out.println("Tu numero es más pequeño que el numero secreto");
            }
            else {
                System.out.println("Tu numero es más grande que el numero secreto");
            }

        }
        if(numUsuario == -1) {
            System.out.println("Se rinde");
        }

        entradasUsuario.close();

        if(numUsuario == numSecreto) {
            System.out.println("Has ganado!");
        }
    }
}
