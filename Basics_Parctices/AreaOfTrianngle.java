package Basics_Parctices;

import java.util.Scanner;

public class AreaOfTrianngle {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of base ");
        int b =sc.nextInt();

        System.out.println("Enter the value of height: ");
        int h = sc.nextInt();

        int area = (b*h)/2;

        System.out.println("Area is "+area);
        sc.close();
    }
}
