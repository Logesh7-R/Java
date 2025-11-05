package threadconcept;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class ReentrantLockParent{
    private final ReentrantLock lock = new ReentrantLock(true);
    private final Condition newCondition = lock.newCondition();
    private volatile boolean isEven = false;
    private int val = 1;

    public void printEven(int n){
        while(val<=n){
            lock.lock();
           try{
               while(!isEven){
                   newCondition.await();
                   if (val > n) break;
               }
               if(val>n){
                   newCondition.signalAll();
                   break;
               }
               System.out.println(Thread.currentThread().getName()+" printEven: "+val++);
               Thread.sleep(1000);
               isEven = false;
               newCondition.signalAll();
           } catch (InterruptedException e) {
               Thread.currentThread().interrupt();
           }
           finally {
                   lock.unlock();
           }
        }
    }

    public void printOdd(int n){
        while(val<=n){
            lock.lock();
            try{
                while(isEven){
                    newCondition.await();
                    if (val > n) break;
                }
                if(val>n){
                    newCondition.signalAll();
                    break;
                }
                System.out.println(Thread.currentThread().getName()+" printOdd: "+val++);
                Thread.sleep(1000);
                isEven = true;
                newCondition.signalAll();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            finally {
                lock.unlock();
            }
        }
    }
}
public class ReentrantLockConcept {
    public static void main(String[] args) {
        ReentrantLockParent obj = new ReentrantLockParent();
        System.err.println("Error Message");
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        Thread oddThread = new Thread(()->{
            obj.printOdd(val);
        },"Odd Worker ");
        Thread evenThread = new Thread(()->{
            obj.printEven(val);
        },"Even Worker ");
        evenThread.start();
        oddThread.start();
        try{
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
//           throw new RuntimeException(e);
            Thread.currentThread().interrupt();
        }
        System.out.println("END");
    }
}
