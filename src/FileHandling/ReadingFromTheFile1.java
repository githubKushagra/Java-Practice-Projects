package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFromTheFile1 {
    public static void main(String[] args) {
        try{
            File file = new File("file1.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()) {
                String str = sc.nextLine();
                System.out.println(str);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
