import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Agenda {
    public static File textFile = new File("agenda.dat");
    public static File objectFile = new File("agendaObjeto.dat");
 

    public static void agendaWrite() {
        try {
        BufferedWriter bWriter = new BufferedWriter(new FileWriter(textFile, true));
        Scanner inputUsuario = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = inputUsuario.next();
        System.out.println("Apellidos: ");
        String apellidos = inputUsuario.next();
        System.out.println("Email: ");
        String email = inputUsuario.next();
        System.out.println("Telefono: ");
        String telefono = inputUsuario.next();
        AgendaObject personToWrite = new AgendaObject(nombre,apellidos,email,telefono);
        bWriter.append(personToWrite.toString());
        bWriter.append("\n");
        try {
            DataOutputStream dStream = new DataOutputStream(new FileOutputStream(objectFile, true));
            dStream.writeUTF(personToWrite.nombre);
            dStream.writeUTF(personToWrite.apellidos);
            dStream.writeUTF(personToWrite.email);
            dStream.writeUTF(personToWrite.telefono);
            dStream.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        inputUsuario.close();
        bWriter.close();
        }
        catch (IOException e) {

        }

    }
    public static void agendaReadListado() {
        try {
        FileReader fReader = new FileReader(textFile);
        BufferedReader bfReader = new BufferedReader(fReader);
        String nextLine;
        try {
        while(bfReader.ready()) {
            nextLine = bfReader.readLine();
            System.out.println(nextLine);
        }
        bfReader.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        }
        catch(FileNotFoundException fException) {

        }
    }
    public static void agendaObjectReadListado() {
        try {
            DataInputStream fStream = new DataInputStream(new FileInputStream(objectFile));
            try {
                while(true) {
                    String nomString = fStream.readUTF();
                    String apellidos = fStream.readUTF();
                    String email = fStream.readUTF();
                    String telefono = fStream.readUTF();
                    System.out.println(nomString + "\t" + apellidos + "\t" + email + "\t" + telefono);
                    
                }
            }
            catch(EOFException eofException) {
                eofException.printStackTrace();
            }
            fStream.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
