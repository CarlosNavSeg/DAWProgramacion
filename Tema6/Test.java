package Tema6;
import java.io.File;
import java.io.IOException;
public class Test {
    public static void main(String[] args) throws IOException {
        //F
        TransformaImagen tImagen = new TransformaImagen(new File("/home/vagrant/images.bmp"));
        //G
        tImagen.transformaNegativo();
        //H
        tImagen.transformaNegroBlanco();
        //I
        tImagen.transformaOscuro();
    }
}
