package BaseDeDatos;

import java.io.IOException;

public class BaseTest {
    public static void main(String[] args) throws IOException {
    Usuario u1 = BaseDeDatos.login("yoquierousartunngle@gmail.com", "chispa");
    System.out.println(u1.getEmail());
    }
}
