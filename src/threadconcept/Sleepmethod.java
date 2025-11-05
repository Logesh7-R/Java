package threadconcept;

import java.util.concurrent.atomic.AtomicBoolean;

public class Sleepmethod {
    int n=0;
    public static Thread mainThread = Thread.currentThread();
    public static void main(String[] args) {
        System.out.println("In sub 1 thread: "+mainThread.getName()+" is in "+mainThread.getState()+" state");
        Thread t1 = new Thread(()->{
        });
        System.out.println(t1.getName()+" is in: "+t1.getState()+" state");
        t1.start();
        try {
            t1.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(t1.getName()+" is in: "+t1.getState()+" state");
//        System.out.println(mainThread.getState()+" in main thread "+Thread.currentThread().getName());
        Thread t2 = new Thread(()->{
            System.out.println("In sub 2 thread: "+mainThread.getName()+" is in "+mainThread.getState()+" state");
        });
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("In main thread: "+mainThread.getName()+" is in "+mainThread.getState()+" state");
    }
}
