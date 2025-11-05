package threadconcept;

import java.util.Scanner;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class ReadWriteLockConceptParent {
    Scanner sc = new Scanner(System.in);
    private final ReadWriteLock rwLock = new ReentrantReadWriteLock(true);
    private final Lock readLock = rwLock.readLock();
    private final Lock writeLock = rwLock.writeLock();
    private int value = 10;
    void getValue(){
        readLock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+" getting value: "+value);
//            Thread.sleep(1000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println(Thread.currentThread().getName()+" read lock released");
            readLock.unlock();
        }
    }
    void setValue(){
        writeLock.lock();
        try{
            System.out.print(Thread.currentThread().getName()+" Enter Integer: ");
            value = sc.nextInt();
            System.out.println(Thread.currentThread().getName()+" setting value: "+value);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println(Thread.currentThread().getName()+" write lock released");
            writeLock.unlock();
        }
    }
}
public class ReadWriteLockConcept {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        ReadWriteLockConceptParent obj = new ReadWriteLockConceptParent();
        for(int i=0;i<5;i++) {
            executor.submit(()->{
                obj.getValue();
            });
            executor.submit(()->{
                obj.setValue();
            });
        }
        executor.shutdown();
    }

}
