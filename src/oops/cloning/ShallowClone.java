package oops.cloning;
class Address implements Cloneable{
    int houseNo;
    String street;
    Address(int houseNo,String street){
        this.houseNo = houseNo;
        this.street = street;
    }
    @Override
    public String toString() {
        return this.houseNo+" "+this.street;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
class Student implements Cloneable{
    public String name ;
    public int age;
    Address add;
    Student(String name, int age, int hosueNo, String street){
        this.age = age;
        this.name = name;
        this.add = new Address(hosueNo,street);
    }

    @Override
    public String toString() {
        return this.name+" "+this.age+" "+this.add;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class ShallowClone {
    public static void main(String... args) throws CloneNotSupportedException {
        Student s1 = new Student("Logesh",22,9,"Chennai");
        System.out.println(s1);
        Student s2 = (Student) s1.clone();
        System.out.println(s2);
        s1.add.houseNo = 12;
        System.out.println(s2);
    }
}
