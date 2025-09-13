package Basics_Parctices;

import java.util.Scanner;

public class PowerIn {
    public static int powerOfNum(int b, int p)
    {
        int power = 1;
        while(p>=1)
        {
            power = power * b;
            p--;
        }
        return power;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of base: ");
        int b = sc.nextInt();

        System.out.println("Enter the value of p for power");
        int p = sc.nextInt();

        int ans = powerOfNum(b, p);
        System.out.println("Power of "+b+" to " +p+ " is equal to "+ans);
        sc.close();
    }
}
