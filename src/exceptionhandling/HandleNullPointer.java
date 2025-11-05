package exceptionhandling;

public class HandleNullPointer {
    public static void main(String[] args){
        String str = null;
        try{
            str.equals("abc");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
        System.out.println("ab".equals(str));
    }

}
