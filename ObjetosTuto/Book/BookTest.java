package ObjetosTuto.Book;

public class BookTest {
    public static void main(String[] args) {
        Book elQuijote = new Book("Desconocido", "Don Quijote de la Mancha", 673);
        elQuijote.setRefNumber("B12321634");
        elQuijote.borrow();
        elQuijote.printDetails();
    }
}
