package Ficheros;

import java.io.File;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner opcionesUsuario = new Scanner(System.in);
        File dFile = File.listRoots()[0];
        while (dFile.exists()) {
            System.out.println(dFile.getAbsolutePath());
            if (dFile.canRead()) {
                for (int i = 0; i < dFile.listFiles().length; i++) {
                    File nextDir = dFile.listFiles()[i];
                    if (nextDir.isDirectory()) {
                        System.out.println(i + " - <directorio> - " + nextDir.getAbsolutePath());
                    }
                    if (nextDir.isFile()) {
                        System.out.println(i + " - " + nextDir.getName() + " " + nextDir.length());
                    }
                }
            }

            String opcion = "";
            switch (opcion = opcionesUsuario.next()) {
                case "1":
                    dFile = new File("");
                    break;
                case "0":
                    dFile = File.listRoots()[0];
                    break;
                default:
                    dFile = File.listRoots()[0].listFiles()[Integer.parseInt(opcion)];
                    break;
            }
        }

    }
}
