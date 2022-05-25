import java.io.Serializable;

public class AgendaObject implements Serializable {
    public String nombre;
    public String email;
    public String apellidos;
    public String telefono;

    public AgendaObject(String nombre, String apellidos, String email, String telefono) {
        this.email = email;
        this.telefono = telefono;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return nombre + "\t" + apellidos + "\t" + email + "\t" + telefono;
    }
}
