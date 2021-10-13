import java.util.Scanner;

public class ejemplo19 {
    public static void main(String[] args) {
      Scanner salariohora = new Scanner(System.in);

      System.out.println("Introduce el salario por hora");
      double salario = salariohora.nextDouble();

      System.out.println("Introduce las horas de trabajo realizadas");
      double horas = salariohora.nextDouble();

      double salariobruto = salario*horas;

      if (horas > 35) {
          salariobruto = salariobruto + 1.5 * horas;

          if (salariobruto > 500 && salariobruto <= 900) {
           double salarioneto = salariobruto*0.75;
           System.out.println(salarioneto + salariobruto);

            if (salarioneto>900) {
                double salarioneto2 = salarioneto * 0.55;
                System.out.println(salarioneto2 + salarioneto);
            }
            else {
                System.out.println(salarioneto);
            }
          }

            else {
                System.out.println(salariobruto);
            }
          }

       else {
            System.out.println(salariobruto);
        }
          salariohora.close();

    }
}
