package threadconcept;

import java.util.PriorityQueue;

class ParentThreadMethods extends Thread{
    @Override
    public void run(){
        System.out.println("Parent thread: "+Thread.currentThread().getName());
        for(int i=0;i<2;i++){
            System.out.println("Parent thread: "+Thread.currentThread().getName()+" "+i);
        }
        System.out.println("End of Parent");
    }
}
class ChildThreadMethods extends Thread{
    @Override
    public void run(){
        System.out.println("Child thread: "+Thread.currentThread().getName());
        Thread t1 = new ParentThreadMethods();
        Thread t2 = new ParentThreadMethods();
        System.out.println("ChildThreadMethods t1: "+t1.getState());
        t1.start();
        try{
            t1.sleep(10000);
            System.out.println("ChildThreadMethods t1: "+t1.getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
        System.out.println("Priority in child method\nT1:\t"+t1.getPriority()+"\nT2:\t"+t2.getPriority());

        try{
            t2.join();
            System.out.println("ChildThreadMethods t2: "+t2.getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End of child");
    }

}
public class ThreadMethods {
    public static void main(String[] args) {
        Thread t1 = new ChildThreadMethods();
        Thread t2 = new ChildThreadMethods();
        Thread mainThread = Thread.currentThread();
        System.out.println("Priority in main method\nMain Thread:\t"+mainThread.getPriority()+"\nT1:\t"+t1.getPriority()+"\nT2:\t"+t2.getPriority());
        System.out.println("Main method: t1"+ t1.getState());
        System.out.println("Main method: Main Thread"+ mainThread.getState());
        t1.start();
        t2.start();
        try{
            t1.sleep(100);
            System.out.println("After sleep t1 Main method: Main Thread"+ mainThread.getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try{
            t2.join();
            System.out.println("T2 Join Main method: Main Thread"+ mainThread.getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End of Main method");
    }

}
