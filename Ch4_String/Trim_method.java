package Ch4_String;

import java.util.Scanner;

public class Trim_method {
    public static String trimValue(String str) {
        int si = 0;
        int ei = str.length() - 1;

        // find first non-space
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                si = i;
                break;
            }
        }

        // find last non-space
        for (int j = str.length() - 1; j >= 0; j--) {
            if (str.charAt(j) != ' ') {
                ei = j;
                break;
            }
        }

        // build trimmed string
        String t = "";
        for (int k = si; k <= ei; k++) {
            t += str.charAt(k);
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of String: ");
        String str = sc.nextLine();

        System.out.println("Trimmed String: '" + trimValue(str) + "'");
        sc.close();
    }
}
