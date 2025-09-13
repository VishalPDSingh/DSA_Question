package Basics_Parctices;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of Base Height");
        int bh = sc.nextInt();

        System.out.println("Enter the value of Height");
        int h =sc.nextInt();

        int area = bh*h;
        System.out.println("Area is"+area);
        sc.close();
    }
}
