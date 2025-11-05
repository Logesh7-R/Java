package oops.inheritance;
class ParentInherit {
    void a(){
        System.out.println("Parent a");
        b();
    }
    void b(){
        System.out.println("Parent b");
    }
}
class ChildInherit extends ParentInherit{
    @Override
    void b(){
        System.out.println("Child b");
    }
}
public class Inherit {
    public static void main(String... args){
        ParentInherit p = new ChildInherit();
        p.a();
    }
}
