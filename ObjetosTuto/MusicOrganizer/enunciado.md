
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
