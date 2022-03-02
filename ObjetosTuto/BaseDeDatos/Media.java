package ObjetosTuto.BaseDeDatos;
public class Media implements parserXML{
    private int id;
    private String nombre;
    private String contenido;
    private String tipo;
    protected int usuario_id;

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public Media (int id, String nombre, String contenido, String tipo) {
        this.id = id++;
        this.nombre = nombre;
        this.contenido = contenido;
    }

    public String generateXML() {
        return "<" + id + ">" + " </" + id + ">" + "    " + "<" + nombre + ">" + "  " + " /<" + nombre + ">" + "<" + contenido + ">" + " /<" + contenido + ">"
                + "  " + "<" + tipo + ">" + "  " + " /<" + tipo + ">" + " " + "<" + usuario_id + ">" + "    "
                + "/<" + usuario_id + ">";
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
