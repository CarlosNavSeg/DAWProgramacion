
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class macrosBDD {
    public static void main(String[] args) throws IOException {
        File macros = new File("macros.txt");
        Scanner fileReader = new Scanner(macros);
        PrintWriter myWriter = new PrintWriter(macros);


        String fraseCorrecta = "";
        String comilla = "'";
        

        while (fileReader.hasNext()) {
            String lString = fileReader.nextLine();
            String palabra = "";

            while (lString.indexOf(" ") != -1) {

                lString = lString.trim();
                if (lString.indexOf(" ") != -1) {
                    palabra = lString.substring(0, lString.indexOf(" "));
                    lString = lString.substring(palabra.length(), lString.length());
                    palabra = comilla + palabra + comilla;
                    fraseCorrecta += palabra += ", ";
                } else {
                    palabra = lString;
                    palabra = comilla + palabra + comilla;
                    fraseCorrecta += palabra;
                }

            }
            fraseCorrecta += ")" + ",";
            fraseCorrecta += "\n(";

        }
        myWriter.write(fraseCorrecta);
        myWriter.close();
        fileReader.close();
    }

}
