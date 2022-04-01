package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import javax.imageio.ImageIO;

import java.awt.Graphics2D;
import java.awt.*;
import java.awt.image.BufferedImage;

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
        File fOut = new File("/home/vagrant/fichero_n.bmp");
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

    public void transformaOscuro() throws IOException {
        FileReader freader = new FileReader(this.f);
        File fOut = new File("/home/vagrant/fichero_o.bmp");
        FileOutputStream wout = new FileOutputStream(fOut);
        int c;
        try{
            for (int i = 0; i < f.length(); i++) {
                c = freader.read();
                if(i > 53) {
                c = c/2;
                wout.write(c);                }
                else {
                    wout.write(c);
                }
            }

        }
        catch (FileNotFoundException e) {
            System.out.println("no hemos encontrado el fichero");
        }
        freader.close();
        wout.close();
    }
    public void transformaNegroBlanco() throws IOException {
        try {
        BufferedImage image = ImageIO.read(this.f);
        BufferedImage result = new BufferedImage(image.getHeight(),
        image.getWidth(),
        BufferedImage.TYPE_BYTE_BINARY);
        Graphics2D graphic = result.createGraphics();
            graphic.drawImage(image, 0, 0, Color.WHITE, null);
            graphic.dispose();
        File output = new File("/home/vagrant/fichero_nb.bmp");
        ImageIO.write(result, "png", output);
        }
        catch(IOException e) {
            e.printStackTrace();
        }
            
            
        
}
}
