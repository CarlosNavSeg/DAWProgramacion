package ObjetosTuto.Reloj;

public class ClockDisplayTest {
    public static void main(String[] args) {
        ClockDisplay c1 = new ClockDisplay();
        c1.setTime(18, 59, 56);
        System.out.println(c1.getTime());
        c1.timeTick();
        c1.timeTick();
        c1.timeTick();
        c1.timeTick();
        System.out.println(c1.getTime());
    }
}
