package Arrays;
import java.util.Arrays;
public class RotateArray {
    static int[] arr = {2, 3, 6, 9, 0, 6, 8, 4};
    public static void main(String[] args) {
        int n = arr.length;
        int d=3;
        reverse (0,d-1);
        reverse (d,n-1);
        reverse (0,n-1);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
    public static void reverse(int i,int j){
        // 9,0,6,8,4,2,3,6

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }


    }


}
