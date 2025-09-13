package Ch4_String;

import java.util.Scanner;

public class Q6_CountNumberof_Vowel {
    public static int vowel(String s)
    {
        int count = 0;
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
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
        int ans = vowel(str);
        System.out.println(ans);
        sc.close();
    }
}
