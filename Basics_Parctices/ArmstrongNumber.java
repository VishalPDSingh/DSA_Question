package Basics_Parctices;

import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean isArmstrongNumber(int num)
    {
        int sum = 0;
        int m = num;
        while (num>0) {
            int r = num%10;
            sum = sum + (r*r*r);
            num/=10;
        }
        if(sum == m)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of Number ");
        int num = sc.nextInt();

        boolean ans = isArmstrongNumber(num);
        System.out.println(ans);
        sc.close();
    }
}
