package Control03;

public class Ordenador {

    private String formato;
    private String color;
    private Teclado teclado;
    
    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        if(formato == "Sobremesa" || formato == "Portail") {
            this.formato = formato;
        }
        else {
            
        }
        
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public Teclado setTeclado(int numeroDeTeclas, String formato, String idioma, String conectividad) {

        return new Teclado(formato, numeroDeTeclas, conectividad, idioma);
        
    }

   

    public Ordenador() {

    }

    public Ordenador(String formato,String color, Teclado teclado) {

        if(formato == "Sobremesa" || formato == "Portatil") {
            this.formato = formato;
        }
        else {

        }
        this.color = color;
        this.teclado = teclado;

    }

    public void Conectar(Ordenador o1) {

        Ordenador conectado = new Ordenador();
        conectado.setColor(o1.color);
        conectado.setFormato(o1.formato);
        conectado.teclado = o1.getTeclado();
        //Conectado puede leer los atributos de un ordenador, ya que es un reflejo de él.

    }
}
