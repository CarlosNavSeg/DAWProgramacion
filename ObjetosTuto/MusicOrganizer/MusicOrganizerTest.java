package MusicOrganizer;
import java.util.ArrayList;

public class MusicOrganizerTest {
    public static void main(String[] args) {
        ArrayList<String> canciones = new ArrayList<>(3);
        MusicOrganizer musica = new MusicOrganizer();
        musica.getArrayList(canciones);
        musica.addFile("La rosa de los vientos");
        musica.addFile("Ocarina of Time");
        musica.addFile("Holi");
        musica.addFile("casi");
        musica.addFile("Invalido");
    }
}
