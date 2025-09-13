package Basics_Parctices;

import java.util.Scanner;

public class SumUptoZero {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int sum = 0;
        while (true) {
            System.out.println("Enter the value of n");
            int n = sc.nextInt();
            if(n==0)
            {
                break;
            }
            sum = sum+n;
        }
        System.out.println("Sum is "+sum);
        sc.close();
    }
}
