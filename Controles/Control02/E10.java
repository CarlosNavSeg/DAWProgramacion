package Control02;

import java.util.Scanner;
import java.lang.Math;

public class E10 {
    public static void main(String[] args) {
        Scanner temperatura = new Scanner(System.in);

        System.out.print("Ingrese temperatura original: ");
        double temperaturaoriginal = temperatura.nextDouble();

        System.out.println((Math.pow(67, 2/3) * 3.7 * Math.pow(1.038, 1/3)) / 0.0054 * Math.PI * Math.PI * (Math.pow(4*Math.PI/3, 4/3)) * Math.log(0.76*((100-temperaturaoriginal)/(63- temperaturaoriginal))));
        
    }
}
