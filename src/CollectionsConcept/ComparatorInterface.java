package CollectionsConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortbyNameReverse implements Comparator<Student> {
    @Override
    public int compare(Student obj1, Student obj2){
        return obj2.compareTo(obj1);
    }
}
class SortbyRollReverse implements Comparator<Student> {
    @Override
    public int compare(Student obj1, Student obj2){
        return obj2.rollNo - obj1.rollNo;
    }
}

public class ComparatorInterface {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Logesh"));
        students.add(new Student("Arjun"));
        students.add(new Student("Chakresh"));
        students.add(new Student("Gokul"));
        students.add(new Student("Rajiv"));
        students.add(new Student("Banu"));
        students.add(new Student("Sri"));
        Collections.sort(students);
        System.out.println(students);
       Collections.sort(students,new SortbyNameReverse());
        System.out.println(students);
        Collections.sort(students,new SortbyRollReverse());
        System.out.println(students);
        Collections.sort(students,(a,b)->a.rollNo-b.rollNo);
        System.out.println(students);
    }
}
