package Formas;

public class Elipse extends Forma {
    private double radioMayor;
    private double radioMenor;

    public Elipse(String color, String forma, int x, int y, double radioMayor, double radioMenor) {
        super(color, forma, x, y);
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }

    public double calcularArea() {
        return Math.PI*(radioMayor*radioMenor);
    }
    
}
