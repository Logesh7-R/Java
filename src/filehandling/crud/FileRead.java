package filehandling.crud;

import java.io.File;
import java.util.Scanner;

public class FileRead {
   public static void main(String[] args) {
        System.out.println("File reading");
        try{
            File file = new File("C:\\Users\\logesh-pt8020\\IdeaProjects\\" +
                    "JavaTutorial\\src\\filehandling\\crud\\myFile.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
