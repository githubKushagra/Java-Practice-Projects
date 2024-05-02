package FileHandling;

import java.io.File;
import java.io.IOException;

public class DeletingTheFile1 {
    public static void main(String[] args) {
        System.out.println("Deleting the existing file");

            File file = new File("newFile1.txt");
            if(file.delete()) {
                System.out.println("Successfully deleted the text file");
            }
            else {
                System.out.println("Not able to delete the text file");
            }
    }
}
