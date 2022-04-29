
Programación Orientada a Objetos
music-organizer-v5
Abre el proyecto music-organizer-v5
1. Crea   el   método  findInTitle(String   searchString)  en   la   clase
MusicOrganizer que imprima todas las canciones que contengan
la cadena de búsqueda.
2. Añade una campo  playCount  a la clase  Track. Proporciona
métodos   para   reinicializar   el   contador   a   0   y   para
incrementarlo en una unidad.
3. Haz que el objeto  MusicOrganizer  incremente el contador de
reproducciones de una pista cada vez que se reproduzca.
4. Añade   un   campo  album  para   almacenar   a   qué   álbum
pertenece la canción. Proporciona métodos para que la clase
MusicOrganizer los pueda consultar y fijar. Modifica también el
método getDetails() para que muestre también el álbum al que
pertenece la canción.
5. Si reproducimos dos pistas sin detener la primera, ambas se
reproducirán simultáneamente. Modifica el programa para
que la pista que se está reproduciendo se detenga cuando se
inicie otra pista distinta (¡fijaos que dice distinta!)
6. Crea un método llamado  toString()  en la clase  Track  cuyo
contenido sea igual a getDetails(). Ahora modifica el método
MusicOrganizer.listAllTracks() eliminando el método  getDetails() del
objeto track.
Nota.
Cuando usamos  System.out.println(objeto), java automáticamente busca un
método   en   la   clase   llamado  toString().   Si   no   lo   encuentra,   llama
automáticamente al método  toString()  de la clase  Object  (de la que heredan
todos las clases de java)
Cuando   se   cambia   un   método   heredado   de   una   clase,   se   dice   que   se   ha
sobreescrito el método.
