package Tema6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ContarRepeticiones {
    public static void main(String[] args) {
        File fIn = new File("/home/vagrant/Desktop/Path_TXTS/1.txt");
        try {
        try (Scanner wordScan = new Scanner(fIn)) {
            while(wordScan.hasNextLine()) {
                String nextLine = wordScan.nextLine();
                for(int i = 0; i< nextLine.length(); i++) {
                    String word = nextLine.substring(0, nextLine.indexOf(" "));

                    for(int j = 0; j<args.length; j++) {
                        if(args[j].contains(word)) {
                        }
                    }
                    
                    nextLine = nextLine.substring(word.length() + 1 , nextLine.length());
                        if(nextLine.indexOf(" ") != -1) {
                        word = nextLine.substring(0, nextLine.indexOf(" "));
                    }
                    else {
                        word = nextLine;
                    }
                }
            }
        }
    }
    catch(FileNotFoundException e) {

    }
    }
}
