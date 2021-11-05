package Control02;

import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner nombreusuario = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");        
        String nombre = nombreusuario.next();

        System.out.println("Hola, " + nombre);

        nombreusuario.close();
    }
}
