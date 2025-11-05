package exceptionhandling;
import java.io.IOException;

class ExceptionOverrideA{
    ExceptionOverrideA() throws IOException {
        System.out.println("Hello from A");
    }
    void unchecked() throws RuntimeException{
        System.out.println("Hello from A uncheckedA");
    }
    void checked() throws Exception{
        System.out.println("Hello from A CheckedA");
    }
}
class ExceptoinOverrideB extends ExceptionOverrideA{
    ExceptoinOverrideB() throws IOException{
        System.out.println("Hello from B");
    }
    @Override
    void unchecked(){
        System.out.println("Hello from B unchecked");
    }

    @Override
    void checked() throws IOException {
        System.out.println("Hello from B checked");
    }
}
public class ExceptionOverride {
    public static void main(String[] args) throws IOException{
        ExceptoinOverrideB obj = new ExceptoinOverrideB();
        try{
            obj.checked();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
