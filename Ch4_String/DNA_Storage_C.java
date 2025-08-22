package Ch4_String;

import java.util.Scanner;

public class DNA_Storage_C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("Enter the string: ");
        String str = sc.next();

        String ans = "";
        for(int i=0; i<n; i+=2)
        {
            char first = str.charAt(i);
            char second = str.charAt(i + 1);
            if(first =='0' && second =='0')
            {
                ans = ans + "A";
            }else if(first =='0' && second =='1')
            {
                ans = ans+ "T";
            }else if(first =='1' && second=='0')
            {
                ans = ans+ "C";
            }else if(first =='1' && second =='1')
            {
                ans = ans+"G";
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
