import java.util.Scanner;

public class ejemplo34 {
    public static void main(String[] args) {
        Scanner identificacion = new Scanner(System.in);
        char letrasdni [];
        char letracontrol;
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

        System.out.println("Introduzca la fecha de origen de su NIE");
        int digitocontrol = identificacion.nextInt();

        if (digitocontrol<2008) {
            letracontrol = 'X';
        }
        else {
            letracontrol = 'Y';
        }

        System.out.println("Introduzca la parte númerica de su NIE");
        int nie = identificacion.nextInt();

        System.out.println("El NIE a partir del cual calcularemos es: " +letracontrol+ nie);

        if (letracontrol == 'X') {
            int letraresultado = nie%23;
            System.out.println("El NIE calculado es: " + nie + letrasdni[letraresultado]);
        }
        else if (letracontrol == 'Y') {
            nie = 10000000 + nie;
            int letraresultado = nie%23;
            nie = nie - 10000000;
            System.out.println("El NIE calculado es: Y" + nie + letrasdni[letraresultado]);
        }
    }
}
