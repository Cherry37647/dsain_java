package Arrays;

public class SecondLargest {
    public static void main(String[] args){
        int[] arr={2,3,6,1,5,3,8,2};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];

            }
        }
        for(int j=0;j<n;j++){
            if( arr[j] > smax &&arr[j]!=max){
                smax=arr[j];


            }

        }
        System.out.println("largest element of array: "+max);
        System.out.println("second largest element of array: "+smax);
    }
}
