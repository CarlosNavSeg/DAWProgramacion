package ObjetosTuto.MailItem;


/**
 * A class to model a simple email client. The client is run by a
 * particular user, and sends and retrieves mail via a particular server.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MailClient
{
    // The server used for sending and receiving.
    private MailServer server;
    // The user running this client.
    private String user;

    /**
     * Create a mail client run by user and attached to the given server.
     */
    public MailClient(MailServer server, String user)
    {
        this.server = server;
        this.user = user;
    }

    /**
     * Return the next mail item (if any) for this user.
     */
    public MailItem getNextMailItem()
    {
        return server.getNextMailItem(user);
    }

    /**
     * Print the next mail item (if any) for this user to the text 
     * terminal.
     */
    public void printNextMailItem()
    {
        MailItem item = server.getNextMailItem(user);
        if(item == null) {
            System.out.println("No new mail.");
        }
        else {
            item.print();
        }
    }
    
    public void sendMailitem(String to, String subject, String message) {
        String resto = "";

        if(to.indexOf(';') != -1) {
        resto = to.substring(to.indexOf(';') + 1, to.length());
        to = to.substring(0, resto.indexOf(';'));

        MailItem item = new MailItem(user, to, message, subject);
        server.post(item);
        } 

        else {
            MailItem item = new MailItem(user, to, message, subject);
            server.post(item);
            to = "";
        }

        while(!to.isEmpty()) {

        if(resto.indexOf(';') == -1) {
            MailItem item = new MailItem(user, resto, message, subject);
            server.post(item);
            to = "";
        }

        else{
        to = resto.substring(0, resto.indexOf(';'));
        resto = resto.substring(resto.indexOf(';')+1, resto.length());

        MailItem item = new MailItem(user, to, message, subject);
        server.post(item);
        }

        }
    }

    public void forwardLastMailItem(String forwardTo, MailServer server) {
        
        MailClient c1 = new MailClient(server, "Javier");

        MailItem lastItem = c1.getNextMailItem();

        c1.sendMailitem(forwardTo, lastItem.getAsunto(), lastItem.getMessage());

        System.out.print(lastItem.getFrom() + " reenvia el correo que le ha enviado a " + lastItem.getTo() + " a");

        if(forwardTo.indexOf(";") != -1) {
            String resto = forwardTo.substring(forwardTo.indexOf(";") + 1 , forwardTo.length());
            forwardTo = forwardTo.substring(0, forwardTo.indexOf(";"));           
            System.out.print(" " + forwardTo);
            while(resto.indexOf(";") != -1) {
                forwardTo = resto.substring(0, resto.indexOf(";"));
                resto = resto.substring(resto.indexOf(";") + 1, resto.length());
                System.out.print(" " + forwardTo);
            }

            System.out.print(" y " + resto);
            System.out.println("");
        }
        else {
            System.out.print(" " + forwardTo);

        }

        lastItem.print();

        
        
    }
}


