package exceptionhandling;

import java.io.IOException;

class ExceptionCallA{
    void a() throws IOException {
        throw new IOException("/ by IOException");
    }
}
class ExceptionCallB{
    ExceptionCallA obj = new ExceptionCallA();
    void b() throws IOException{
        obj.a();
    }
}
public class ExceptionCall {
    public static void main(String... args) throws IOException{
        ExceptionCallB obj = new ExceptionCallB();
        try {
            obj.b();
        }
        catch (Exception e){
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
