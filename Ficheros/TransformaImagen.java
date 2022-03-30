package Ficheros;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class TransformaImagen {
    File f = null;
    public TransformaImagen(File fEnt) {        
        if(!fEnt.getName().substring(fEnt.getName().indexOf(".")).equals(".bmp")) {
                
        }
        else {
            f = fEnt;
        }
    }

    public void transformaNegativo() throws IOException {
        FileReader fReader = new FileReader(this.f);
        File fOut = new File("/home/vagrant/n_file.bmp");
        FileOutputStream wOut = new FileOutputStream(fOut);
        int c = fReader.read();
        while(c != -1) {
            c = c-255;
            wOut.write(c);
            c = fReader.read();
        }
        fReader.close();
        wOut.close();
    }
}
