import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.jar.Attributes.Name;
import java.awt.Point;

public class sillaTest {
    public static void main(String[] args) {
        Point localizable = new Point(0,8);
        Random rnd = new Random();
        ArrayList sillasRandom = new ArrayList<>(100);

        for (int i = 0; i < 100; i++) {
            int numeropatas = rnd.nextInt(4);
            boolean tieneRespaldo = rnd.nextBoolean();
            int nivelComodidad = rnd.nextInt(10);
            String material = Integer.toString(rnd.nextInt());
            Point localizacion = new Point(rnd.nextInt(10), rnd.nextInt(10));
            String color = Integer.toString(rnd.nextInt());
            Silla sillaType = new Silla(numeropatas, tieneRespaldo, nivelComodidad, material, localizacion, color);
            sillasRandom.add(i, sillaType);

        }
        
        for (int i = 0; i < 10; i++) {
            Silla sillaDisplay = (Silla) sillasRandom.get(i);
            System.out.println((sillaDisplay.getColor()));
            
           
        }
    }

}
