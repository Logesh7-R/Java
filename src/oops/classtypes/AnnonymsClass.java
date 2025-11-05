package oops.classtypes;
abstract class ClassA{
    abstract void display();
}
public class AnnonymsClass{
    public static void main(String[] args){
        ClassA obj = new ClassA(){
            void display(){
                System.out.println("Abstract class running...");
            }
        };
        obj.display();
    }
}
