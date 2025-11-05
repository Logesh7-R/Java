package Basics;

public class TypeCasting {
    public static void main(String[] args){
//        boolean bool = true;
//        int numInt = (int)bool;
//        Error because bool cant be type caste to anything and vice versa
        double numDouble = 12;
        float numFloat = (float) numDouble;
        long numLong = (long)numFloat;
        int numInt = (int)numLong;
        short numShort = (short)numInt;
        byte numByte = (byte)numShort;
        char ch = (char)numDouble;

        System.out.println("Character: "+ch);
        System.out.println("Byte: "+numByte);
        System.out.println("Short: "+numShort);
        System.out.println("Int: "+numInt);
        System.out.println("Long: "+numLong);
        System.out.println("Float: "+numFloat);
        System.out.println("Double: "+numDouble);
    }
}
