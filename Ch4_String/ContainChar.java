package Ch4_String;

import java.util.Scanner;

public class ContainChar {
    public static boolean containOrNot(String str, String t) {
        if (t.length() > str.length()) return false;

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t.charAt(count)) {
                count++;
                if (count == t.length()) {
                    return true; // found substring
                }
            } else {
                // reset count properly
                if (str.charAt(i) == t.charAt(0)) {
                    count = 1; // restart from beginning of substring
                } else {
                    count = 0;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of String: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the substring to check: ");
        String s = sc.nextLine();

        System.out.println(containOrNot(str1, s));
        sc.close();
    }
}
