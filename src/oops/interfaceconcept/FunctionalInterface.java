package oops.interfaceconcept;
@java.lang.FunctionalInterface
interface Display{
    void display();
}

class ChildDisplay implements Display{
    @Override
    public void display() {
        System.out.println("Functional Interface");
    }
}
public class FunctionalInterface {
    public static void main(String[] args){
        ChildDisplay obj = new ChildDisplay();
        obj.display();
    }
}
