import java.util.Scanner;

public class ejemplo18 {
    public static void main(String[] args) {
        Scanner reloj = new Scanner(System.in);
        //Método 1
        System.out.println("Introduce la hora (usa dos dígitos)");
        byte hora = reloj.nextByte();

        System.out.println("Introduce los minutos (usa dos dígitos)");
        byte minutos = reloj.nextByte();

        System.out.println("Introduce los segundos(usa dos dígitos)");
        byte segundos = reloj.nextByte();

        reloj.close();
        
        System.out.println(hora + ":" + minutos + ":" + (segundos+1));
        


    }
}
