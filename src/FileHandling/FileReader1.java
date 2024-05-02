package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {
    public static void main(String[] args) {
        System.out.println("Reading the data from the file");

        try{
            FileReader fr = new FileReader("file1.txt");
            int letter = fr.read();
            while(fr.ready()) {
                System.out.print((char)letter);
                letter = fr.read();
            }

            fr.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        try{
            File file = new File("file1.txt");
            FileReader fr = new FileReader(file);
            int letter = fr.read();
            while(fr.ready()) {
                System.out.print((char)letter);
                letter = fr.read();
            }

            fr.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
