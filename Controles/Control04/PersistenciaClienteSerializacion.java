package Control04;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class PersistenciaClienteSerializacion implements Serializable {

    public static void write(ArrayList<Cliente> arrayListClientes) {
        try {
            Iterator<Cliente> it = arrayListClientes.iterator();
            ObjectOutputStream f = new ObjectOutputStream(new FileOutputStream("clientes"));
            while (it.hasNext()) {
                Cliente e = it.next();
                f.writeObject(e);
            }
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Cliente> read(File f) throws IOException {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        try {
            ObjectInputStream fIn = new ObjectInputStream(new FileInputStream(f));
            while (true) {
                try {
                    Cliente e;
                    try {
                        e = (Cliente) fIn.readObject();
                    } catch (EOFException eofExc) {
                        fIn.close();
                        break;
                    }
                    Cliente newCliente = new Cliente(e.getNombre(), e.getId(), e.getApellidos(), e.getNif(), e.getEmail());
                    clientes.add(newCliente);
                } catch (ClassNotFoundException eClass) {
                    eClass.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return clientes;
    }
}
