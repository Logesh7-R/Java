package oops.cloning;
class Address1 implements Cloneable{
    int houseNo;
    String street;
    Address1(int houseNo,String street){
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
    class Student1 implements Cloneable{
    public String name ;
    public int age;
    Address add;
    Student1(String name, int age, int hosueNo, String street){
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
        Student temp = (Student) super.clone();
        temp.add = (Address) this.add.clone();
        return temp;
    }
}
public class DeepClone {
    public static void main(String... args) throws CloneNotSupportedException {
        Student1 s1 = new Student1("Logesh",22,9,"Chennai");
        System.out.println(s1);
        Student1 s2 = (Student1) s1.clone();
        System.out.println(s2);
        s1.add.houseNo = 12;
        System.out.println(s1);
        System.out.println(s2);
    }
}
