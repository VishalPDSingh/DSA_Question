package Basics_Parctices;

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a =sc.nextInt();

        int area = a*2;
        System.out.println("Area is "+area);
        sc.close();

    }
}
