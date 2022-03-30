package Ficheros;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        File fEnt = new File("/home/vagrant/BMP-2D_IFV.bmp");
        TransformaImagen tImagen = new TransformaImagen(fEnt);
        tImagen.transformaNegativo();
    }
}
