package TicketMachine;

public class TicketMachineTest {
    public static void main(String[] args) {
        TicketMachine t1 = new TicketMachine();
        t1.setPrice(5);
        t1.insertMoney(5);
        t1.printTicket();
        t1.empty();
    }   
}
