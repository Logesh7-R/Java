package serialization.gson;

public class Commit {
    public String id;
    String message;
    String author;
    long timeStamp;
    public Commit(String id, String message, String author, long timeStamp){
        this.id = id;
        this.message = message;
        this.author = null;
        this.timeStamp = timeStamp;
        System.out.println("Commit constructor");
    }
}
