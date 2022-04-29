package Tema5.BaseDeDatos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class BaseDeDatos {

    public static ArrayList<Usuario> usuarios = new ArrayList<>();

    public static Usuario login(String email, String password) throws IOException {
        String data = "";
        Usuario u1 = null;
        data = new String(
        Files.readAllBytes(Path.of("/home/vagrant/DAWProgramacion/ObjetosTuto/BaseDeDatos/registro.txt")));
        while(!data.isEmpty()) {
            String nextLine = "";
            if(data.indexOf("\n") != -1) {
            nextLine = data.substring(0, data.indexOf("\n"));
            }
            else {
                nextLine = data;
                data = "";
            }
            if (!nextLine.substring(0, nextLine.indexOf(" ")).equals(email)) {
                if(data.indexOf("\n") != -1){
                    data = data.substring(nextLine.length() + 1, data.length());
                }
                else {
                    data = "";
                }
            }
                else{
                if (nextLine.substring(nextLine.indexOf(" ") +1 , nextLine.length()).equals(password)) {
                    return u1 = new Usuario(email, password);
                } else {
                    return null;
                }
            }
        }
        return u1;
    }

    public static void create() {
        Scanner kdb = new Scanner(System.in);
        System.out.println("Email: ");
        String email;
        boolean emailCorrecto = false;
        boolean emailDuplicado = false;
        do {
            email = kdb.nextLine();
            if (email.contains("@")) {
                String comprobador = email.substring(email.indexOf("@"));
                if (comprobador.contains(".")) {
                    emailDuplicado = false;
                    String input = "";
                    try {
                        input = new String(Files.readAllBytes(
                        Path.of("/home/vagrant/DAWProgramacion/ObjetosTuto/BaseDeDatos/registro.txt")));
                        while (!input.isEmpty()) {
                            String nextLine = input.substring(0, input.indexOf("\n"));
                            if (nextLine.contains(email)) {
                                emailDuplicado = true;
                                input = "";
                            } else {
                                emailDuplicado = false;
                                input = "";
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if (!emailDuplicado) {

                        try {
                            FileWriter fw = new FileWriter(
                                    "/home/vagrant/DAWProgramacion/ObjetosTuto/BaseDeDatos/registro.txt", true);
                            System.out.println("Contraseña: ");
                            String password = kdb.nextLine();
                            Usuario u1 = new Usuario(email, password);
                            usuarios.add(u1);
                            emailCorrecto = true;
                            fw.write("\n" + email + " " + password);
                            fw.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                    else {
                        System.out.println("El email ya está siendo utilizado");
                    }
                }

            } else {
                System.out.println("Email incorrecto");
            }
        } while (!emailCorrecto);
        kdb.close();
    }

    public static void userRemoveEmailPattern(String dominio) {
       String input = "";
       String nextLine = "";
       String trimmed = "";
       try {
        input = new String(Files.readAllBytes(
            Path.of("/home/vagrant/DAWProgramacion/ObjetosTuto/BaseDeDatos/registro.txt")));
        PrintWriter pw = new PrintWriter("/home/vagrant/DAWProgramacion/ObjetosTuto/BaseDeDatos/registro.txt");
        String auxString = input;
        String nextLineDesdeDominio = "";
        while(!input.isEmpty() ) {
            if(auxString.indexOf("\n") != -1) {
                if(nextLine.length() == 0) {
                    nextLine = auxString.substring(0, auxString.indexOf("\n"));
                    nextLineDesdeDominio = nextLine.substring(nextLine.indexOf("@"), nextLine.indexOf(" "));
                }
                else {
                auxString = auxString.substring(nextLine.length()+1, auxString.length());
                if(auxString.indexOf("\n") != -1) {
                nextLine = auxString.substring(0, auxString.indexOf("\n"));
                nextLineDesdeDominio = nextLine.substring(nextLine.indexOf("@"),nextLine.indexOf(" "));
                }
                else {
                    nextLine = auxString;
                    if(!nextLine.isEmpty()) {
                    nextLineDesdeDominio = nextLine.substring(nextLine.indexOf("@"),nextLine.indexOf(" "));
                    }
                }
                }
            }
            else {
                nextLine = auxString;
                input = "";
            }
            if(nextLineDesdeDominio.equals(dominio) && !input.isEmpty()) {
                input = input.replace(nextLine, "");
                trimmed = input.trim();
            }
        }
        if(trimmed.isEmpty()) {
            pw.write(input);
        }
        else {
        pw.write(trimmed);
                input = "";
                pw.close();
        }
       }
       catch(IOException e) {

       }
    }

    public static void userRemove(String email) {
        String input = "";
        String nextLine = "";
        try {
         input = new String(Files.readAllBytes(
             Path.of("/home/vagrant/DAWProgramacion/ObjetosTuto/BaseDeDatos/registro.txt")));
         PrintWriter pw = new PrintWriter("/home/vagrant/DAWProgramacion/ObjetosTuto/BaseDeDatos/registro.txt");
         String auxString = input;
         while(!input.isEmpty() ) {
             if(auxString.indexOf("\n") != -1) {
                 if(nextLine.length() == 0) {
                     nextLine = auxString.substring(0, auxString.indexOf("\n"));
                 }
                 else {
                 auxString = auxString.substring(nextLine.length()+1, input.length());
                 nextLine = auxString.substring(0, input.indexOf("\n"));
                 }
             }
             else {
                 nextLine = input;
                 input = "";
             }
             if(nextLine.substring(0, nextLine.indexOf(" ")).equals(email)) {
                 String newInput = input.replaceFirst(nextLine, "");
                 String trimmed = newInput.trim();
                 pw.write(trimmed);
                 input = "";
                 pw.close();
             }
         }
        }
        catch(IOException e) {
 
        }
     }
 
}
