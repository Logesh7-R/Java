package threadconcept;

import java.util.concurrent.atomic.AtomicInteger;

class AtomicIntParent{
    AtomicInteger val = new AtomicInteger(0);

    void print10(){
        while(val.get()<10){
        for(int i = 0;i<20;i++){
            System.out.println(Thread.currentThread().getName()+" print10 method: "+val.incrementAndGet());
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        }
    }
    void print20(){
        while(val.get()<=20){
        while(val.get()>=10){
            for(int i = 0;i<20;i++){
                System.out.println(Thread.currentThread().getName().toUpperCase()+" print20 method: "+val.incrementAndGet());
            }
            break;
        }
    }}
}
public class AtomicInt {
    public static void main(String[] args) {
        AtomicIntParent obj = new AtomicIntParent();
        Thread t1 = new Thread(()->{
           obj.print10();
        },"Worker 1");
        Thread t2 = new Thread(()->{
            obj.print20();
        },"Worker 2");
        t2.start();
        t1.start();
    }
}
