package Basics_Parctices;

import java.util.Scanner;

public class SimpleInterst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of principle: ");
        int p =sc.nextInt();
        System.out.println("Enter the value of time");
        int time = sc.nextInt();
        System.out.println("Enter the value of rate");
        int rate = sc.nextInt();

        int si = (p*time*rate)/100;
        System.out.println("SI is "+si);
        sc.close();
    }
}
