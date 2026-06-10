package Arrays;

import java.util.Scanner;

public class sumofelementofarray {
    public static void sumof(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();//n=5
        int[] arr=new int[n];//initialize an array arr={0,0,0,0,0}
        System.out.println("Array element");
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();   // input elements in array

            System.out.print(arr[i]);//arr={2,4,6,7,5}
        }
        System.out.println(" ");

      int sum=0;
      for(int i=0;i<n;i++){
          sum+=arr[i];

      }
        System.out.println("sum of elements of array: "+sum);
    }
    public static void productof(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();//n=5
        int[] arr=new int[n];//initialize an array arr={0,0,0,0,0}
        System.out.println("Array element");
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();   // input elements in array

            System.out.print(arr[i]);//arr={2,4,6,7,5}
        }
      int  pro=1;
      for (int i=0;i<5;i++){
          pro*=arr[i];
      }
    }
    public static void main(String[] args){

        sumof();
        productof();
    }
}
