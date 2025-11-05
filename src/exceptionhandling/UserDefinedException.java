package exceptionhandling;
 class VoteEligibleException extends Exception{
    public VoteEligibleException(String message){
        super(message);
    }
}

class ElectionLeaderException extends RuntimeException{
     public ElectionLeaderException(String message){
         super(message);
     }
}
class UDException{
     void checkAge(int age) throws VoteEligibleException{
         if(age<18 || age>100)
             throw new VoteEligibleException("Enter valid age (18 to 100)");
         else
             System.out.println("Eligible for voting");
     }
     void isLeader(int age){
         try{
             if(age<25)
                 throw new ElectionLeaderException("Enter leader valid age (25 to 100)");
             else
                 System.out.println("Eligible for Leadership");
         }
         catch(ElectionLeaderException e){
             e.printStackTrace();
             System.out.println(e.getMessage());
         }
     }
}
public class UserDefinedException {
     public static void main(String[] args){
         UDException obj = new UDException();
         try{
             obj.checkAge(25);
         } catch (VoteEligibleException e) {
             System.out.println(e.getMessage());
             System.out.println("Exception Handled");
         }
         try{
             obj.checkAge(2);
         } catch (VoteEligibleException e) {
             System.out.println(e.getMessage());
             System.out.println("Exception Handled for age 2");
         }
         obj.isLeader(20);
         obj.isLeader(90);
     }
}
