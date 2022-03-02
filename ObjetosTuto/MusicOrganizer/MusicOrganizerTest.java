package MusicOrganizer;

public class MusicOrganizerTest {
    public static void main(String[] args) {
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
