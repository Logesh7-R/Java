package CollectionsConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayListClass {
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println(al.size());
        HashSet<Integer> set = new HashSet<>();
        String k1 = new String("1");
        String k2 = new String("2");
        HashMap<String,Integer> map = new HashMap<>();
        map.put(k1,1);
        map.put(k2,2);
        System.out.println(map);
        k1 = null;
        System.out.println(map.keySet());
    }
}
