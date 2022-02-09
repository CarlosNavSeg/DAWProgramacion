package MusicOrganizer;
import java.util.ArrayList;

public class MusicOrganizerTest {
    public static void main(String[] args) {
        ArrayList<String> canciones = new ArrayList<>(3);
        MusicOrganizer musica = new MusicOrganizer();
        musica.addFile("match");
        musica.addFile("filename");
        musica.addFile("La Rosa de los Vientos");

        musica.getMatching("match");
        musica.playMatching("match");
        musica.listAllFiles();
        musica.listMatching("match");
    }
}
