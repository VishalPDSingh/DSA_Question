package Basics_Parctices;

import java.util.Scanner;

public class Permutation_Combination {
    public static int factorial(int num)
    {
        int fact = 1;
        for(int i=1; i<=num; i++)
        {
            fact = fact*i;
        }
        return fact;
        
    }

    //Permutation (nPr)
    public static int Permutation(int n, int r)
    {
        int n_fact = factorial(n);
        int nmr_fact = factorial(n-r);
         return n_fact/nmr_fact;
    }

    // Combination

    public static int Combination(int n, int r)
    {
        int nfact = factorial(n);
        int rfact = factorial(r);
        int nmrFact = factorial(n-r);
        return nfact/(rfact*nmrFact);
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        System.out.println("Enter the value of r");
        int r =sc.nextInt();

        int ans1 = Permutation(n, r);
        System.out.println(ans1);

        int ans2 = Combination(n, r);
        System.out.println(ans2);
        sc.close();
    }
}
