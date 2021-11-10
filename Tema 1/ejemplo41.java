import java.util.Scanner;
public class ejemplo41 {
    public static void main(String[] args) {
        Scanner funcionfibonacci = new Scanner(System.in);

        System.out.print("Dame dos números que empiecen la función: ");
        double [] numerosfibonacci = new double [10];
        double f0 = funcionfibonacci.nextInt();
        double f1 = funcionfibonacci.nextInt();

        numerosfibonacci[0] = f0;
        numerosfibonacci [1] = f1;

        for (int i = 2; i < numerosfibonacci.length; i++) {
            double resultado = numerosfibonacci[i] = numerosfibonacci[i-1] + numerosfibonacci[i-2];
            double relacion = resultado/numerosfibonacci[i-1];
            System.out.println(resultado);
            System.out.println("Relacion: " + relacion);
        }

        funcionfibonacci.close();
    }
}
