package Basics_Parctices;

import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindromeNum(int n)
    {
        int original = n;
        int rev = 0;
        while (n>0) {
            int r = n%10;
            rev = rev *10 +r;
            n/=10;
        }
        return original ==rev;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of number");
        int num = sc.nextInt();

        boolean ans = isPalindromeNum(num);
        System.out.println(ans);
        sc.close();
    }
}
