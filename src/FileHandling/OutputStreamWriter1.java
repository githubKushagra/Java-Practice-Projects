package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriter1 {
    public static void main(String[] args) {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(System.out);
            osw.write("Kushagra Varshney");
            osw.write(10);     // 10 means '\n'
            osw.write("a");
            osw.write("\n");
            osw.write(65);
            osw.write(10);
            char[] arr = "Currently I'm doing B.Tech from Lovely Professional University".toCharArray();
            osw.write(arr);
            osw.flush();

            osw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        try {
            FileOutputStream fos = new FileOutputStream("file1.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            osw.write("This is my new File with name file1.txt.This is Kushagra Varshney");  // this will be written into the file
            osw.flush();

            osw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
