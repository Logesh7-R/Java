package oops.polymorphism;
class OverrideA{
    static void display(){
        System.out.println("Static Parent A");
    }
    void printInstance(){
        System.out.println("Instance Parent A");
    }
    protected void protectedParentInstance(){
        System.out.println("Protected Instance Parent A");
    }

    private void privateParentInstance(){
        System.out.println("Private Instance Parent A");
    }
}
class OverrideB extends OverrideA{
    static void display(){
        System.out.println("Static child B");
    }
    @Override
    protected void printInstance(){
        System.out.println("Instance child B");
    }
    @Override
    public void protectedParentInstance(){
        System.out.println("Protected Instance child B");
    }

    private void privateParentInstance(){       //Private method cant be overrided
        System.out.println("Private Instance child B");
    }
}

public class MethodOverride {
    public static void main(String[] args){
        OverrideA objA = new OverrideB(); //Upcasting objects
        objA.display();
        objA.printInstance();
        objA.protectedParentInstance();

        OverrideB objB = (OverrideB)objA;
        objB.display();
        objB.printInstance();
        objB.protectedParentInstance();

    }
}
