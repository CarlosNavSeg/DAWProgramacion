
import java.util.Scanner;

public class Control01 {
    public static void main(String[] args) {
        // Ya sabemos que necesitamos datos de entrada por teclado, así que declaramos una variable Scanner.
        Scanner datospoligono = new Scanner(System.in);
        
        //Esta variable será usada para almacenar el número de lados, usamos un byte porque la probabilidad de
        //que un polígono introducido por el usuario tenga un número de lados mayor a 127 es muy baja, además de que los lados siempre son enteros.
        System.out.println("Dime el número de lados del polígono");
        byte lados = datospoligono.nextByte();

        //La condición propuesta solo funciona con 3 y 4
        if (lados == 3) {
            System.out.println("Dime la longitud del lado del polígono, usa una ',' para los decimales");
            //Usaremos una variable para almacenar la longitud del lado
            double longitud = datospoligono.nextDouble();
            //Línea de cálculo (datos a mostrar)
            System.out.println("El perímetro del triangulo es " + longitud*lados);
        }

        else if (lados == 4) {
            System.out.println("Dime la longitud del lado del polígono usa una ',' para los decimales");
            double longitud = datospoligono.nextDouble();
            System.out.println("El perímetro del cuadrado es " + longitud*lados);
        }

        //Cerramos el Scanner ya que hemos terminado su uso
        datospoligono.close();

    }
}