package CollectionsConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    static int cnt = 0;
    int rollNo;
    String name;
    {
        cnt++;
        rollNo = cnt;
    }
    Student(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return rollNo+" "+this.name;
    }

    @Override
    public int compareTo(Student other) {
        int cmp = this.name.compareTo(other.name);
        if(cmp==0) cmp = this.rollNo - other.rollNo;
        return cmp;
    }
}
public class ComparableInterface {
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
    }
}
