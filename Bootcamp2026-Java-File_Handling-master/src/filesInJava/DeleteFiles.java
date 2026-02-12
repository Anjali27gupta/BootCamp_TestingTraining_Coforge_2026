package filesInJava;

import java.io.File;

public class DeleteFiles {

    public static void main(String[] args) {

        File myobj = new File("D:\\Files\\Stuti.csv");

        if (myobj.delete()) {
            System.out.println("Deleted the file: " + myobj.getName());
        } else {
            System.out.println("File already deleted");
        }
    }
}
