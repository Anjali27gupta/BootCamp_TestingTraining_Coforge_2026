package filesInJava;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static void main(String[] args) {

        try {
            FileWriter myWriter = new FileWriter("D:\\Files\\Stuti.txt");
            myWriter.write("Hello World....Have a nice day!");
            myWriter.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
