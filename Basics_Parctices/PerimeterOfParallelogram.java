package Basics_Parctices;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b=sc.nextInt();

        int perimeter = (a+b)*2;
        System.out.println("Perimeter is "+perimeter);
        sc.close();
    }
}
