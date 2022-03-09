package BaseDeDatos;

import java.io.FileWriter;
import java.io.IOException;
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

    public void userRemove(String email) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email)) {
                usuarios.remove(usuario);
            }
        }
    }

    public void userRemoveEmailPattern(String dominio) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().substring(usuario.getEmail().indexOf("@")).equals(dominio)) {
                usuarios.remove(usuario);
            }
        }

    }
}
