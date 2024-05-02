package FileHandling;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader1 {
    public static void main(String[] args) {
        try{
            System.out.println("Reading from the user");
            InputStreamReader isr = new InputStreamReader(System.in);
            System.out.print("Enter something to read: ");
            int letter = isr.read();
            while(isr.ready()) {
                System.out.print((char) letter);
                letter = isr.read();
            }

            isr.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        try{
            System.out.println("Reading from the text file");
            FileInputStream fis = new FileInputStream("file2.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            int letter = isr.read();
            while(isr.ready()) {
                System.out.print((char) letter);
                letter = isr.read();
            }

            isr.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
