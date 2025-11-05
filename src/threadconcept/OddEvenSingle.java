package threadconcept;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

class OddEvenSingleParent{
    private final ReentrantLock lock = new ReentrantLock(true);
    AtomicInteger val = new AtomicInteger(0);
    static Integer staticNum = 0;
    private static final Object staticLock = new Object();
    void print(int n){
        while(n>=val.get()){
            lock.lock();
            try {
                if(n<=val.get()) break;
                System.out.println(Thread.currentThread().getName() + " value: " + val.incrementAndGet());
                Thread.sleep(100);
            }
            catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
            finally {
                lock.unlock();
            }
        }
    }
    static void printNum(int n){
        synchronized (staticLock){
            while(n>=staticNum){
                staticLock.notifyAll();
                if(n<=staticNum) break;
                System.out.println(Thread.currentThread().getName() + " value: " + ++staticNum);
                try {
                    Thread.sleep(100);
                    staticLock.wait();
                }
                catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
        }
    }
}
}
public class OddEvenSingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OddEvenSingleParent obj = new OddEvenSingleParent();
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        Thread t1 = new Thread(()->{
            OddEvenSingleParent.printNum(n);
        },"Worker 1 ");
        Thread t2 = new Thread(()->{
           OddEvenSingleParent.printNum(n);
        },"Worker 2 ");
      t1.start();
      t2.start();
    }
}