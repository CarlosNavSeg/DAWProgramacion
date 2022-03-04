
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class macrosBDD {
    public static void main(String[] args) throws IOException {
        File macros = new File("macros.txt");
        PrintWriter myWriter = new PrintWriter(macros);

        String[] fraseCorregir = { "B10028B 	CruzamientoBjcSerieOlimpia 	4.38 	2 	1 	BjcOlimpia",
                "B10200B 	CruzamientoBjcOlimpiaConVisor 	0.88 	29 		BjcOlimpia",
                "B10200B CartuchoFusibleLegrandT2250A 	5.89 	1 	1 	Legrand",
                "L16555 	CartuchoFusibleLegrandT2315A 	5.89 	3 	3 	Legrand",
                "IM2P10L 	InterruptorMagnetotermico  2p, 4 	14.84 	2 	1 	IntMagn",
                "B10200B BaseTtLateralNiessenTrazoBla 	4.38 	6 	6 	Niessen" };

        for (int i = 0; i < fraseCorregir.length; i++) {
            myWriter.write(fraseCorregir[i]);
        }

        String fraseCorrecta = "";
        String comilla = "'";
        int contadorSeguimiento = 0;
        

        while (contadorSeguimiento < 6) {
            String lString = fraseCorregir[contadorSeguimiento];
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
            contadorSeguimiento++;
            fraseCorrecta += "\n(";

        }
        myWriter.write(fraseCorrecta);
        myWriter.close();
    }

}
