package Ch4_String;

import java.util.Scanner;

public class Q8_Count_Char {
    public static int count(String s, char c)
    {
        int count = 0;
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch==c)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the char to count");
        char c = sc.nextLine().charAt(0);

        int ans = count(str, c);
        System.out.println(ans);
        sc.close();
    }
}
