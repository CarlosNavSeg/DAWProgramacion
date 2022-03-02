package ObjetosTuto.BaseDeDatos;

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

    public void addMedia(String nombre, String contenido, String tipo) {
        Media m1 = new Media(id, nombre, contenido, tipo);
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

    public String generateXML() {
        return "<" + id + ">" + " </" + id + ">" + "    " + "<" + email + ">" + "  " + " /<" + email + ">"
                + "  " + "<" + password + ">" + "  " + " /<" + password + ">";
    }
    public void removeMediaType(String tipo) {
        for (Media media:
                medias) {
            if(media.getTipo().equals(tipo)) {
                medias.remove(media);
            }
        }
    }
}
