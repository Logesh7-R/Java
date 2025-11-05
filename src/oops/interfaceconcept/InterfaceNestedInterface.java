package oops.interfaceconcept;
interface OuterInterfaceParent{
    void displayOuter();
    interface InnerInterfaceParent{
        void displayInner();
    }
}
class ChildClass implements OuterInterfaceParent,  OuterInterfaceParent.InnerInterfaceParent{
    @Override
    public void displayOuter() {
        System.out.println("Parent DisplayOuter");
    }
    @Override
    public void displayInner(){
        System.out.println("Parent DisplayInner");
    }

}
public class InterfaceNestedInterface {
    public static void main(String... args){
        ChildClass obj = new ChildClass();
        obj.displayOuter();
        obj.displayInner();
    }
}
