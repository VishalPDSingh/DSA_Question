package Basics_Parctices;

import java.util.Scanner;

public class CountNumber {
    public static int countNum(int n)
    {
        int count = 0;
        while(n>0)
        {
            n/=10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter the value of n");
        int n = sc.nextInt();

        int ans = countNum(n);
        System.out.println(ans);
        sc.close();
    }
}
