package Basics_Parctices;


import java.util.Scanner;

public class HCF {

    // Method to calculate HCF
    public static int hcf(int x, int y) {
        int hcf = 1; // default

        // Find the smaller number
        int smaller = (x < y) ? x : y;

        // Check all numbers till 'smaller'
        for (int i = 1; i <= smaller; i++) {
            if (x % i == 0 && y % i == 0) {
                hcf = i; // update hcf whenever a common divisor is found
            }
        }
        return hcf;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of 1st number: ");
        int x = sc.nextInt();

        System.out.print("Enter the value of 2nd number: ");
        int y = sc.nextInt();

        int result = hcf(x, y);
        System.out.println("HCF of " + x + " and " + y + " is: " + result);

        sc.close();
    }
}

