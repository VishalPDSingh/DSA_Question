package Pattern;

import java.util.Scanner;

public class Pattern2 {
    public static void pattern2(int n)
    {
        for(int i=0; i<=n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------------------------");

        int i=0; 
        while (i<=n) {
            int j=0;
            while (j<=i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of line n");
        int n = sc.nextInt();
        pattern2(n);
        sc.close();
    }
}
