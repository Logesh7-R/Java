package java8features.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class EmployeeManagement {
    public static void main(String[] args) {
        Supplier<List<Employee>> producer = ()->{
          return  List.of(
                  new Employee("Logesh", 50000, "IT"),
                  new Employee("Vijay", 60000, "HR"),
                  new Employee("Surya", 70000, "IT"),
                  new Employee("Rajiv", 55000, "Finance"),
                  new Employee("Hero", 550000, "IT")
          );
        };

        Predicate<Employee> isIT = (emp)->emp.getDept().equalsIgnoreCase("it");
        Predicate<Employee> isFinance = (emp)->emp.getDept().equalsIgnoreCase("finance");
        Predicate<Employee> deptFilter = isIT.or(isFinance);
        Predicate<Employee> isTaxEligibility = (emp)->emp.getSalary()>100000;

        Function<Employee,Employee> salaryIncrement = (emp)->{
            emp.setSalary(emp.getSalary()*1.5);
            System.out.println(emp.getId()+" salary incremented done...");
            return emp;
        };
        Function<Employee,Employee> taxReduction = (emp)->{
            emp.setSalary(emp.getSalary()-emp.getSalary()*0.05);
            System.out.println(emp.getId()+" tax reduction done...");
            return emp;
        };
        Consumer<Employee> printer = (emp)-> System.out.println(emp);

        ArrayList<Employee> list = new ArrayList<>(producer.get());
        System.out.println("Before Increment:");
        list.forEach(printer);
        list.stream().filter(deptFilter)
                .map(salaryIncrement)
                .sorted((e1,e2)->e1.getName().compareTo(e2.getName()))
                .forEach(System.out::println);
        for(Employee emp:list){
            if(deptFilter.test(emp)){
                salaryIncrement.apply(emp);
            }
            if(isTaxEligibility.test(emp)){
                taxReduction.apply(emp);
            }
        }
        System.out.println("After salary updation...");
        list.forEach(printer);

    }
}
