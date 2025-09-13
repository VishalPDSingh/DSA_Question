package Basics_Parctices;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of d1 and d2");
        int d1 =sc.nextInt();
        int d2 =sc.nextInt();

        int area = (d1*d2)/2;
        System.out.println("Area is "+area);
        sc.close();
    }
}
