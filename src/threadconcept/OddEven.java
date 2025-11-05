package threadconcept;
import java.util.Scanner;


class OddEvenParent{
    int val = 1;

    public void printNumber(int val) {
//        System.out.println(OddEven.mainT.getState()+": "+OddEven.mainT.getName()+" in Parent class");
        System.out.println(Thread.currentThread().getState()+": "+Thread.currentThread().getName()+" in Parent class");
        this.startThread(val);
    }

    private void startThread(int n){
            Thread t1 = new Thread(() -> {
                try {
                    this.printEven(n);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            Thread t2 = new Thread(() -> {
                try {
                    this.printOdd(n);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            t2.start();
            t1.start();
            try{
                t1.join();
                t2.join();
                System.out.println(Thread.currentThread().getState()+" Parent Method after t1.join()");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        this.setValue();
        System.out.println(Thread.currentThread().getName()+" Parent Method");
    }

    synchronized private void printOdd(int n) throws InterruptedException {
        while(val<=n) {
            while (val % 2 == 0) {
                wait();
            }
            if(val>n) {
                break;
            }
            System.out.println(Thread.currentThread().getName() + "\tOdd Number: " + val++);
            notifyAll();
        }
        System.out.println(Thread.currentThread().getName()+" END");
    }

    synchronized private void printEven(int n) throws InterruptedException {
        while (val <= n) {
            while (val % 2 != 0) {
                wait();
            }
            if (val > n) {
                break;
            }
            System.out.println(Thread.currentThread().getName() + "\tEven Number: " + val++);
            notifyAll();
        }
        System.out.println(Thread.currentThread().getName() + " END");
    }

    private void setValue(){
        this.val = 1;
    }
}


public class OddEven {
    public static Thread mainT = Thread.currentThread();
    public static void main(String[] args) {
        mainT.setName("Main Thread");
            OddEvenParent obj = new OddEvenParent();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Number: ");
            int n = sc.nextInt();
            obj.printNumber(n);


    }
}