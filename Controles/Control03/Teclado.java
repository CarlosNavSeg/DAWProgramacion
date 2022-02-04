package Control03;

public class Teclado {

    private String formato;
    private int numeroDeTeclas;
    private String conectividad;
    private String idioma;
    private static int contadorDeTeclados = 0;

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {

        if(formato == "Compacto" || formato == "Extendido") {
        this.formato = formato;
        }

        else {
            
        }
    }

    public int getNumeroDeTeclas() {
        return numeroDeTeclas;
    }

    public void setNumeroDeTeclas(final int numeroDeTeclas) {
        this.numeroDeTeclas = numeroDeTeclas;
    }

    public String getConectividad() {
        return conectividad;
    }

    public void setConectividad(final String conectividad) {
        this.conectividad = conectividad;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(final String idioma) {
        this.idioma = idioma;
    }

    public int getNumTeclados() {
        return contadorDeTeclados;
    }

    public Teclado() {
        contadorDeTeclados++;
    }
    
    public Teclado(String formato, int numeroDeTeclas, String conectividad, String idioma) {

        if(formato == "Compacto" || formato == "Extendido") {
            this.formato = formato;
        }
        else {
            
        }

        this.numeroDeTeclas = numeroDeTeclas;
        this.conectividad = conectividad;
        this.idioma = idioma;

        contadorDeTeclados++;
    }
}
