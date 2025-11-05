package exceptionhandling;
class ExceptionA{
    void divide() throws ArithmeticException{
        int a  = 10/0;
    }
}
public class Exceptions {
    public static void main(String... args){
        ExceptionA obj = new ExceptionA();
        try{
            obj.divide();
        }
        catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
        finally {
            System.out.println("Finally Block");
        }
        System.out.println("After exception handling");
    }
}
