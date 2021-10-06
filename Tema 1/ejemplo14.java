import java.util.Scanner;

public class ejemplo14 {
    public static void main(String[] args) {
        Scanner kdb = new Scanner(System.in);

        System.out.println("Introduzca el valor númerico de la nota:");
        double nota = kdb.nextDouble();

        kdb.close();

        if (nota < 0 || nota > 10 ) {
            System.out.println("La nota es inválida");
        }

            else if(nota > 0 && nota <= 3 ) {
                System.out.println("La nota es muy deficiente");
            }
        
            else if (nota >= 3 && nota < 5) {
            System.out.println("La nota es insuficiente");
        }
        
            else if (nota >= 5 && nota < 6) {
            System.out.println("La nota es suficiente");
        }
            else if (nota >= 6 && nota < 7) {
                System.out.println("La nota es bien");
            }
            else if((nota >= 7) && (nota < 9)) {
                System.out.println("La nota es notable");
            }
            else if (nota >= 9 && nota <= 10) {
                System.out.println("La nota es sobresaliente");
            }
        } 
}
    
