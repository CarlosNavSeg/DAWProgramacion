import java.util.Scanner;

public class ejemplo38 {
    public static void main(String[] args) {
        Scanner cadenasdetexto = new Scanner(System.in);

        char [] vowels = {'a', 'e', 'i', 'o', 'u'};
        int contadordevocales = 0;

        String frase = cadenasdetexto.next();

        for (int i = 0; i < frase.length(); i++) {
                for (int j = 0; j < vowels.length; j++) {
                    if (frase.charAt(i) == vowels[j]) {
                        contadordevocales++;
                    }
                    

            }
          
        }

        cadenasdetexto.close();
        System.out.println(contadordevocales);
       

        }   
}

