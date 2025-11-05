package Basics.PatternMatching;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class BasicPattern {
    public static void main(String[] args){
        System.out.println("Regex: abs* input: abcd"+Pattern.matches("abs*","abcd"));
        Pattern p = Pattern.compile("Hello");
        Matcher m = p.matcher("Hello, everyone. Hello thank you");
        while(m.find())
            System.out.println("Hello in string at "+m.start()+" to "+m.end());

        System.out.println("Pattern.matches(\"[a-zA-Z]{3,}[0-9]{2}@\",\"Hello12@\") "+Pattern.matches("[a-zA-Z]{3,}[0-9]{2}@","Hello12@"));
        System.out.println("Pattern.matches(\"\\\\d*\",\"123\") "+Pattern.matches("\\d*","123"));
    }
}
