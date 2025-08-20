package Ch4_String;

import java.util.Scanner;

public class StratWith_char {
    public static boolean startwith(String str, String s)
    {
        int count = 0;
        for(int i=0; i< s.length(); i++)
        {
            if(str.charAt(i)==s.charAt(count))
            {
                count++;
            }
        }
        if(s.length() == count)
            {
                return true;
            }
            else
            {
                return false;
            }
    }
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of String: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the charcter to checks");
        String s = sc.nextLine();

        System.out.println(startwith(str1, s));
        sc.close();
    }
}
