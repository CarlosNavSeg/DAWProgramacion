package Tema5.BaseDeDatos;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Usuario implements parserXML {
    protected int id = 0;
    protected String email;
    protected String password;
    public static  ArrayList<Media> medias = new ArrayList<>();

    public Usuario(String email, String password) {
        this.id = id++;
        this.email = email;
        this.password = password;
    }


    public Usuario() {

    }
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    
    public int getId() {
        return id;
    }


    public void addMedia(String nombre, String contenido, String tipo) {
        int usuario_id = this.id;
        Media m1 = new Media(id, nombre, contenido, tipo, usuario_id);
        m1.usuario_id = this.id;
        medias.add(m1);
    }
    public void removeMedia(String nombre) {
        for (Media media:
             medias) {
            if (media.getNombre().equals(nombre)) {
                medias.remove(media);
            }
        }
    }

    @Override
    public String generateXMLInterface() throws IOException {
        File file = new File("/home/vagrant/DAWProgramacion/ObjetosTuto/BaseDeDatos/Usuarios/" + email + ".xml");
        PrintWriter pw = new PrintWriter(file);

        String resultado = "<" + id + ">" + " </" + id + ">\n" + "    " + "<" + email + ">" + "  " + " /<" + email + ">\n"
        + "  " + "<" + password + ">" + "  " + " /<" + password + ">\n";

        pw.write(resultado);
        pw.close();

        return resultado;
    }

    /*public String generateXML() throws IOException {
        File file = new File(email + ".xml");
        PrintWriter pw = new PrintWriter(file);

        String resultado = "<" + id + ">" + " </" + id + ">\n" + "    " + "<" + email + ">" + "  " + " /<" + email + ">\n"
        + "  " + "<" + password + ">" + "  " + " /<" + password + ">\n";

        pw.write(resultado);
        pw.close();

        return resultado;
    }*/

    public void removeMediaType(String tipo) {
        for (Media media:
                medias) {
            if(media.getTipo().equals(tipo)) {
                medias.remove(media);
            }
        }
    }
}
