
Programación Orientada a Objetos
music-organizer-v1
Abre el proyecto music-organizer-v1.
1. Añade un método llamado checkIndex a la clase MusicOrganizer. Dicho método
admite un único parámetro entero y comprueba si se trata de un índice válido,
teniendo en cuenta el estado actual de la colección.
Si el parámetro no es válido, debe imprimir un mensaje de error indicando cuál es
el rango válido de valores. Si no es válido, no debe imprimir nada.
2. Escribe una versión alternativa de checkIndex denominada isValidIndex. Debe
tomar como parámetro un entero y devolver un booleano indicando si el índice se
encuentra dentro de la colección o no.
3. Escribe de nuevo los métodos listFile y removeFile de MusicOrganizer para que
utilicen el nuevo método isValidIndex con el fin de comprobar su parámetro, en
lugar de emplear la expresión booleana que aparece en el código. Lo dos métodos
sólo deben invocar a get o remove sobre la colección ArrayList si isValidIndex
devuelve true.
Nota. Comprueba todos los métodos creados en el banco de objetos. Comprueba
también que todos los métodos funcionan cuando la colección está vacía.


Programación Orientada a Objetos
music-organizer-v2
Abre el proyecto music-organizer-v2
1. Usando el bucle  for-each  implementa el método  listAllFiles  que
imprima el nombre de todas las canciones.
2. Añade   el   método  listMatching(String match)  que   liste   sólo
aquellas   canciones   que   contengan   la   cadena  match.   Si   no
encuentra ninguna, debe mostrar un mensaje indicándolo.
3. Añade   el   método  playMatching(String match)  que,   además   de
imprimir el nombre de la canción, reproduzca un ejemplo de
la misma usando el método playSample.
4. Avanzado.   Crea   un   método  getMatching(String match)  que
devuelva una colección (ArrayList) con todas las canciones que
contengan la cadena match.
5. Modifica  listMatching  y  playMatching  para   que   usen   el   nuevo
método getMatching. 
6. Escribe un método  findFirst(String searchString)  que devuelva el
índice   de   la   primera   canción   que   coincida   con   la   cadena
buscada. Si no la encuentra, debe devolver -1. El bucle debéis
realizarlo con un while sin usar iteradores.
Nota. Comprueba todos los métodos creados en el banco de objetos. Comprueba
también que todos los métodos funcionan cuando la colección está vacía.
For-each. El bucle for-each tiene la siguiente estructura
for (tipoElemento elemento : colección)
cuerpo del bucle.
}
Por ejemplo,
for (String filename : files){
Programación Orientada a Objetos
System.out.println(filename);
}
