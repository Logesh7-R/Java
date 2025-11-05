package filehandling.crud;

import java.io.File;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args) {
        try{
            File obj = new File("C:\\Users\\logesh-pt8020\\IdeaProjects" +
                    "\\JavaTutorial\\src\\filehandling\\crud\\myFile.txt");
            if(obj.createNewFile()){
                System.out.println("File created successfully..");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
