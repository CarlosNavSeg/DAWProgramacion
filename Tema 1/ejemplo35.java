import java.util.Scanner;

public class ejemplo35 {
    public static void main(String[] args) {
        Scanner profesor = new Scanner(System.in);

        int sum = 0;
        boolean wasTen = false;
        int i = 0;
        double [] notas = new double[100];

        System.out.println("Introduce las notas, cuando introduzcas -1 el programa finalizará");

            while(notas[i] != -1) {

                double notaintroducida = profesor.nextDouble();
                notaintroducida = notas[i+1];
                sum += notaintroducida;

                if(notaintroducida == 10){
                    wasTen = true;
                }
                
                i++;
            }
            double resultado = sum + i;

        profesor.close();

        System.out.println("Media:" + resultado);
        if(wasTen == true) {
            System.out.println("Habia un 10");
        }
        else {
            System.out.println("No habia un 10");
        }
    }
}
