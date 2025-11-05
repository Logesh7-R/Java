package threadconcept.threadpoolconcept;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPool {
    public static void main(String[] args) {
        ParentThreadPool obj = new ParentThreadPool();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        for(int i = 0; i<3;i++){
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
