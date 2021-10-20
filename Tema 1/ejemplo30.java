import java.util.Scanner;
public class ejemplo30 {

    public static void main(String[] args) {
        Scanner fraseusuario = new Scanner(System.in);
        boolean políndroma = true;

        while (políndroma == true) {
        String palabra = fraseusuario.next();
        int longitud = palabra.length();
        if (longitud <= 3 && palabra.charAt(0) == palabra.charAt(longitud-1)) {
                System.out.println("Palabra palíndroma puede continuar");
            }
            if (longitud <= 5 && longitud > 3 && palabra.charAt(0) == palabra.charAt(longitud-1) && palabra.charAt(1) == palabra.charAt(longitud-2) ) {
                    System.out.println("Palabra palíndroma puede continuar");
                }
                if(longitud <=7 && longitud > 5 && palabra.charAt(0) == palabra.charAt(longitud-1) &&  palabra.charAt(1) == palabra.charAt(longitud-2) && palabra.charAt(2) == palabra.charAt(longitud-3)   ) {
                        System.out.println("Palabra políndroma puede continuar");
                    }
                    if(longitud <= 9 && palabra.charAt(0) == palabra.charAt(longitud-1) && palabra.charAt(1) == palabra.charAt(longitud-2) && palabra.charAt(2) == palabra.charAt(longitud-3) && palabra.charAt(3) == palabra.charAt(longitud-4)) {
                            System.out.println("Palabra políndroma puede continuar");
                        }
                    
        if (palabra.charAt(0) != palabra.charAt(longitud-1)) {
            System.out.println("Palabra no políndroma, el programa terminará");
            políndroma = false;
        }
    }
        fraseusuario.close();

    }
}


