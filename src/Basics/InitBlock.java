package Basics;

public class InitBlock {
    InitBlock(){
        System.out.println("Constructor");
    }
    public static void main(String... args){
        new InitBlock();
    }
    {
        System.out.println("Init");
    }
    static{
        System.out.println("Static");
    }
}
