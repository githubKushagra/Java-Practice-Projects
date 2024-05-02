package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriter1 {
    public static void main(String[] args) {
        System.out.println("Writing into the file");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the file with .txt extension: ");
        String fileName = sc.nextLine();
        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write("This is my new File with name file1.txt");

            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            File file = new File(fileName);
            FileWriter fw = new FileWriter(file);
            fw.write("This is my new File with name file1.txt");

            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
