package ObjetosTuto.BaseDeDatos;

import java.util.ArrayList;

public class Usuario extends BaseDeDatos {
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

    public void addMedia(String nombre, String contenido) {
        Media m1 = new Media(id, nombre, contenido);
        m1.usuario_id = this.id;
        medias.add(m1);
    }
}
