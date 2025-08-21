package Ch4_String;

import java.util.Scanner;

public class Count_num_vowel {
    public static int numVowel(String str)
    {
        int count = 0;
        for(int i=0; i<str.length(); i++)
        {
           char c = str.charAt(i);
           if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||c=='A' || c=='I'||c=='E' || c=='O' || c =='U')
           {
            count++;
           }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println(numVowel(str));
        sc.close();
    }
}
