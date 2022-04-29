
Programación Orientada a Objetos
book-exercise
En este proyecto, realiza las siguientes modificaciones:
1. Añade dos métodos a la clase, getAuthor y getTitle, que devuelvan como resultado
los campos author y title, respectivamente, para saber cuál es el autor y el título
del libro.
2. Añade dos métodos a la clase, printAuthor y printTitle. Estos métodos deben
imprimir los campos author y title respectivamente, en la ventana del terminal.
3. Añade un campo, pages, a la clase Book para almacenar el número de páginas del
libro. Deberá ser de tipo int, y su valor inicial debe pasarse al único constructor
existente, junto con las cadenas correspondientes a author y title. Incluye además
un selector getPages apropiado para este campo.
4. Añade un campo adicional, refNumber, a la clase Book, Este campo podrá
almacenar un número de referencia para la biblioteca. Tiene que ser de tipo
String y hay que inicializarlo con la cadena de caracteres de longitud cero (“”) en
el constructor, ya que su valor inicial no se pasa mediante ningún parámetro del
mismo. En lugar de ello, define un mutador para ese campo con la siguiente
cabecera:
public void setRefNumber(String ref)
El cuerpo de este mutador debe asignar el valor al campo refNumber, pero sólo si
la referencia tiene más de tres caracteres; en caso contrario, debe imprimir un
mensaje de error y no modificar el campo. Añade el correspondiente método
selector getRefNumber para poder comprobar fácilmente que el mutador
funciona correctamente.
5. Añade un campo entero adicional, borrowed, a la clase Book. Este campo llevará
la cuenta de las veces que se ha prestado un libro. Añade un mutador, borrow, a la
clase. Este método debe incrementar el campo en una unidad cada vez que sea
invocado. Incluye un selector, getBorrowed, que devuelva como resultado el valor
de este nuevo campo.
6. Añade un nuevo campo de tipo boolean, courseText, para indicar si el libro está
siendo utilizado como libro de texto de un curso o no. El campo debe configurarse
como un parámetro del constructor y es un campo inmutable. Proporciona un
método selector para el mismo denominado isCourseText.
7. Añade un método, printDetails, a la clase Book. Este método debe imprimir los
detalles relativos al autor, el título, el número de páginas, referencia, número de
veces que se ha prestado y si es un libro de texto en algún curso o no.
