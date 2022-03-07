package BaseDeDatos;

import java.io.IOException;

public class BaseTest {
    public static void main(String[] args) throws IOException {
        Media m1 = new Media(0, "Pepito", "imagen", "tipo", 0);
        m1.generateXMLInterface();
        BaseDeDatos b1 = new BaseDeDatos();
        b1.create();
        Usuario u1 = b1.usuarios.get(0);
        u1.generateXMLInterface();
    }
}
