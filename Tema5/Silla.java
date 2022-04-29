package Tema5;


import java.awt.Point;
import java.util.Random;

public class Silla {
    private int numeropatas;
    private boolean tieneRespaldo;
    private int nivelComodidad;
    private String material;
    private Point localizacion;
    private String color;

    Random rnd = new Random();

    public Silla(int numeropatas, boolean tieneRespaldo, int nivelComodidad, String material, Point localizacion, String color) {
        this.numeropatas = numeropatas;
        this.tieneRespaldo = tieneRespaldo;
        this.nivelComodidad = nivelComodidad;
        this.material = material;
        this.localizacion = localizacion;
        this.color = color;
    }

    public Silla() {
        numeropatas = rnd.nextInt(4);
        tieneRespaldo = rnd.nextBoolean();
        nivelComodidad = rnd.nextInt(10);
        material = Integer.toString(rnd.nextInt(20));
        localizacion = new Point(rnd.nextInt(10) , rnd.nextInt(10));
        color = Integer.toString(rnd.nextInt(22));
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
    public void setLocalizacion(int coord1, int coord2) {
        Point localizacion = new Point(coord1, coord2);
        this.localizacion = localizacion;
    }
    
}
