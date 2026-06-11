package Arrays;

public class Segregate0s1s {
    static void segrg0s1s(int[] arr){

        int i=0; int j= arr.length-1;
        while(i<j){

            if(arr[i]==0){
                i++;
            }
            else if (arr[j]==1){
                j--;
            }
            else { //(arr[i]==1  &&  arr[j]==0)
                arr[i]=0;
                arr[j]=1;
                i++; j--;
            }


        }
        for ( int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static void main (String[] args){
        int[] arr={0,1,0,1,0,0,1};
        segrg0s1s(arr);
    }
}
