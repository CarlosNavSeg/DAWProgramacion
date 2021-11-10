import java.util.Scanner;
import java.lang.Math;
public class ejemplo44 {
    public static void main(String[] args) {
        Scanner binarioUsuario = new Scanner(System.in);

        double resultadodecimal = 0;

        System.out.println("Introduzca una cadena binaria");
        String cadenabinaria = binarioUsuario.next();

        for (int i = 0; i < cadenabinaria.length(); i++) {
            if(cadenabinaria.charAt(i) == '1') {
                resultadodecimal += Math.pow(2, i);
            }
        }

        binarioUsuario.close();

        System.out.println(resultadodecimal);
    }
}
