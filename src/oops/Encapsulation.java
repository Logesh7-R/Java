package oops;
class Bank{
    static int count = 0;
    private int balance;
    private String name;
    private int id;
    Bank(){
        id = ++count;
        balance = 0;
        name = String.valueOf(id);
        System.out.println("Account created");
    }
    Bank(String name){
        this();
        this.name = name;
    }
    Bank(String name,int balance){
        this(name);
        this.balance = balance;
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }

    public String getName(){
        return this.name;
    }
    public int getBalance(){
        return this.balance;
    }

    @Override
    public String toString() {
        return "Customer id: "+this.id+"\nName: "+this.name;
    }
}
public class Encapsulation {
   public static void main(String... args){
       Bank logesh = new Bank();
       System.out.println(logesh.toString());
       System.out.println();
       logesh.setBalance(10000);
       logesh.setName("Logesh");
       System.out.println(logesh.getBalance());
       System.out.println(logesh.toString());
       System.out.println();
       Bank logi = new Bank("Logi");
       System.out.println(logi.getBalance());
       System.out.println(logi.toString());
       System.out.println();
   }

}
