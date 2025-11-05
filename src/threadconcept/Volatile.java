package threadconcept;
class ParentVolatile{
    public volatile boolean check = true;
    int num = 0;
    void setValue(int n){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        num = n;
        check = false;
    }
    void getValue(){
        while(check){
            System.out.println("Running...");
        }
        System.out.println(num);
    }
}
public class Volatile {
    public static void main(String[] args) {
        ParentVolatile obj = new ParentVolatile();
        Thread t1 = new Thread(()->{
           obj.setValue(12);
        });
        Thread t2 = new Thread(()->{
            obj.getValue();
        });
        t1.start();
        t2.start();
    }
}
