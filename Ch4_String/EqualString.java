package Ch4_String;

import java.util.Scanner;

public class EqualString {
    public static boolean equal_String(String str1, String str2)
    {
        if(str1.length()!=str2.length())
        {
            return false;
        }
        for(int i=0; i<str1.length(); i++)
        {
            if(str1.charAt(i)!=str2.charAt(i))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of String: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the 2nd string");
        String str2 = sc.nextLine();
        System.out.println(equal_String(str1, str2));

        sc.close();
    }
}
