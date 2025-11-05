package threadconcept.threadpoolconcept;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
    public static void main(String[] args) {
        ParentThreadPool obj = new ParentThreadPool();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for(int i = 0;i<5;i++){
            executor.execute(()->{
                obj.setValue();
            });
            executor.execute(()->{
                obj.getValue();
            });
        }
        executor.shutdown();
    }
}
