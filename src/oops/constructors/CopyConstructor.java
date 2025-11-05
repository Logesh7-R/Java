package oops.constructors;
class A{
    int a;
    int b;
    A(){
        a = 0;
        b = 0;
        System.out.println("A default constructor");
    }
    A(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println("A param constructor");
    }
    A(A obj){
        this.a = obj.a;
        this.b = obj.b;
        System.out.println("A copy constructor");
    }
}
public class CopyConstructor {
    public static void main(String... args){
        A obj1 = new A();
        System.out.println("A obj1 = new A() "+obj1.a +" "+ obj1.b);
        System.out.println();

        A obj2 = new A(1,2);
        System.out.println("A obj2 = new A() "+obj2.a +" "+ obj2.b);
        System.out.println();

        A obj3 = new A(obj2);
        System.out.println("A obj3 = new A() "+obj3.a +" "+ obj3.b);
        System.out.println();
    }
}
