package Basics_Parctices;

import java.util.Scanner;

public class Leet1281_subtractProductAndSum {

    public static int subtractProductAndSum(int n)
    {
        int mul = 1;
        int sum = 0;
        while (n>0) {
            int r = n%10;
            mul = mul*r;
            sum = sum+r;
            n/=10;
        }
        int sub = mul - sum;
        return sub;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();

        int ans = subtractProductAndSum(n);
        System.out.println(ans);
        sc.close();
    }
}
