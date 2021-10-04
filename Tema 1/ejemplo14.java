import java.util.Scanner;

public class ejemplo14 {
    public static void main(String[] args) {
        Scanner kdb = new Scanner(System.in);
        System.out.println("Introduzca el valor númerico de la nota:");
        double primer = kdb.nextDouble();
        kdb.close();
        if (primer < 0 || primer > 10 ) {
            System.out.println("La nota es inválida");
        }

            else if(primer > 0 && primer <= 3 ) {
                System.out.println("La nota es muy deficiente");
            }
        
            else if (primer >= 3 && primer < 5) {
            System.out.println("La nota es insuficiente");
        }
        
            else if (primer >= 5 && primer > 6) {
            System.out.println("La nota es suficiente");
        }
            else if (primer >= 6 && primer > 7) {
                System.out.println("La nota es bien");
            }
            else if((primer >= 7) && (primer < 9)) {
                System.out.println("La nota es notable");
            }
            else if (primer >= 9 && primer >= 10) {
                System.out.println("La nota es notable");
            }
        }
    

        
        

            
    
}
    
