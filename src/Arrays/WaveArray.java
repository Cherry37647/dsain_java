package Arrays;

public class WaveArray {
    static void wavelikearray(int[] arr){

        //arrange like arr[1]>=arr[2]<=arr[3]>=arr[4]<=arr[5]
        // in lexicographically smallest one
        //arr={2,1,4,3,5}

        for (int i=0;i<arr.length;i+=2){
            if (i==arr.length-1) break;
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for( int element: arr){
            System.out.print(element+" ");
        }
    }
    public static void main (String[] args){
        int[] arr={1,2,3,4,5};
        wavelikearray(arr);
    }
}
