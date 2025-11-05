package threadconcept;

import javax.swing.plaf.TableHeaderUI;

class ParentThreadBasic extends Thread implements Runnable{
    String name;
    {
        name = "";
    }
    ParentThreadBasic(String name){
        this.name = name;
    }

    @Override
    public void run(){
        System.out.println("Parent class: "+this.name+"\t Thread name: "+Thread.currentThread().getName());
    }
}
class ChildThreadBasic extends ParentThreadBasic{
    int age;
    {
        age = 0;
    }
    ChildThreadBasic(String name, int age){
        super(name);
        this.age = age;
    }
    @Override
    public void run(){
        System.out.println("Child class: "+this.name+" Age: "+this.age+" \tThread name: "+Thread.currentThread().getName());
    }
}
class ParentThreadBasicRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Runnable Target: "+Thread.currentThread().getName());
    }
}
public class ThreadBasic {
    public  static void main(String[] args) {
        Thread t1 = new ParentThreadBasic("T1");
        Thread t2 = new ParentThreadBasic("T2");
        Thread t3 = new ParentThreadBasic("T3");
        Thread t4 = new ChildThreadBasic("T4",12);
        Thread t5 = new ChildThreadBasic("T5",14);
        Thread t6 = new ChildThreadBasic("T6",15);
        t6.start();
        t5.start();
        t4.start();
        t3.start();
        t2.start();
        t1.start();
        Thread t7 = new Thread(new ParentThreadBasicRunnable(),"Logesh");
        t7.start();
    }
}
