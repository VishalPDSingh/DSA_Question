package Basics_Parctices;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of r");
        int r =sc.nextInt();

        int area =2*(int)Math.PI*r;

        System.out.println("Area is "+area);
        sc.close();
    }
}
