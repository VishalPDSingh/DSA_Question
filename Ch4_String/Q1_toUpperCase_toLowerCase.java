package Ch4_String;

import java.util.Scanner;

public class Q1_toUpperCase_toLowerCase {
    // to upper Case to lower case
    public static String lowerCase(String s1)
    {
        String str = "";
        for(int i=0; i<s1.length(); i++)
        {
            char ch = s1.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                str = str+(char)(ch+32);
            }
            else
            {
                str = str+ch;
            }
        }
        return str;
    }

    public static String upperCase(String s1)
    {
        String str = "";
        for(int i=0; i<s1.length(); i++)
        {
            char ch = s1.charAt(i);
            if(ch>='a' && ch<='z')
            {
                str = str+(char)(ch-32);
            }
            else
            {
                str = str+ch;
            }
        }
        return str;
    }
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the string in Captial Latter");
        String s1 = sc.nextLine();

        String ans = lowerCase(s1);
        System.out.println(ans);

       System.out.println("Enter the value in lower String: ");
       String s2 = sc.nextLine();
       String ans2 = upperCase(s2);
       System.out.println(ans2);

       // alphabate in capital letters
       for(char i='A'; i<='Z'; i++)
       {
        System.out.print(i);
       }

       sc.close();
    }
}
