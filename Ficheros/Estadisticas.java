package Ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Estadisticas {
    static File readFile(String filePath) {
        return new File(filePath);
    }
    public static void main(String[] args) throws IOException {
        try{
        BufferedReader bReader = new BufferedReader(new FileReader(readFile("/home/vagrant/Desktop/Path_TXTS/1.txt")));
        int numeroDePalabras = 0;
        int numeroDeFrases = 0;
        int numeroDeVocales = 0;
        int numeroDeConsonantes = 0;
        int numeroDeTabuladores = 0;
        int numeroDeLetras = 0;
        do {
            String nextLine = bReader.readLine();
            numeroDeLetras = numeroDeLetras + nextLine.length();
            numeroDeFrases++;
            for (int i = 0; i < nextLine.length(); i++) {
                
                if(nextLine.charAt(i) == 'e' || nextLine.charAt(i) == 'a' || nextLine.charAt(i) == 'o'
                || nextLine.charAt(i) == 'i' || nextLine.charAt(i) == 'u') {
                    numeroDeVocales++;
                }
                else if (nextLine.charAt(i) == ' ') {
                    numeroDePalabras++;
                }
                else if(nextLine.charAt(i) == '\n') {
                    numeroDeTabuladores++;
                }
                else {
                    numeroDeConsonantes++;
                }
            }
        } while(bReader.ready());

        System.out.println("Numero de palabras:"+ numeroDePalabras + " Porcentaje de consonantes: "+((numeroDeConsonantes*100)/numeroDeLetras)+
        " Porcentaje de vocales: "+((numeroDeVocales*100)/numeroDeLetras)+" Numero de frases: "+ 
        numeroDeFrases + " Porcentaje de espacios: "+((numeroDePalabras*100)/numeroDeLetras) + " Numero de tabuladores: " + numeroDeTabuladores);
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
