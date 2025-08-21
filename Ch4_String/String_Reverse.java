package Ch4_String;

import java.util.Scanner;

public class String_Reverse {
    public static char[] reverse(String str)
    {
        char ch [] = str.toCharArray();
        int start = 0;
        int end = str.length()-1;
        while (start<=end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        return ch;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        System.out.println(str.toCharArray());
        System.out.println(reverse(str));
        sc.close();
    }
}
