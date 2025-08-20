package Ch4_String;

import java.util.Scanner;

public class endWith_Value {
     public static boolean endwith(String str, String s)
    {
        int count = 0;
        for(int i=str.length()-s.length(); i<str.length(); i++)
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

        System.out.println(endwith(str1, s));
        sc.close();
    }
}
