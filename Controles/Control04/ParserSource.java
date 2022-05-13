package Control04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ParserSource {
    public static String getURLSource(String url) throws IOException
    {
        URL urlObject = new URL(url);
        URLConnection urlConnection = urlObject.openConnection();
        urlConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");

        return toString(urlConnection.getInputStream());
    }
    private static String toString(InputStream inputStream) throws IOException
    {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8")))
        {
            String inputLine;
            StringBuilder stringBuilder = new StringBuilder();
            while ((inputLine = bufferedReader.readLine()) != null)
            {
                stringBuilder.append(inputLine);
            }

            return stringBuilder.toString();
        }
    }
    public static void imprimeUrlAndSrc() {
        try {
            Document doc = Jsoup.connect("https://feedempanao.github.io/").get();

            Elements docSrc = doc.getElementsByAttribute("src");
            List<String> atributos = docSrc.eachAttr("src");
            for (String atributo : atributos) {
                System.out.println(atributo);
            }
            Elements urlElements = doc.getElementsByAttribute("href");
            List<String> enlaces = urlElements.eachAttr("href");
            for(String enlace: enlaces) {
                System.out.println(enlace);
            }
                        
            

        }
        catch(IOException fIoException) {

        }
        
    }

}
