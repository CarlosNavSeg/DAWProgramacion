import java.util.Scanner;

public class ejemplo33 {
    public static void main(String[] args) {
        Scanner identificacion = new Scanner(System.in);

        char letrasdni [];
        letrasdni = new char [23];
        letrasdni[0] = 'T';
        letrasdni[1] = 'R';
        letrasdni[2] = 'W';
        letrasdni[3] = 'A';
        letrasdni[4] = 'G';
        letrasdni[5] = 'M';
        letrasdni[6] = 'Y';
        letrasdni[7] = 'F';
        letrasdni[8] = 'P';
        letrasdni[9] = 'D';
        letrasdni[10] = 'X';
        letrasdni[11] = 'B';
        letrasdni[12] = 'N';
        letrasdni[13] = 'J';
        letrasdni[14] = 'Z';
        letrasdni[15] = 'S';
        letrasdni[16] = 'Q';
        letrasdni[17] = 'V';
        letrasdni[18] = 'H';
        letrasdni[19] = 'L';
        letrasdni[20] = 'C';
        letrasdni[21] = 'K';
        letrasdni[22] = 'E';

        System.out.println("Introduce el DNI sin letra");
        int DNI = identificacion.nextInt();

        identificacion.close();

        int letraresultado = DNI%23;
        System.out.println("La letra del DNI es " + letrasdni[letraresultado]);


        }

       
    }

