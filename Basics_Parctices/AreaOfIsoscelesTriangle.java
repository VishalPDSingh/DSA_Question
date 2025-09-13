package Basics_Parctices;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of base ");
        int b = sc.nextInt();

        System.out.println("Enter the value of a");
        int a =sc.nextInt();

        double area = (Math.sqrt(a*a - (b*b)/4 )*b)/2;
        System.out.println("Area is "+area);
        sc.close();
    }
}
