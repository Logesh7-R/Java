package filehandling.crud;

import java.io.File;

public class FileDelete {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\logesh-pt8020\\IdeaProjects\\" +
                "JavaTutorial\\src\\filehandling\\crud\\myFile.txt");
        if(file.delete()){
            System.out.println("File Deleted Succesfully. \nFile name: "+file.getName());
        }
        else{
            System.out.println("Failed deleting file..");
        }
    }
}
