package Tema5.MusicOrganizer;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
    }

    public void getArrayList(ArrayList<String> canciones) {
        this.files = canciones;
    } 
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(isValidIndex(index) ==  true) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }

    public void checkIndex(int index) {
        if(index > files.size() || index < 0) {
            System.out.println("Índice invalido, la lista de índices validos es 0, " +
            (files.size() -1)); 
        }

    }

    public boolean isValidIndex(int index) {
        if(index > files.size() || index < 0) {
            return false;
        }
        else {
            return true;
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(isValidIndex(index) == true) {
            files.remove(index);
        }
        else{
            
        }
    }

    public void listAllFiles() {
        for (String cancion : files) {
            System.out.println(cancion);
        }
    }

    /*public void listMatching(String match) {
        for (String cancion : files) {
            if(cancion.contains(match)) {
                System.out.println(match);
            }
        }

        if(match == null) {
            System.out.println("La canción que buscas no está en esta libreria");
        }
    }

    public void playMatching(String match) {
        for (String cancion : files) {
            if(cancion.contains(match)) {
                MusicPlayer reproductor = new MusicPlayer();
                reproductor.playSample(match);
            }
        }

        if(match == null) {
            System.out.println("La canción que buscas no está en esta libreria");
        }
    }*/

    public void listMatching(String match) {
        
        ArrayList<String> cancionesMatching = getMatching(match);

        for (String cancion : cancionesMatching) {
            System.out.println(cancion);
        }


    }

    public void playMatching(String match) {

        ArrayList<String> cancionesMatching = getMatching(match);
        MusicPlayer reproductor = new MusicPlayer();

        for (String cancion : cancionesMatching) {
            reproductor.playSample(cancion);
        }

    
    }

    public ArrayList<String> getMatching(String match) {
        ArrayList<String> matching = new ArrayList<>();

        Iterator<String> it = files.iterator();

        while(it.hasNext()) {
            String cadena = it.next();
            if(cadena.contains(match)) {
                matching.add(cadena);
            }
            else {

            }
        }
        return matching;
    }

    public int findFirst(String searchString) {
        int recorrerFiles = 0;

        while(files.size() < recorrerFiles) {

            if(files.get(recorrerFiles).contains(searchString)) {
                return recorrerFiles;
            }

            recorrerFiles++;
            
        }

        return -1;
    
    }
}