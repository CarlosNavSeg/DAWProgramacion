package BaseDeDatos;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

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

    @Override
    public String generateXML() throws IOException {
        File file = new File("parser.xml");
        PrintWriter pw = new PrintWriter(file);

        String resultado = "<" + id + ">" + " </" + id + ">\n" + "<" + nombre + ">" + "  " + " /<" + nombre + ">\n" + "<" + contenido + ">" + " /<" + contenido + ">\n"
        + "  " + "<" + tipo + ">" + "  " + " /<" + tipo + ">\n" + "<" + usuario_id + ">" + "    "
        + "/<" + usuario_id + ">\n";

        pw.write(resultado);
        pw.close();

        return resultado;
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
