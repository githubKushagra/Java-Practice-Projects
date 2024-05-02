package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreationOfNewFile1 {
    public static void main(String[] args) {
        System.out.println("Creating a new file with the name - newFile1.txt");

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the name of file: ");    // for testing i will write newFile1.txt
            String fileName = sc.nextLine();
            File file = new File(fileName);
            file.createNewFile();
            System.out.println("New text file has been created successfully");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
