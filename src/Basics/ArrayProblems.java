package Basics;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayProblems {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Fibonacci Series");
        System.out.println("Enter number:");
        int n = sc.nextInt();
        fibo(n);

        System.out.println("Biggest number in an array");
        System.out.println(bigNum());

        System.out.println("Sorting an array");
        Sorting();

        System.out.println("Factorial");
        System.out.println("Enter number:");
        int m = sc.nextInt();
        System.out.println(fact(m));
    }
     public static void fibo(int n){
        int i = 0;
        int j = 1;
        for(int k = 0;k<n;k++){
            System.out.print(i+" ");
            j+=i;
            i = j-i;
        }
        System.out.println();
    }

    public static int bigNum(){
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            System.out.println("Enter Number: ");
            arr[i] = sc.nextInt();
        }
        int max = arr[n-1];
        for(int i : arr){
            if(i>max) max = i;
        }
        return max;
    }
    public static void Sorting() {
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Number: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Sorting: "+ Arrays.toString(arr));
        for(int i = 0;i<n;i++){
            int min = i;
            for(int j = i+1;j<n;j++){
                if(arr[min]>arr[j])
                    min = j;
            }
//            arr[i]+=arr[min];
//            arr[min] = arr[i]-arr[min];
//            arr[i] -= arr[min];
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("After Sorting: "+ Arrays.toString(arr));
    }

    public static int fact(int n){
        if(n<=0)return 0;
        return n+fact(n-1);
    }

}
