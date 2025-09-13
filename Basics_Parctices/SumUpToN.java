package Basics_Parctices;

import java.util.Scanner;

public class SumUpToN {
    public static int sumOfNaturalNum(int num)
    {
        int sum = 0;
        for(int i=0; i<=num; i++)
        {
            sum = sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        int ans = sumOfNaturalNum(n);
        System.out.println("Sum is "+ans);
        sc.close();
    }
}
