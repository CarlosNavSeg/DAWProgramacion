package Ficheros;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        TransformaImagen tImagen = new TransformaImagen(new File("/home/vagrant/images.bmp"));
        tImagen.transformaNegativo();
        tImagen.transformaNegroBlanco();
        tImagen.transformaOscuro();
    }
}
