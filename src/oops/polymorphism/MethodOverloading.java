package oops.polymorphism;
class Add{
    int abc;

    void add() {
        System.out.println("No argument");
    }
    void add(int a,int b){
        System.out.println("Integer(a+b): "+a+b);
    }
    void add(float a){
        System.out.println("Float(a): "+a);
    }
    void add(double a,double... b){
        double sum = a;
        for(double i:b){
            sum+=i;
        }
        System.out.println("Double(a+b...): "+sum);
    }
}
public class MethodOverloading {
    public static void main(String... args){
        Add opr = new Add();
        byte a = 12;
        int b = 11;
        char c = 'f';
        long d = 123324243123L;
        float f = 13.2f;
        double g= 123.123;
        opr.add();
        opr.add(f);
        opr.add(a);
        opr.add(d,d,d,d);
        opr.add(f,f,f,f);
        opr.add(b);
    }
}
