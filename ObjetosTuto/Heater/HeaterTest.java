package Heater;

public class HeaterTest {
    public static void main(String[] args) {
        
    
    /*Post-primer apartadp
    heater h1 = new Heater();
    System.out.println(getTemperatura());
    h1.warmer();
    System.out.println(getTemperatura());
    Probado
    */
    /*
    Post segundo apartado
    Heater h1 = new Heater(40.0, 15.0);
    System.out.println(h1.getTemperatura());
    h1.warmer();
    System.out.println(h1.getTemperatura());
    Probado
    */

    /*
    Post tercer apartado
    Heater h3 = new Heater(40.0, 15.0);
    System.out.println(h3.getTemperatura());
    h3.cooler();
    h3.warmer();
    h3.warmer();
    h3.warmer();
    h3.warmer();
    h3.warmer();
    h3.warmer();
    h3.cooler();
    System.out.println(h3.getTemperatura());
    Probado
    */

    Heater h3 = new Heater(40.0, 15.0);
    System.out.println(h3.getTemperatura());
    h3.cooler();
    h3.warmer();
    h3.warmer();
    h3.warmer();
    h3.warmer();
    h3.warmer();
    System.out.println(h3.getTemperatura());
    h3.warmer();
    h3.cooler();
    System.out.println(h3.getTemperatura());
    h3.setIncrement(0.0);
    h3.setIncrement(4.0);
    h3.warmer();
    System.out.println(h3.getTemperatura());
    }
}
