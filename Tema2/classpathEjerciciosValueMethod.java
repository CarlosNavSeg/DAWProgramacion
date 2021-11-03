
import java.util.Scanner;
import java.lang.Math;

public class classpathEjerciciosValueMethod {

    public static boolean esDivisible(int n, int m) {
        int resultado = n % m;

        if (resultado == 0) {
            return true;
        }
        return false;
    }

    public static boolean esTriangulo(int ladoa, int ladob, int ladoc) {
        if (ladoa < ladob + ladoc) {
            return true;
        } else if (ladob < ladoa + ladoc) {
            return true;
        } else if (ladoc < ladob + ladoa) {
            return true;
        }

        return false;
    }

    public static double Potencia(double valorAElevar, int exponente) {
        double resultado = Math.pow(valorAElevar, exponente);
        return resultado;
    }

    public static int positivos(int[] cantidadDePositivos) {

        int contador = 0;

        for (int i = 0; i < cantidadDePositivos.length; i++) {
            if (cantidadDePositivos[i] < 0) {
                contador--;
            }

            contador++;

        }

        return contador;
    }

    public static String letraDNI(int numericaDNI) {
        char[] letrasdni = new char[23];
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

        int letraresultadoPos = numericaDNI % 23;

        String convertido = Integer.toString(numericaDNI);

        String letraResultado = Character.toString(letrasdni[letraresultadoPos]);

        String DNICompleto = convertido.concat(letraResultado);

        return DNICompleto;
    }

    public static boolean esPrimo(double numeroacomprobar) {

        int divisores = 0;

        for (int i = 2; i < numeroacomprobar / 2; i++) {
            if (numeroacomprobar % i == 0) {
                divisores++;
            }
        }
        if (divisores == 0) {
            return true;
        }
        return false;
    }

    public static void primosDe3A100() {
        for (int i = 3; i <= 100; i++) {

            if (esPrimo(i) == true && i != 4) {

                System.out.println(i);
            }

        }
    }

    public static void Mayor(int edad) {
        if (edad >= 18) {
            System.out.println("Mayor de edad");
        }
    }

    public static void OrdenAscendente(int valor1, int valor2) {
        if (valor1 > valor2) {
            System.out.println(valor1 + "," + valor2);
        } else {
            System.out.println(valor2 + "," + valor1);
        }
    }

    public static void rangoDeNotas(double notaAMapear) {
        if (notaAMapear < 0 || notaAMapear > 10) {
            System.out.println("La nota es inválida");
        }

        else if (notaAMapear > 0 && notaAMapear <= 3) {
            System.out.println("La nota es muy deficiente");
        }

        else if (notaAMapear >= 3 && notaAMapear < 5) {
            System.out.println("La nota es insuficiente");
        }

        else if (notaAMapear >= 5 && notaAMapear < 6) {
            System.out.println("La nota es suficiente");
        } else if (notaAMapear >= 6 && notaAMapear < 7) {
            System.out.println("La nota es bien");
        } else if ((notaAMapear >= 7) && (notaAMapear < 9)) {
            System.out.println("La nota es notable");
        } else if (notaAMapear >= 9 && notaAMapear <= 10) {
            System.out.println("La nota es sobresaliente");
        }
    }

    public static void positivos() {
        Scanner numeros = new Scanner(System.in);

        int contador = 0;

        System.out.println("Introduce 10 números");

        for (int i = 0; i < 10; i++) {
            double pregunta = numeros.nextDouble();
            if (pregunta > 0) {
                contador++;
            }

        }
        System.out.println("Hay:" + contador + "numeros positivos");

        numeros.close();
    }

    public static void MayorDeTres() {
        Scanner valoresdeUsuario = new Scanner(System.in);

        int[] numeros;
        numeros = new int[3];

        int numeromayor = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = valoresdeUsuario.nextInt();
        }


        System.out.println(numeromayor);

        valoresdeUsuario.close();

    }

    public static void main(String[] args) {
        // Scanner valoresDeUsuario = new Scanner(System.in);

        // int n = 2;
        // int m = 5;
        // System.out.println(esDivisible(n, m));

        // int ladoa = valoresDeUsuario.nextInt();
        // int ladob = valoresDeUsuario.nextInt();
        // int ladoc = valoresDeUsuario.nextInt();
        // System.out.println(esTriangulo(ladoa, ladob, ladoc));ç

        // System.out.println(Potencia (2.0 , 2));

        // int [] arrayPositivos = new int[3];
        // System.out.println(positivos(arrayPositivos));

        // System.out.println(letraDNI(12345678));

        // System.out.println(esPrimo(18));

        // primosDe3A100();

        // Mayor(18);

        // OrdenAscendente(2, 5);

        // rangoDeNotas(8.0);

       //MayorDeTres();

        // valoresDeUsuario.close();

    }
}
