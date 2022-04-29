package Tema5.MailItem;

public class MailItemTest {
    public static void main(String[] args) {
        MailServer server = new MailServer();
        MailClient cliente = new MailClient(server, "Carlos");
        cliente.sendMailitem("Javier;Marisa;JuanCa;Pepito", "Hola Chicos", "Que tal?");
        cliente.forwardLastMailItem("Jose;Pepe;PibeDale", server);
    }
}
