package Basics;

public class Varargs {
    public static void main(String[] args){
        System.out.println(add());
        System.out.println(add(1,2));
    }
    public static int add(int... nums){
        int sum = 0;
        for(int i:nums) sum+=i;
        return sum;
    }
}
