import java.util.Scanner;
public class ejemplo30 {

    public static void main(String[] args) {
        Scanner fraseusuario = new Scanner(System.in);
        boolean políndroma = true;

        while (políndroma == true) {
        String palabra = fraseusuario.next();
        int longitud = palabra.length();
        if (palabra.charAt(0) != palabra.charAt(longitud-1)) {
            políndroma = false;
        }
        fraseusuario.close();

    }
    }
}
