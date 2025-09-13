package Ch4_String;

import java.util.Scanner;

public class Q7_Character_Count {
    public static int charcterCount(String str)
    {
        int count=0;
        for(int i=0; i<str.length(); i++)
        {
            char c = str.charAt(i);
            if(c>='a' || c<='z' && c>'A' || c<='Z')
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
        int ans = charcterCount(str);
        System.out.println(ans);
        sc.close();
    }
}
