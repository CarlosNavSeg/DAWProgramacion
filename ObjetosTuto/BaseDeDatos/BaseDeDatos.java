package BaseDeDatos;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class BaseDeDatos  {

    public static Path filePath = Paths.get("/home/vagrant/DAWProgramacion/ObjetosTuto/BaseDeDatos/registro.txt");
    public static ArrayList<Usuario> usuarios = new ArrayList<>();

    public static Usuario login(String email, String password) throws IOException {
        Scanner sn = new Scanner(filePath);
        Usuario u1 = null;
        while (sn.hasNext()) {
            String nextLine = sn.nextLine();
            if(nextLine.contains(email) && nextLine.contains(password)) {
                sn.close();
                return u1 = new Usuario(email, password);
            }           
        }
        sn.close();
        return u1;
    }

    public static void create() {
        Scanner kdb = new Scanner(System.in);
        System.out.println("Email: ");
        String email;
        boolean emailCorrecto = false;
        try {
        PrintWriter pw = new PrintWriter("/home/vagrant/DAWProgramacion/ObjetosTuto/BaseDeDatos/registro.txt");
        do {
            email = kdb.nextLine();
            if (email.contains("@")) {
                String comprobador = email.substring(email.indexOf("@"));
                if (comprobador.contains(".")) {
                    boolean emailDuplicado = false;
                    Scanner sn = new Scanner(filePath);
                    while(sn.hasNext()) {
                        String nextLine = sn.nextLine();
                        if(nextLine.contains(email)) {
                            emailDuplicado = true;
                        }
                        else {
                            emailDuplicado = false;
                        }
                    }
                    sn.close();
                    if(!emailDuplicado) {
                        System.out.println("Contraseña: ");
                        String password = kdb.nextLine();
                        Usuario u1 = new Usuario(email, password);
                        usuarios.add(u1);
                        emailCorrecto = true;
                        pw.write(u1.email + " " + u1.password);
                        pw.close();
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
    catch (IOException e) {
        System.out.println("Error");
    }
    }
    public void userRemove(String email) {
        for (Usuario usuario:
             usuarios) {
            if(usuario.getEmail().equals(email)) {
                usuarios.remove(usuario);
            }
        }
    }
    public void userRemoveEmailPattern(String dominio)  {
        for (Usuario usuario:
             usuarios) {
            if(usuario.getEmail().substring(usuario.getEmail().indexOf("@")).equals(dominio)) {
                usuarios.remove(usuario);
            }
            }
            
        }
    }





