package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6,9,0,6,8,4};
        int n = arr.length;
        System.out.println("Reverse array");
        int i=0;int j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for( int elem: arr){
            System.out.print(elem+" ");
        }

    }
}
//        for (int i = n - 1; i >= 0; i--) {
//            System.out.print(arr[i]+"  ");
//
//