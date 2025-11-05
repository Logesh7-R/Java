package oops.constructors;
class Parent{
    Parent() {
        System.out.println("Parent constructor");
    }
    public static void display(){
        System.out.println("Parent display");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("Child constructor");
    }
    public static void display(){
        System.out.println("Child display");
    }
}
public class DefaultConstructor {
    public static void main(String... args){
        Child obj1 = new Child();
        obj1.display();
        Parent obj2 = new Child();
        obj2.display();
//        Based on refence type static methods are called
//        Parent constructor
//        Child constructor
//        Child display
//        Parent constructor
//        Child constructor
//        Parent display
    }
}
