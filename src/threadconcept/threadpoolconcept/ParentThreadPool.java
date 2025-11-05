package threadconcept.threadpoolconcept;

import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

public class ParentThreadPool {
   private static Scanner sc = new Scanner(System.in);
    private double value = 10;
    private final ReentrantLock lock = new ReentrantLock();
    void setValue(){
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+" Lock acquired in setValue Method"
                    +"\nLock count: "+lock.getHoldCount());
            value = Math.random();
            System.out.println("Value set successfully in set method...\nCalling getValue Method...");
            getValue();
            Thread.sleep(1000);
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }finally {
            System.out.println(Thread.currentThread().getName()+" Lock releasing in setValue Method");
            lock.unlock();
        }
    }
    void getValue(){
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+" Lock acquired in getValue Method"
                    +"\nLock count: "+lock.getHoldCount());
            System.out.println(Thread.currentThread().getName()+" value in getMethod: "+value);
            Thread.sleep(1000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }finally {
            System.out.println(Thread.currentThread().getName()+" Lock releasing in getValue Method");
            lock.unlock();
        }
    }
}
