package Ch4_String;

import java.util.Scanner;

public class LastIndexOf {
    public static int lastIndexOf(String s, char c)
    {
        for(int i=s.length()-1; i>=0; i--)
        {
            if(s.charAt(i)==c)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

         System.out.println("Enter the value of String: ");
        String str = sc.nextLine();
        System.out.println("Enter the value of charter");
        char ch = sc.nextLine().charAt(0); // read charcter

        System.out.println(lastIndexOf(str, ch));
        sc.close();
    }
}
