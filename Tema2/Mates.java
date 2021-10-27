import java.lang.Math;

public class Mates {
    public static double suma (double operando1, double operando2) {
        double resultado = operando1 + operando2;
        return resultado;
    }

    public static double resta (double operando1, double operando2) {
        double resultado = operando1- operando2;
        return resultado;
    }

    public static double multiplicación(double operando1, double operando2) {
        double resultado = operando1 * operando2;
        return resultado;
    }

    public static double division(double dividendo, double divisor) {
        double resultado = dividendo/divisor;
        return resultado;
    }

    public static double areacirculo(int radio) {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }
    public static void main(String[] args) {
        System.out.println(suma(1, 2));
        System.out.println(resta(2,1));
        System.out.println(multiplicación(2, 1));
        System.out.println(division(4,2));
        System.out.println("El area del circulo de radio 2 es 12,56..." + areacirculo(2));

    }
}
