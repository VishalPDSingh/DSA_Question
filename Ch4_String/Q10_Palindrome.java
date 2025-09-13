package Ch4_String;

import java.util.Scanner;

public class Q10_Palindrome {
    public static boolean palindrome(String str) {
        String t = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            t = t + ch;
        }

        if (t.equals(str)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        String s = sc.nextLine();
        boolean ans = palindrome(s);
        System.out.println(ans);
        sc.close();
    }
}
