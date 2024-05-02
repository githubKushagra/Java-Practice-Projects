package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteAndAppend1 {
    public static void main(String[] args) {
        System.out.println("Appending the content in the existing file");

        try {
            FileWriter fw = new FileWriter("file2.txt" , true);
            fw.write("Appending into this file using FileWriter\n");

            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            BufferedWriter bfw = new BufferedWriter(new FileWriter("file2.txt" , true));
            bfw.write("Appending into this file using BufferedWriter\n");

            bfw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
