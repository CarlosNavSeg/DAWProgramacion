import java.util.Scanner;
public class ejemplo30 {

    public static void main(String[] args) {
        Scanner fraseusuario = new Scanner(System.in);
        boolean polindroma = false;

        System.out.println("Introduzca una frase");
        String frase = fraseusuario.next();

        int longitud = frase.length();
        int j = longitud-1;
     
        int error = 0;

        for(int i = 0; i < longitud/2; i++) {
            
                if(frase.charAt(i) == frase.charAt(j)) {
                    polindroma = true;
                  
                }

                else {
                   error++;
                } 
                j--;
            }
        
        if (polindroma == true) {
            System.out.println("Palabra políndroma");
        }

        if(error != 0) {
            System.out.println("Palabra no políndroma");
        }
   
    fraseusuario.close();
}
        

}



