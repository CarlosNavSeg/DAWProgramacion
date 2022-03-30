package Ficheros;

import java.io.File;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        DateFormat formatter;
        Scanner opcionesUsuario = new Scanner(System.in);
        File dFile = File.listRoots()[0];
        while (dFile.exists()) {
            System.out.println(dFile.getAbsolutePath());
            if (dFile.canRead()) {
                for (int i = 0; i < dFile.listFiles().length; i++) {
                    File nextDir = dFile.listFiles()[i];
                    if (nextDir.isDirectory()) {
                        String flags = "";
                        if (nextDir.canWrite()) {
                            flags += ("w");
                        } else {
                            flags += ("-");
                        }
                        if (nextDir.canRead()) {
                            flags += ("r");
                        } else {
                            flags += ("-");
                        }
                        if (nextDir.canExecute()) {
                            flags += ("x");
                        } else {
                            flags += ("-");
                        }
                        formatter = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM,
                        Locale.getDefault());
                        System.out.println(i + ".- \t" + flags + "\t" +
                        String.format("%-15d", nextDir.length()) + formatter.format(nextDir.lastModified())
                        + "\t" + nextDir.getName());
                    }
                    if (nextDir.isFile()) {
                        String flags = "";
                        if (nextDir.canWrite()) {
                            flags += ("w");
                        } else {
                            flags += ("-");
                        }
                        if (nextDir.canRead()) {
                            flags += ("r");
                        } else {
                            flags += ("-");
                        }
                        if (nextDir.canExecute()) {
                            flags += ("x");
                        } else {
                            flags += ("-");
                        }
                        formatter = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM,
                                Locale.getDefault());

                        // ....

                        System.out.println(i + ".- \t" + flags + "\t" + String.format("%-15d", nextDir.length())
                        + formatter.format(nextDir.lastModified()) + "\t" + nextDir.getName());
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
        opcionesUsuario.close();
    }
}
