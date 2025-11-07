package serialization.deserializing;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import serialization.gson.Commit;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class DeserializeGson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        try(FileReader reader = new FileReader("C:\\Users\\logesh-pt8020\\" +
                "IdeaProjects\\JavaTutorial\\src\\serialization\\commit.json")){
            Commit commit = gson.fromJson(reader, Commit.class);
            System.out.println(commit.id);
        }
        catch (IOException e){
            e.getStackTrace();
        }
        try(FileReader reader = new FileReader("C:\\Users\\logesh-pt8020\\" +
                "IdeaProjects\\JavaTutorial\\src\\serialization\\MultipleCommit.json")){
            Type type = new TypeToken<ArrayList<Commit>>(){}.getType();
            System.out.println(type);
            ArrayList<Commit> l = gson.fromJson(reader,type);
            System.out.println(l.get(1).id);
        }
        catch (IOException e){
            e.getStackTrace();
        }
    }
}
