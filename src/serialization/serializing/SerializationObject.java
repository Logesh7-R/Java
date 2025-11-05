package serialization.serializing;

import serialization.SerializeChild;

import java.io.*;

public class SerializationObject {
    public static void main(String[] args) throws IOException {
        SerializeChild obj = new SerializeChild("Logesh",1000000);
        FileOutputStream fop = new FileOutputStream("C:\\Users\\logesh-pt8020\\" +
                "IdeaProjects\\JavaTutorial\\src\\serialization\\serialize.ser");
        ObjectOutputStream out = new ObjectOutputStream(fop);
        out.writeObject(obj);
        fop.close();
        out.close();
    }
}
