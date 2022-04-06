package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class textos {
    public static void main(String[] args) throws IOException {
        String lString = "";
        String lString2 = "";
        String resultado = "";
        File fOut = new File("/home/vagrant/Desktop/Path_TXTS/FResultado.txt");
        FileWriter fWriter = new FileWriter(fOut);
        try{
        
        String fReader = new String(Files.readAllBytes(Path.of(args[0])));
        String fReader2 = new String(Files.readAllBytes(Path.of(args[1])));
        while(fReader.indexOf("\n") != -1) {
            if(fReader.indexOf("\n") != -1) {
            lString = fReader.substring(0, fReader.indexOf("\n"));
            lString2 = fReader2.substring(0 , fReader2.indexOf("\n"));
            }
            else {
                resultado += ("\n" + fReader);
                fReader = "";
            }
            resultado += ("\n" + lString);
            resultado += ("\n" + lString2);
            fReader = fReader.substring(lString.length() + 1, fReader.length());
            fReader2 = fReader2.substring(lString2.length() +1, fReader2.length());
        }
        resultado = resultado.substring(0, resultado.lastIndexOf("\n") -1);
        resultado += ("\n" + lString2);
        while(fReader2.indexOf("\n") != -1) {
            lString2 = fReader2.substring(0 , fReader2.indexOf("\n"));           
            resultado += ("\n" + lString2);
            fReader2 = fReader2.substring(lString2.length() +1, fReader2.length());
        }
        resultado = resultado.trim();
        resultado += ("\n" + lString2);
        fWriter.write(resultado);
        fWriter.close();
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
   
}
