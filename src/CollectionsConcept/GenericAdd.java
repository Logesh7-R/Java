package CollectionsConcept;

import java.util.*;

class Maths{
    public static <U extends Number> double add(U... values){
        if (values.length <=0) return 0;
        double sum = 0;
        try{
            for(U i : values){
                sum += i.doubleValue();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
return sum;
    }
}
public class GenericAdd {
    public static void main(String[] args) {
        System.out.println(Maths.add(1,2));
        System.out.println(Maths.add(1.1));
        System.out.println(Maths.add());

    }
}
