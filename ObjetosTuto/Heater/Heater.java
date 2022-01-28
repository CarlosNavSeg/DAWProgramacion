package Heater;

public class Heater {
    // Atributos
    private double temperatura;
    private double max;
    private double min;
    private double increment;

    public Heater(double max, double min) {
        this.max = max;
        this.min = min;
        this.increment = 5.0;
        this.temperatura = 15.0;
    }

    // Métodos de objeto
    public void warmer() {

        if (this.temperatura + increment <= max) {
            this.temperatura += increment;
        } else {
            System.out.println("La temperatura máxima no puede ser superada.");
        }
    }

    public void cooler() {

        if (this.temperatura-increment >= min) {
            this.temperatura -= increment;
        }

        else {
            System.out.println("La temperatura mínima no puede ser reducida.");
        }
    }

    public double getTemperatura() {
        return this.temperatura;
    }
    public void setIncrement(double increment) {
        if(increment > 5.0) {
            System.out.println("El incremento solo puede estar entre 1.0 y 5.0");
        }
        else if(increment < 1.0) {
            System.out.println("El incremento solo puede estar entre 1.0 y 5.0");
        }
        else{
            this.increment = increment;
        }
    }
}
