package Tema5.Formas;

public class Rectangulo extends Forma {

    private double ladoMenor;
    private double ladoMayor;

    public Rectangulo(String color, String forma, int x, int y, double ladoMenor, double ladoMayor) {
        super(color, forma, x, y);
        this.ladoMenor = ladoMenor;
        this.ladoMayor = ladoMayor;
    }

    public double calcularArea() {
        return ladoMayor*ladoMenor;
    }

    public double calcularPerimetro() {
        return 2 * ladoMenor + 2 * ladoMayor;
    }

    public void Escalar(double factorDeEscala) {
       ladoMayor = ladoMayor*factorDeEscala;
       ladoMenor = ladoMenor*factorDeEscala;
    }
}
