import java.util.ArrayList;
//import java.util.Random;
//import java.awt.Point;

public class sillaTest {
    public static void main(String[] args) {
        //Random rnd = new Random();
        ArrayList<Silla> sillasRandom = new ArrayList<Silla>(100);

        /*
        for (int i = 0; i < 100; i++) {
            int numeropatas = rnd.nextInt(4);
            boolean tieneRespaldo = rnd.nextBoolean();
            int nivelComodidad = rnd.nextInt(10);
            String material = Integer.toString(rnd.nextInt(10));
            Point localizacion = new Point(rnd.nextInt(10), rnd.nextInt(10));
            String color = Integer.toString(rnd.nextInt(10));
            Silla sillaType = new Silla(numeropatas, tieneRespaldo, nivelComodidad, material, localizacion, color);
            sillasRandom.add(i, sillaType);

        }
        */
        for (int i = 0; i < 100; i++) {
            sillasRandom.add(i, new Silla());
        }
        
        for (int i = 0; i < 10; i++) {
            Silla sillaDisplay = sillasRandom.get(i);
            System.out.println((sillaDisplay.getColor()));
            
           
        }
    }

}
