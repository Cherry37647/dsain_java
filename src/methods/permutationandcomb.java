package methods;

import java.util.Scanner;

public class permutationandcomb {
    public static double fact(double x){
        double f=1;
        for(double i=1;i<=x;i++){
            f*=i;
        }
        return f;
    }
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        double n= sc.nextDouble();
        System.out.println("Enter the value of r");
        double r= sc.nextDouble();
        double per=fact(n)/fact(r);
        double com=fact(n)/(fact(r)*fact((n-r)));
        System.out.println("permutation is "+per);
        System.out.println("combination is "+com);

    }

}
