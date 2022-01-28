package Reloj;

public class ClockDisplayTest {
    public static void main(String[] args) {
        ClockDisplay c1 = new ClockDisplay();
        c1.setTime(18, 39, 56);
        System.out.println(c1.getTime());
        c1.timeTick();
    }
}
