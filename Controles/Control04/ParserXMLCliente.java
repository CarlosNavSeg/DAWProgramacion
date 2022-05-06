package Control04;


import java.util.ArrayList;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import org.w3c.dom.Element;
import org.w3c.dom.Document;

public class ParserXMLCliente {
    public static void write() throws FileNotFoundException, IOException, ParserConfigurationException, TransformerException {
        ObjectInputStream f = new ObjectInputStream
        (new FileInputStream(new File("clientes")));
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().
        newDocument();
        Element root = doc.createElement("clientes");
        doc.appendChild(root);
        Cliente e;
        try{
            while(true) {
                try{
                e = (Cliente) f.readObject();
                Element cli = doc.createElement("cliente");
                cli.setAttribute("id", Integer.toString(e.getId()));

                Element atributosCliNom = doc.createElement("nombre");
                atributosCliNom.appendChild(doc.createTextNode(e.getNombre()));
                cli.appendChild(atributosCliNom);
                
                Element atributosCliApps = doc.createElement("appelidos");
                atributosCliApps.appendChild(doc.createTextNode(e.getApellidos()));
                cli.appendChild(atributosCliApps);
                
                Element atributosCliNif = doc.createElement("nif");
                atributosCliNif.appendChild(doc.createTextNode(e.getNif()));
                cli.appendChild(atributosCliNif);

                Element atributosCliEmail = doc.createElement("email");
                atributosCliEmail.appendChild(doc.createTextNode(e.getEmail()));
                cli.appendChild(atributosCliEmail);

                root.appendChild(cli);
                }
                catch(ClassNotFoundException c) {

                }
            }
        }
        catch(EOFException fEofException) {

        }
        try{
        Transformer trans = TransformerFactory.newInstance().newTransformer();
        DOMSource dom = new DOMSource(doc);
        StreamResult strResult = new StreamResult(new FileOutputStream("./clientes.xml"));
        trans.transform(dom, strResult);
        }
        catch(TransformerConfigurationException tExc) {
            tExc.printStackTrace();
        }
        }


    }

