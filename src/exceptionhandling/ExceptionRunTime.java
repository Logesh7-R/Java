package exceptionhandling;

class UncheckedException{
    void run() throws IndexOutOfBoundsException{
        System.out.println("IndexOutOfBoundsException");
        throw new RuntimeException("IndexOutOfBoundsException");
    }
}
public class ExceptionRunTime {
    public static void main(String[] args){
        UncheckedException obj = new UncheckedException();
        obj.run();
    }
}
