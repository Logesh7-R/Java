package hashing;

public class HashFile {
    public static void main(String[] args) {
        System.out.println(HashUtil.hashFile("C:\\Users\\logesh-pt8020\\IdeaProjects" +
                "\\JavaTutorial\\src\\serialization\\commit.json"));
        System.out.println(HashUtil.hashFile("C:\\Users\\logesh-pt8020\\IdeaProjects\\" +
                "JavaTutorial\\src\\serialization\\MultipleCommit.json"));
    }
}
