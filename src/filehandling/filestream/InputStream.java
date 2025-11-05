package filehandling.filestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class InputStream {
    public static void main(String[] args) {
        try( FileInputStream file = new FileInputStream("C:\\Users\\logesh-pt8020\\IdeaProjects" +
                "\\JavaTutorial\\src\\filehandling\\filestream\\images.jpg")){
            int val;
            while((val= file.read())!=-1){
                System.out.println(val);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
