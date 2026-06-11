package Arrays;

public class MissingElement {
    public static void missingelem(){
        int[] arr={1,3,6,5,4}; // array consist distinct integer from 1 to n-1
        int n=arr.length+1;//n=6
        int sum=n*(n+1)/2;//sum=21
        int arraysum=0;

        for (int ele: arr){
//            System.out.println(ele);
            arraysum+=ele;//arraysum=19
        }
        int s= sum - arraysum;//s=2
        System.out.println("Missing element in array: "+s);

    }
    public static void main(String[] args){
        missingelem();
    }
}
