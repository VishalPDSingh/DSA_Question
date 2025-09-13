package Pattern;

import java.util.Scanner;

public class Pattern3 {
    public static void pattern3(int n)
    {
        int i=0;
        while (i<=n) {
            int j=0;
            while (j<=n-i) {
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
        }

        System.out.println("----------------------------------");
        for(int j=0; j<=n; j++)
        {
            for(int k=0; k<=n-j; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of line n");
        int n = sc.nextInt();
        pattern3(n);
        sc.close();
    }
}
