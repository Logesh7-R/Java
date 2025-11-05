package oops.interfaceconcept;
class Outer{
    void subtract(){
        System.out.println("Subtract from outer");
    }
    interface InnerInterface{
        void add();
    }
}
class InheritOuter extends Outer implements Outer.InnerInterface{
    @Override
    void subtract() {
        System.out.println("Subtract from InheritOuter");
    }

    @Override
    public void add(){
        System.out.println("Add");
    }

}
public class ClassNestedInterface {
public static void main(String... args){
    Outer.InnerInterface obj = new InheritOuter();
    obj.add();
    ((Outer)obj).subtract();
}
}
