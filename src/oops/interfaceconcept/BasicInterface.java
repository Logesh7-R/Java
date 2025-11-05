package oops.interfaceconcept;
interface InterfaceParent {
    int x=10;
    void display();
    default void defaultMethod(){
        System.out.println("InterfaceFirst Default Method");
    }
    static void staticMethod(){
        System.out.println("InterfaceFirst static Method");
    }
    default void callPrivate(){
        privateMethod();
    }
    private void privateMethod(){
        System.out.println("privateMethod private Method");
    }
}
interface InterfaceParent2 {
    default void defaultMethod(){
        System.out.println("InterfaceParent2 Default Method");
    }
}
class ChildOfInterface implements InterfaceParent,InterfaceParent2{
    @Override
    public void display(){
        System.out.println("ChildOfInterface overrided display method");
    }

    @Override
    public void defaultMethod() {
        InterfaceParent.super.defaultMethod();
        InterfaceParent2.super.defaultMethod();
    }
}
public class BasicInterface {
    public static void main(String... args){
    InterfaceParent obj = new ChildOfInterface();
    obj.display();
    obj.defaultMethod();
    obj.callPrivate();
    InterfaceParent.staticMethod();
    System.out.println(obj.x);
}}
