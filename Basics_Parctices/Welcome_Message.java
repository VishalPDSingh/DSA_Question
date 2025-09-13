package Basics_Parctices;

import java.util.Scanner;

public class Welcome_Message {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the your name: ");
        String name = sc.nextLine();

        System.out.println("Welcome to my home "+name);
        sc.close();
    }
}
