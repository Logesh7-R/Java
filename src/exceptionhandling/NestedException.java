package exceptionhandling;

import java.io.IOException;

public class NestedException {
    public static void main(String[] args){
        try{
            try {
                throw new Exception();
            } catch (IOException e) {
                System.out.println("Inner Exception");
            }
            finally {
                System.out.println("Inner Finally");
            }
        }catch(Exception e){
            System.out.println("Outer Exception");
        }
        finally {
            System.out.println("Outer Finally");
        }
        System.out.println("After Exception Handling");
    }
}
