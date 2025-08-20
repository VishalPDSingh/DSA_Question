package Ch4_String;

import java.util.Scanner;

public class IndexOf_Method {
    public static int indexOf(String str, String ch)
    {
        char key = ch.charAt(0);
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == key)
            {
                return i ;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of String: ");
        String s = sc.nextLine();
        System.out.println("Enter the charcter to print its positions: ");
        String ch = sc.nextLine();

        System.out.println(indexOf(s, ch));

        // built in method 
        String str = "vishal";
        System.out.println(str.indexOf('s'));
        sc.close();
    }
}
