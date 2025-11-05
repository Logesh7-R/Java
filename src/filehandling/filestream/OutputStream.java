package filehandling.filestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class OutputStream {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\logesh-pt8020\\IdeaProjects" +
                "\\JavaTutorial\\src\\filehandling\\filestream\\streamFile.txt");
        try(FileOutputStream fop = new FileOutputStream(file,true)){
           fop.write("\nWritten by FileOutputStream".getBytes());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try(FileInputStream fip = new FileInputStream(file)){
            int val;
            while((val=fip.read())!=-1) System.out.print((char) val);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
