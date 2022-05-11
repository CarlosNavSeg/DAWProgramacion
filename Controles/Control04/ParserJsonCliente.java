package Control04;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class ParserJsonCliente {
    public File write(ArrayList<Cliente> clientes) {
        File fOut = new File("empleados.json");
        ObjectMapper mapper = new ObjectMapper();
        try{
        FileWriter fw = new FileWriter(fOut);
        try {

            for(Cliente c: clientes) {
                String jsonString = mapper.writeValueAsString(c);
                System.out.println(jsonString);
                fw.append(jsonString);

            }
        }
        catch(JsonProcessingException jsonExc) {
            jsonExc.printStackTrace();
        }
        fw.close();
    }
    catch(IOException e) {
        e.printStackTrace();
    }
        return fOut;
    }

}
