package oops.abstraction;
abstract class Animal{
    static int count;
    String name;
    Animal(){
        count++;
        this.name = "Animal";
        System.out.println("Animal count: "+count);
    }
    final void move(int speed){
        System.out.println("Animal is moving at "+speed);
    }
    abstract void fight();
    void eat(){
        System.out.println("Animal eating meat");
    }
}

class Lion extends Animal{
    Lion(){
        System.out.println("Lion default constructor");
    }
    Lion(String name){
        this.name = name;
        System.out.println("Lion params constructor");
    }
    @Override
    void fight(){
        System.out.println("Lion is fighting");

    }
    @Override
    void eat(){
        System.out.println("Lion is eating");
    }
}

class Bird extends Animal{
    Bird(){
        System.out.println("Bird default");
    }
    Bird(String name){
        this.name = name;
        System.out.println("Bird params constructor");
    }
    @Override
    void fight(){
        System.out.println("Bird is fighting");
    }
    final void move(int speed,String type){
        System.out.println("Bird Type: "+type+" speed: "+speed);
    }
}
public class Abstract {
    public static void main(String... args){
        Animal obj1 = new Lion();
        System.out.println("Lion(): count"+obj1.count+" name: "+obj1.name);
        obj1.eat();
        obj1.fight();
        obj1.move(12);
        System.out.println();
        Animal obj2 = new Lion("Simba");
        System.out.println("Lion(\'Simba\'): count"+obj2.count+" name: "+obj2.name);
        obj2.eat();
        obj2.fight();
        obj2.move(12);
        System.out.println();
        Bird obj3 = new Bird("Rio");
        System.out.println("Bird(\'Rio\'): count"+obj3.count+" name: "+obj3.name);
        obj3.eat();
        obj3.fight();
        obj3.move(12);
        obj3.move(12,"Flight");
        System.out.println();
    }
}
