package Book;

import java.util.Scanner;

/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber = "";
    private int borrowed = 0;
    private boolean courseText;

    public int getBorrowed() {
        return borrowed;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void isCourseText(boolean courseText) {
        this.courseText = courseText;
    }

   

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        bookPages = pages;
        courseText = true;
    }

    // Add the methods here ...
    public void printAuthor() {
        System.out.println("El autor es: " + author);
    }
    public void printTitle() {
        System.out.println("El titulo es: " + title);
    }
    public void setRefNumber(String ref) {
        System.out.println("Introduzca el numero de referencia.");

        Scanner kdb = new Scanner(System.in);
        ref = kdb.next();

        kdb.close();

        if(ref.length() <= 3) {
            System.out.println("Error, el número de referencia es incorrecto.");
        }
        else {
            refNumber = ref;
        }
    }
    public void borrow() {
        borrowed++;
    }

    public void printDetails(Book specificBook) {
        System.out.println("Title: " + specificBook.title);
        System.out.println("Autor: " + specificBook.author);
        System.out.println("Pages: " + specificBook.pages);
        System.out.println("Numero de referencia: "+ specificBook.refNumber);
        System.out.println("Prestado " + specificBook.borrowed + " veces.");
        System.out.println("Es de algun curso "+ specificBook.courseText);
    }
}