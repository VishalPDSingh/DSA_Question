package Basics_Parctices;

import java.util.Scanner;

public class AreaOfEquilateral {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a =sc.nextInt();

        double area = (Math.sqrt(3)/4)*a;
        System.out.println("Area is "+area);
        sc.close();
    }
}
