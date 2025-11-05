package Basics;
class Static1{
      void display(){
        System.out.println("Static 1");
    }
}
class Static2 extends Static1{
     void display(){
        System.out.println("Static 2");
    }
    void speak(){}
}
public class StaticMethod {
    public static void main(String... args){
        Static1 obj = new Static2();
        Static2 obj2 = (Static2)obj;
        obj.display();
    }
}
