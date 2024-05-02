package FileHandling;

import java.io.*;

public class BufferedWriter1 {
    public static void main(String[] args) {
        System.out.println("Writing into a new file using BufferedWriter class");

        try {
            BufferedWriter bfw = new BufferedWriter(new FileWriter("file2.txt"));
            bfw.write("The name of the file is file2.txt");
            bfw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Writing text into the file which we are taking from user input");
            BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
            BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Write something to read: ");
            String userData = bfr.readLine();
            bfw.write(userData);
            bfw.newLine();

            bfw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
