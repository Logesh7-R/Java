package oops.constructors;

class ParentParamterizedClass{
    int age;
    ParentParamterizedClass(){
        age = 0;
        System.out.println("Parent default constructor");
    }
    ParentParamterizedClass(int age){
        this.age =age;
        System.out.println("Parent param constructor");
    }
}
class ChildParamterizedClass extends ParentParamterizedClass{
    String name;
    ChildParamterizedClass(){
        name = "abc";
        System.out.println("Child default constructor");
    }
    ChildParamterizedClass(String name){
        this.name = name;
        System.out.println("Child param constructor(Only name)");
    }
    ChildParamterizedClass(int age){
        super(age);
        this.name = "abc";
        System.out.println("Child param constructor(Only int)");
    }
    ChildParamterizedClass(String name,int age){
        this(age);
        this.name = name;
        System.out.println("Child param constructor(both int,name)");
    }
}

public class ParamterizedConstructor {
    public static void main(String... args){
        ChildParamterizedClass obj1 = new ChildParamterizedClass("Logesh");
        System.out.println("new ChildParamterizedClass(\"Logesh\")"+  obj1.name+" "+obj1.age);

        ChildParamterizedClass obj2 = new ChildParamterizedClass();
        System.out.println("new ChildParamterizedClass()"+  obj2.name+" "+obj2.age);

        ChildParamterizedClass obj3 = new ChildParamterizedClass("Logesh",25);
        System.out.println("new ChildParamterizedClass(\"Logesh\",25)"+  obj3.name+" "+obj3.age);

        ChildParamterizedClass obj4 = new ChildParamterizedClass(25);
        System.out.println("new ChildParamterizedClass(25)"+  obj4.name+" "+obj4.age);
    }
}



//java: constructor ParentParamterizedClass in class oops.constructors.ParentParamterizedClass cannot be applied to given types;
//required: int
//found:    no arguments
//package oops.constructors;
//reason: actual and formal argument lists differ in length
