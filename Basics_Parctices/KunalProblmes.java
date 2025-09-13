package Basics_Parctices;

import java.util.Scanner;

public class KunalProblmes {
    public static int goToHome(int days)
    {
        int count = 0;
        for(int i=1; i<=days; i++)
        {
            if(days%i == 0)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total days in month August: ");
        
        int days = sc.nextInt();
        int ans = goToHome(days);
        System.out.println(ans);
        sc.close();
    }
}
