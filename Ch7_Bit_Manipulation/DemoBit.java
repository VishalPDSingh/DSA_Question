package Ch7_Bit_Manipulation;

import java.util.Scanner;

public class DemoBit {
    public static String decimaltobinary(int n)
    {
        String b = "";
        while (n>=1) {
            int x = n%2;
            n=n/2;
            b = x+b;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        String ans = decimaltobinary(n);
        System.out.println(ans);
        sc.close();
    }
}
