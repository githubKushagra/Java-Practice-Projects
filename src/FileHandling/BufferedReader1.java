package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader1 {
    public static void main(String[] args) {
        System.out.println("Reading from the file using BufferedReader class");

        try{
            BufferedReader bfr = new BufferedReader(new FileReader("file1.txt"));
            while(bfr.ready()) {
                System.out.println(bfr.readLine());
            }
            bfr.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Reading from user input");
            BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter something to read: ");
            String letters = bfr.readLine();
            System.out.println("Characters read from the inputs are: " + letters);
            bfr.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
