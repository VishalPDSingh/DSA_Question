package Ch4_String;
import java.util.Scanner;

public class MiddleCharPosition {

    public static int positionOfMiddleChar(String str, char ch) {
        // Step 1: Count total occurrences
        int total = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                total++;
            }
        }

        if (total == 0) {
            return -1; // character not found
        }

        // Step 2: Find middle occurrence
        int middle = (total + 1) / 2;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
                if (count == middle) {
                    return i; // return the middle index
                }
            }
        }

        return -1; // fallback
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of String:");
        String s = sc.nextLine();

        System.out.println("Enter the char to find the position:");
        char ch = sc.nextLine().charAt(0);

        int ans = positionOfMiddleChar(s, ch);
        if (ans != -1) {
            System.out.println("Middle occurrence index of '" + ch + "' is: " + ans);
        } else {
            System.out.println("Character not found in string.");
        }
        
        sc.close();
    }
}
