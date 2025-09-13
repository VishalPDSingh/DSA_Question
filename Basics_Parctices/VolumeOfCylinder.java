package Basics_Parctices;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of radius ");
        int r =sc.nextInt();

        System.out.println("enter the value of h");
        int h =sc.nextInt();

        int area =(int)Math.PI*r*r*h;
        System.out.println("Area is"+area);
        sc.close();
    }
}
