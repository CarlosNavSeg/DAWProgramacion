package Tema6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
        FileInputStream fReader = new FileInputStream(this.f);
        File fOut = new File("/home/vagrant/fichero_n.bmp");
        FileOutputStream wOut = new FileOutputStream(fOut);
        byte [] cabecera = new byte[54];
        fReader.read(cabecera);
        wOut.write(cabecera);
        int c;
        for (int i = 0; i < f.length(); i++) {
            c = fReader.read();
            c = 255 - c;
            wOut.write(c);                
        }
        fReader.close();
        wOut.close();
    }

    public void transformaOscuro() throws IOException {
        FileInputStream freader = new FileInputStream(this.f);
        File fOut = new File("/home/vagrant/fichero_o.bmp");
        FileOutputStream wout = new FileOutputStream(fOut);
        int c;
        byte [] cabecera = new byte[54];
        freader.read(cabecera);
        wout.write(cabecera);
        try{
            for (int i = 0; i < f.length(); i++) {
                c = freader.read();
                wout.write((char) c/2);                
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
