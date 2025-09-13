package Basics_Parctices;

import java.util.Scanner;

public class FindLargestNumUptoZero {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (true) {
            System.out.println("Enter the value of n");
            int n =sc.nextInt();

            if(n==0)
            {
                break;
            }
           if(max < n)
           {
            max = n;
           }
        }
        System.out.println("max value is "+max);
        sc.close();
    }
}
