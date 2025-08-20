package Ch4_String;

import java.util.Scanner;

public class Upper_LowerCase {

    // LowerCase to UppperCase
    public static String UpperCase(String str) {
        String s = " ";
        for (int i = 0; i < str.length(); i++) {

            // s = s+ (char)(str.charAt(i)-32);
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                s = s + (char) (c - 32);
            } else {
                s = s + c;
            }
        }
        return s;
    }

    // Upper to Lower Case
    public static String LowerCase(String str) {
        String s = " ";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                s = s + (char) (c + 32);
            } else {
                s = s + c;
            }
        }
        return s;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string value: ");
        String s = sc.nextLine();
        System.out.println(UpperCase(s));
        System.out.println(LowerCase(s));

        // In built method
        String str = "vishAl";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        char ch1 = 'A';
        char ch2 = 'a';
        char ch3 = '0';

        // Casting char to int gives its decimal value (Unicode/ASCII)
        System.out.println("Character: " + ch1 + " -> Decimal value: " + (int) ch1);
        System.out.println("Character: " + ch2 + " -> Decimal value: " + (int) ch2);
        System.out.println("Character: " + ch3 + " -> Decimal value: " + (int) ch3);

        // Example with a non-ASCII character (Unicode)
        char hindi = 'अ';
        System.out.println("Character: " + hindi + " -> Decimal value: " + (int) hindi);
        sc.close();
    }
}
