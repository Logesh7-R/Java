package oops;

public class ObjectClass {
    public static void main(String... args){
        ObjectClass obj = new ObjectClass();
        System.out.println("obj.toString() "+obj.toString());
        System.out.println("obj.hashCode() "+obj.hashCode());
        Class objClass = obj.getClass();
        System.out.println("objClass.getClass() "+objClass.getClass());
    }
}
