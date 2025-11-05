package java8features.functionalinterface;

public class Employee {
    private int id;
    private static int count = 1;
    private String name;
    private String dept;
    private double salary;
    Employee(String name,int salary,String dept){
        this.id = count;
        count++;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
    @Override
    public String toString(){
        return id+" Name: "+name+" Salary: "+salary+" Department: "+dept;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setDept(String dept){
        this.dept = dept;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary(){
        return salary;
    }
    public int getId() {
        return id;
    }
    public String getDept(){
        return dept;
    }
    public String getName() {
        return name;
    }
}
