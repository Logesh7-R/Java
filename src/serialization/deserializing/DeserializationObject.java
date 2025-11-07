package serialization.deserializing;

import serialization.SerializeChild;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.nio.file.Files;

public class DeserializationObject {
    public static void main(String[] args) {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(
                "C:\\Users\\logesh-pt8020\\" +
                        "IdeaProjects\\JavaTutorial\\src\\serialization\\serialize.ser"
        ))){
            SerializeChild obj = (SerializeChild) in.readObject();
            System.out.println("Employee name: "+obj.getName());
            System.out.println("Employee dumy: "+obj.dumy);
            System.out.println("Employee id: "+obj.getEmpId());
            System.out.println("Employee bonus: "+obj.getBonus());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

