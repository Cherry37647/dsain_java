package Arrays;

import java.util.Arrays;

public class sortofelement {
    public static void main(String[] args){
        int[] arr={2,4,-7,8,-1};
        int[] copied=Arrays.copyOf(arr,arr.length);
        //System.out.println("original array "+Arrays.toString(arr));
        print(arr);
        for(int i=0;i<copied.length;i++){
            if(i%2==0){
                arr[i]+=10;
            }else {
                arr[i] *= 2;
            }
        }
        System.out.println("modified array "+Arrays.toString(copied));
        Arrays.sort(arr);
        System.out.println("sorted array "+Arrays.toString(arr));

    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }



}
