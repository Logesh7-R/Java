package Basics;

public class TypeCoersion {
    public static void main(String[] args){
//        boolean bool = true;
//        int numInt = (int)bool;
//        Error because bool cant be type caste to anything and vice versa
        char ch = 'a';
        byte numByte = 12;
        short numShort = numByte;
        int numInt = numShort;
        int chInt = ch;
        long numLong = 987654321L;
        float numFloat = numLong;
        double numDouble = numFloat;
        System.out.println("Byte: "+numByte);
        System.out.println("Short: "+numShort);
        System.out.println("Int: "+numInt);
        System.out.println("Long: "+numLong);
        System.out.println("Float: "+numFloat);
        System.out.println("Double: "+numDouble);
        System.out.println("chInt: "+chInt);
    }
}
