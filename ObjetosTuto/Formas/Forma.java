package Formas;
import java.awt.Point;

public class Forma {

    private String color;
    private Point coordenadas;
    private String forma;
    public int x;
    public Forma(String color, String forma, int x, int y) {
        this.color = color;
        this.forma = forma;
        coordenadas = new Point(x, y);
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setPoint(int x, int y) {
        coordenadas = new Point(x, y);
    }

    public String imprimir() {
        return "Forma [color=" + color + ", coordenadas=" + coordenadas + ", forma=" + forma + "]";
    }
    
    
}