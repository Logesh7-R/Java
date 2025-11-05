package threadconcept.threadpoolconcept;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutor {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);
        ParentThreadPool obj = new ParentThreadPool();
        Runnable task1 = ()-> obj.getValue();
        Runnable task2 = ()->obj.setValue();
        scheduler.scheduleWithFixedDelay(task1,1,1, TimeUnit.SECONDS);
        scheduler.scheduleAtFixedRate(task2,1,1, TimeUnit.SECONDS);
        scheduler.schedule(()->{
            System.out.println("Shutting down scheduler...");
            scheduler.shutdown();
        },10,TimeUnit.SECONDS);
    }
}
