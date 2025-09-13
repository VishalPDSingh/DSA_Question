package Basics_Parctices;

import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of a");
        int a = sc.nextInt();

        int area = 4*a;
        System.out.println("Area is "+area);
        sc.close();
    }
}
