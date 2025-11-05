package filehandling.crud;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("C:\\Users\\logesh-pt8020\\IdeaProjects\\" +
                    "JavaTutorial\\src\\filehandling\\crud\\myFile.txt");
            writer.write("hello!! everyone one.");
            writer.close();
            System.out.println("Successfully written..");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
