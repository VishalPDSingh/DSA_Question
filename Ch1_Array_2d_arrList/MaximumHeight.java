package Ch1_Array_2d_arrList;

import java.util.Scanner;

public class MaximumHeight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt(); // size of array
        System.out.println("Enter the number of test cases");
        int t = sc.nextInt();

        int arr[] = new int[n];
        int maxHeight = Integer.MIN_VALUE; //maximum height of array
        while(t>0)
        {
            for(int i=0; i<n; i++)
            {
                arr[i] = sc.nextInt();
                if(arr[i]>maxHeight)
                {
                    maxHeight = arr[i];
                }
            }
            System.out.println(maxHeight);
            t--;
        }
        sc.close();
    }
}
