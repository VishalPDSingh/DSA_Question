package Basics_Parctices;

import java.util.Scanner;

public class EvenOdd_Num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digit");
        int x = sc.nextInt();

        if(x%2 == 0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is odd");
        }
        sc.close();
    }
}
