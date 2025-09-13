package Basics_Parctices;

import java.util.Scanner;

public class FactorOfNumber {
    public static void factor(int num)
    {
        for(int i=2; i<=num; i++)
        {
            if(num%i ==0)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        factor(n);

        sc.close();
    }
}
