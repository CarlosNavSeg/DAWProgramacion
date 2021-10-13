import java.util.Scanner;

public class ejemplo18 {
    public static void main(String[] args) {
        Scanner reloj = new Scanner(System.in);
        //Método 1
        System.out.println("Introduce la hora (usa dos dígitos)");
        byte hora = reloj.nextByte();
        
        if (hora >=0 && hora<24) {
            System.out.println("Introduce los minutos (usa dos digítos)");
            byte minutos = reloj.nextByte();
            
            if (minutos >= 0 && minutos < 60) {
                    System.out.println("Introduce los segundos (usa dos dígitos)");
                    byte segundos = reloj.nextByte();
                    
                    if (segundos >= 0 && segundos < 60) {
                    System.out.println(hora + ":" + minutos + ":" + (segundos+1));
                    }
                    else {
                        System.out.println("Formato incorrecto");
                    }
                    
            }
            else {
                    System.out.println("Formato incorrecto");
            }
        }

        else {
            System.out.println("Formato incorrecto");
        }

        reloj.close();        
    }
}
