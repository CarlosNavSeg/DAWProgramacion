package ObjetosTuto.BaseDeDatos;
public class Media extends Usuario {
    private int id;
    private String nombre;
    private String contenido;
    private String tipo;
    protected int usuario_id;


    public Media (int id, String nombre, String contenido) {
        this.id = id++;
        this.nombre = nombre;
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Media{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", contenido='" + contenido + '\'' +
                ", tipo='" + tipo + '\'' +
                ", usuario_id=" + usuario_id +
                '}';
    }
}
