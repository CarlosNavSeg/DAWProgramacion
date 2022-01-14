import java.awt.Point;

public class silla {
    private int numeropatas;
    private boolean tieneRespaldo;
    private int nivelComodidad;
    private String material;
    private Point localizacion;
    private String color;

    public silla(int numeropatas, boolean tieneRespaldo, int nivelComodidad, String matieral, Point localizacion, String color) {

    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getNumeropatas() {
        return numeropatas;
    }
    public void setNumeropatas(int numeropatas) {
        this.numeropatas = numeropatas;
    }
    public boolean isTieneRespaldo() {
        return tieneRespaldo;
    }
    public void setTieneRespaldo(boolean tieneRespaldo) {
        this.tieneRespaldo = tieneRespaldo;
    }
    public int getNivelComodidad() {
        return nivelComodidad;
    }
    public void setNivelComodidad(int nivelComodidad) {
        this.nivelComodidad = nivelComodidad;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public Point getLocalizacion() {
        return localizacion;
    }
    public void setLocalizacion(Point localizacion) {
        this.localizacion = localizacion;
    }
    
}
