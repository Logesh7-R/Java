package exceptionhandling;

import java.io.IOException;

class ChainedExceptionA{
    void a() throws IOException{
        IOException ie = new IOException("IOException Root Cause");
        ArithmeticException ae = new ArithmeticException("Divide by 0 (Arithemetic Exception) Primary Cause");
        ae.initCause(ie);
        throw ae;
    }
}
class ChainedExceptionB{
    void b() throws IOException {
        IOException ie = new IOException("IOException Root Cause", new ArithmeticException("Divide by 0 (Arithemetic Exception) Primary Cause"));
        throw ie;
    }
}
public class ChainedException {
    public static void main(String[] args){
        ChainedExceptionA obj = new ChainedExceptionA();
        ChainedExceptionB obj2 = new ChainedExceptionB();
        try{
            obj.a();
        }
        catch (Exception e){
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
        }
        try{
            obj2.b();
        }
        catch (Exception e){
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
        }
    }
}
