package Ch4_String;

import java.util.Scanner;

public class Character_Count {
    public static int count_Char(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the chracter: ");
        char ch = sc.nextLine().charAt(0);

        System.out.println(count_Char(str, ch));
        sc.close();
    }
}
