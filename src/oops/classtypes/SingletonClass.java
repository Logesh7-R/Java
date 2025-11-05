package oops.classtypes;
class Singleton{
    int num;
    private static Singleton obj;
    private Singleton(){
        System.out.println("Singleton class");
    }
    public static Singleton createInstance(int num){
        if(obj==null) {
            obj = new Singleton();

            System.out.println("Object created and initialize num as "+obj.num);
        }
        else
            System.out.println("Object is already created and initialize num as "+obj.num);
        obj.num = num;
        return obj;
    }
}
public class SingletonClass {
    public static void main(String... args){
        Singleton obj1 = Singleton.createInstance(1);
        System.out.println(obj1.num);
        Singleton obj2 = Singleton.createInstance(2);
        System.out.println(obj1==obj2);
        System.out.println(obj1.num);
    }
}
