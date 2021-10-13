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
          salariobruto = salariobruto + 1.5 * (horas -35);

          if (salariobruto > 500 && salariobruto <= 900) {
            
           double impuesto1 = salariobruto*0.25;
           double salarioTot = salariobruto - impuesto1;

           System.out.println(impuesto1);
           System.out.println(salarioTot);

            if (salarioTot>900) {
                double impuesto2 = salarioTot * 0.45 ;
                System.out.println((impuesto1 + impuesto2));
                System.out.println(salarioTot - impuesto2);              
            }

            else {
                System.out.println(salariobruto);
            }
          }
        }

       else {
            System.out.println(salariobruto);
        }
        
          salariohora.close();

  
        }
      } 


        
        
