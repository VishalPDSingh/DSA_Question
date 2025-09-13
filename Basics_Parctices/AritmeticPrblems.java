package Basics_Parctices;

import java.util.Scanner;

public class AritmeticPrblems {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        
        System.out.println("Enter the oprator('+', '-','*','/','%')");
        char op = sc.next().charAt(0);

        System.out.println("Enter the value of y");
        int y = sc.nextInt();

        if(op == '+')
        {
            System.out.println(x+y);
        }else if(op == '-')
        {
            System.out.println(x-y);
        }
        else if(op=='*')
        {
            System.out.println(x*y);
        }
        else if(op == '/')
        {
            System.out.println(x/y);
        }
        else if(op == '%')
        {
            System.out.println(x%y);
        }
        else
        {
            System.out.println("Input is wrong");
        }
        sc.close();
    }
}
