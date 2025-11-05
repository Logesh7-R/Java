package CollectionsConcept;

import java.util.PriorityQueue;

class PrQueueParent{
    int value;
    PrQueueParent(int val){
        value = val;
    }
    PrQueueParent(){
        value = 0;
    }
    @Override
  public String toString(){
        return "PrQueue "+this.value;
    }
}
public class PrQueue {
   public static void main(String[] args) {
       PriorityQueue<PrQueueParent> queue = new PriorityQueue<>((o1,o2)->o1.value-o2.value);
       queue.add(new PrQueueParent(10));
       queue.add(new PrQueueParent(1));
       queue.add(new PrQueueParent(12));
       queue.add(new PrQueueParent(54));
       queue.add(new PrQueueParent());
       queue.add(new PrQueueParent());
       System.out.println(queue);
    }
}
