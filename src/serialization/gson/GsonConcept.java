package serialization.gson;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GsonConcept {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
        Commit commit = new Commit("1a","Commit 1","User",System.currentTimeMillis());
        String json = gson.toJson(commit);
        System.out.println(json);
        try(FileWriter writer = new FileWriter("C:\\Users\\logesh-pt8020\\IdeaProjects\\" +
                "JavaTutorial\\src\\serialization\\commit.json")){
            writer.write(json);
            System.out.println("Commit write successfully");
        } catch (IOException e) {
            e.getStackTrace();
        }
        ArrayList<Commit> l = new ArrayList<>();
        l.add(new Commit("1a","Commit 1","User",System.currentTimeMillis()) );
        l.add(new Commit("1b","Commit 2","User",System.currentTimeMillis()) );
        json = gson.toJson(l);
        System.out.println(json);
        try(FileWriter writer = new FileWriter("C:\\Users\\logesh-pt8020\\IdeaProjects\\" +
                "JavaTutorial\\src\\serialization\\MultipleCommit.json")){
            writer.write(json);
            System.out.println("Multiple Commit write successfully");
        } catch (IOException e) {
            e.getStackTrace();
        }

    }

}
