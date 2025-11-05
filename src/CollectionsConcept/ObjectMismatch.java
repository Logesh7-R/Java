package CollectionsConcept;

import java.util.*;

public class ObjectMismatch {
    public static void main(String[] args){

        List<Integer> l = new ArrayList<>();
        l.add(1);
        Set<List<Integer>> set = new HashSet<>();
        set.add(l);
        System.out.println(l);
        l.add(2);
        System.out.println(l);
        System.out.println(set);
        List<String> list = new ArrayList<>();
        Set<List<String>> set1 = new HashSet<>();
        list.add("A");
        set1.add(list);
        System.out.println(set1);
        list.add("B");
        System.out.println(set1);
        set1.add(list);
        System.out.println(set1);
        Vector<Integer> vec = new Vector<>();
        vec.add(1);
        System.out.println(vec.capacity());
        vec.trimToSize();
        System.out.println(vec.capacity());
        vec.add(1);
        System.out.println(vec.capacity());
        vec.add(1);
        System.out.println(vec.capacity());
        final ArrayList<String> li= new ArrayList<>();
        li.add("X");
        li.add("Y");
         HashSet<ArrayList<String>> set2 = new HashSet<>();
         set2.add(li);
        System.out.println(set2);
        li.set(1,"z");
        set2.add(li);
        System.out.println(set2);
    }
}
