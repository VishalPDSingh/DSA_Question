package Pattern;

import java.util.Scanner;

public class Pattern1 {
    public static void patter1(int n)
    {
        // Using for loop
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------");
        // using while loop
        int i=0;
        while(i<=n)
        {
            int j=0;
            while (j<=n) {
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of line");
        int n = sc.nextInt();
        patter1(n);
        sc.close();
    }
}
