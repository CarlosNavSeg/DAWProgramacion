package Control04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;


public class PersistenciaCliente {
    public static void write(ArrayList<Cliente> arrayListClientes) {
        try {
            File registro = new File("clientes.dat");
            Iterator<Cliente> it = arrayListClientes.iterator();
            FileWriter fw = new FileWriter(registro);
            String clienteFormateado = "";
            while(it.hasNext()) {
                String cliente = it.next().toString();
                while(cliente.indexOf("\n") != -1) {
                    String atributo = "";
                    if(cliente.indexOf("\n") > cliente.indexOf("\t") && cliente.indexOf("\t") != -1) {
                    atributo = cliente.substring(0, cliente.indexOf("\t"));
                    }
                    else {
                    atributo = cliente.substring(0, cliente.indexOf("\n"));
                    }
                    clienteFormateado += atributo;
                    clienteFormateado += ",";
                    cliente = cliente.substring(atributo.length()+1, cliente.length());
                }
                clienteFormateado += cliente;
                clienteFormateado += "\n";
            }
            fw.write(clienteFormateado);
            fw.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void read(File f) throws IOException {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        try {
            BufferedReader bfReader = new BufferedReader(new FileReader(f));
            String atributo = "";
           

            while(bfReader.ready()) {
                String thisLine = bfReader.readLine();
                String [] atributos = new String[5];
                for(int i = 0; i<4; i++) {                  
                    atributo = thisLine.substring(0, thisLine.indexOf(","));
                    atributos[i] = atributo;
                    thisLine = thisLine.substring(atributo.length() +1, thisLine.length());
                }
                atributo = thisLine;
                atributos[4] = atributo;
                int idAtributos = Integer.parseInt(atributos[1]);
                clientes.add(new Cliente(atributos[3],idAtributos, atributos[2], atributos[4], atributos[0]));
            }
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        Cliente f = new Cliente("Carlos", 0, "Navarro", "53446717R", "postauqeuis@gmail.com");
        Cliente r = new Cliente("Javier", 1, "Segarra", "3719213R", "tehascompraolayoquesé@xd.com");
        clientes.add(f);
        clientes.add(r);
        write(clientes);
        File e = new File("./clientes.dat");
        read(e);
    }
}
