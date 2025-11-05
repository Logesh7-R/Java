package java8features;

import java.util.ArrayList;
import java.util.List;
@FunctionalInterface
interface Sorter<T>{
   List<T> sorted(List<T> T);
}

public class LambdaExpression {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Logesh");
        l.add("Rajiv");
        l.add("Vijay");
        l.add("Surya");
        l.add("James Bond");

        Sorter<String> sort = (list)-> {
            list.sort((a,b)->a.compareTo(b));
            return list;
        };
        System.out.println(l);
        sort.sorted(l).forEach(n-> System.out.println(n));
    }
}
