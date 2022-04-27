package Ficheros;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;

public class eliminarComentarios {
    public static void main(String a[]) {
    readComments("/home/vagrant/DAWPrg/DAWProgramacion/Ficheros/Test.java");
    }

    static String readComments(String fIn) {    

        File file = new File(fIn);    
        try {    
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));    
                String thisLine = "";
                String trimmedLine = "";
                ArrayList<String> nonCommentLines = new ArrayList<String>();
                do {
                thisLine = bufferedReader.readLine();
                trimmedLine = thisLine.trim();
                if(trimmedLine.contains("//")) {
                }
                else if(thisLine.isEmpty()) {
                    nonCommentLines.add("\n");
                }
                else {
                    nonCommentLines.add(thisLine);
                }
            } while (bufferedReader.ready());
            bufferedReader.close();
            File newFile = new File("/home/vagrant/DAWPrg/DAWProgramacion/Ficheros/TestSinComments.java");
            FileWriter fWriter = new FileWriter(newFile);
            for (String line : nonCommentLines) {
                if(line.equals("\n")) {
                    fWriter.append(line);
                }
                else {
                    fWriter.append(line + "\n");
                }
            }
            fWriter.close();
        }
        catch (IOException e) {    
            e.printStackTrace();    
        }    
        return("Hola");
    }

}
