package Arrays;

import java.util.Scanner;

public class arrrays_basis {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={
                10,-9,3,-8,2
        };
        System.out.println(arr.length);
        System.out.println(arr[4]);
        int[] ass=new int[6];
        int n=ass.length;
        System.out.println("total number of element in array "+n);
        System.out.println("Enter array element");
        for(int i=0;i<n;i++){
            ass[i]=sc.nextInt();
        }
        System.out.println("original array ass");
        for (int i=0; i<n;i++){
            System.out.print(ass[i]+"   ");

        }
        System.out.println(" ");
        System.out.println(ass[1]);
        System.out.println("second original array arr");
        for (int i=0;i<arr.length;i++){

            if(arr[i]<0){
                System.out.println(arr[i]);
            }
        }




    }
}
