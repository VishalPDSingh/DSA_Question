package Ch4_String;

import java.util.Scanner;

public class Q3_findLast_index_char {

     public static int positionOfChar(String str, char ch)
    {
        for(int i=str.length()-1; i>=0; i--)
        {
            char c = str.charAt(i);
            if(c == ch)
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of String");
        String s = sc.nextLine();
        System.out.println("Enter the char to find the poasition: ");
        char ch = sc.nextLine().charAt(0);
        int ans = positionOfChar(s, ch);
        System.out.println(ans);
         sc.close();
    }
}
