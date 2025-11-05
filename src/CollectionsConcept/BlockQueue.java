package CollectionsConcept;


import java.util.concurrent.CopyOnWriteArrayList;

public class BlockQueue {
    static void main(String[] args) {
        CopyOnWriteArrayList<Integer> arr = new CopyOnWriteArrayList<>();
        for(int i = 0; i<15;i++)arr.add(i+10);
        System.out.println(arr);
        Thread t1 = new Thread();
    }

}
