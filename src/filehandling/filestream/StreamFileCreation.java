package filehandling.filestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class StreamFileCreation {

    public static void main(String[] args) throws Exception{
       File file = new File("C:\\Users\\logesh-pt8020\\IdeaProjects" +
                "\\JavaTutorial\\src\\filehandling\\filestream\\streamFile.txt");
        if(file.createNewFile()){
            System.out.println("File created successfully..");
        }
        else System.out.println("File already exist");
        try(FileWriter fw = new FileWriter(file,true)){
            fw.write("Hello, Stream class\n");
            System.out.println("File written successfully..");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try(FileReader fr = new FileReader(file)){
            System.out.println("Reading file...");
            int ch;
            while((ch= fr.read())!=-1){
                System.out.print((char) ch);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
