package Basics;
import java.util.ArrayList;
import java.util.Arrays;
public class ArraysBasic {
    public static void main(String[] args) {
        System.out.println("Hello");
        int[] arr = new int[5];
        Arrays.fill(arr,12);
        for(int i : arr)
            System.out.println(i);
        int[] arr1 = {1,2,3};
        System.out.println(Arrays.asList(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.binarySearch(arr1,7));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.equals(arr1,arr));
        int[] arr2 = new int[]{1,2,3};
        int arr3[] = Arrays.copyOf(arr2,arr2.length);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        arr2[1] = 100;
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

    }
}
