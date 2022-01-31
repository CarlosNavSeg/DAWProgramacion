package MailItem;

public class MailItemTest {
    public static void main(String[] args) {
        MailServer server1 = new MailServer();
        MailItem mail1 = new MailItem("Carlos", "Javier", "Hola Javier, qué tal?", "Saludo ejemplo");
        server1.post(mail1);
        mail1.print();
        MailItem mail2 = server1.getNextMailItem("Javier");
        mail2.print();
    }
}
