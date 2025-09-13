package Basics_Parctices;

import java.util.Scanner;

public class PerimeterOfEquilateral {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();

        int area = 3*a;
        System.out.println("Area is "+area);
        sc.close();
    }
}
