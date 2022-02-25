package ObjetosTuto.BaseDeDatos;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseDeDatos {

    public static ArrayList<Usuario> usuarios = new ArrayList<>();

    public Usuario login(String email, String password) {

        for (Usuario u2 : usuarios) {
            String userEmail = u2.getEmail();
            String userPassword = u2.getPassword();
            if (email.equals(userEmail) && password.equals(userPassword)) {
                return u2;
            } else {
                System.out.println("Tus credenciales no coinciden con ningún Usuario" +
                        " de nuestra base de datos");
            }
        }
        return null;
    }

    public void create() {
        Scanner kdb = new Scanner(System.in);
        System.out.println("Email: ");
        String email;
        boolean emailCorrecto = false;
        do {
            email = kdb.nextLine();
            if (email.contains("@")) {
                String comprobador = email.substring(email.indexOf("@"));
                if (comprobador.contains(".")) {
                    boolean emailDuplicado = false;
                    for (Usuario u1: usuarios
                         ) {
                        if(!u1.getEmail().equals(email)) {
                        }
                        else {
                            emailDuplicado = true;
                            break;
                        }
                        }
                    if(!emailDuplicado) {
                        System.out.println("Contraseña: ");
                        String password = kdb.nextLine();
                        Usuario u1 = new Usuario(email, password);
                        usuarios.add(u1);
                        emailCorrecto = true;
                    }
                    else {
                        System.out.println("El email ya está siendo utilizado");
                    }
                }
            } else {
                System.out.println("Email incorrecto");
            }
        } while (!emailCorrecto);

    }

}


