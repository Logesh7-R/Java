package threadconcept;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

class SemaphoreConceptParent{
    private final Semaphore printer= new Semaphore(2,true);
    private int value = 12;
    void getValue(){
       try{
           System.out.println(Thread.currentThread().getName()+" Trying to acquire printer...");
           printer.acquire();
           System.out.println(Thread.currentThread().getName()+" Printer Acquired... "+value);
           Thread.sleep(1000);
       } catch (InterruptedException e) {
           Thread.currentThread().interrupt();
       }finally {
           System.out.println(Thread.currentThread().getName()+" releasing printer...");
           printer.release();
       }
    }
}
public class SemaphoreConcept {
    public static void main(String[] args) {
        SemaphoreConceptParent obj = new SemaphoreConceptParent();
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
        for(int i = 0;i<3;i++){
            executor.scheduleWithFixedDelay(()->{
                obj.getValue();
            },1,2, TimeUnit.SECONDS);
        }
        executor.schedule(()->{
            System.out.println("Scheduler shutting down...");
            executor.shutdown();
        },8,TimeUnit.SECONDS);
    }
}
