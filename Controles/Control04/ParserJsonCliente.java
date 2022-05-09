package Control04;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
public class ParserJsonCliente {
    public File write(ArrayList<Cliente> clientes) {
        File fOut = new File("empleados.json");
        Type tipoListaEmpleados = new TypeToken<List<Cliente>>(){}.getType();
        Gson gson = new Gson();
        List<Cliente> clientesGson = gson.toJson(clientes); 
        Writer fWriter = new FileWriter(fOut);
        
        return fOut;
    }
}
