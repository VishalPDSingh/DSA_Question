package Basics_Parctices;

import java.util.Scanner;

public class FactorialOfNum {
    public static int factorial(int num)
    {
        int fact = 1;
        for(int i=1; i<=num; i++)
        {
            fact = fact *i;
        }
        return fact;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find factorial n");
        int n =sc.nextInt();
        int ans = factorial(n);

        System.out.println("Factorial of Num is: "+ans);

        sc.close();
    }
}
