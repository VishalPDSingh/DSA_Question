package Ch1_Array_2d_arrList;

public class Longest_Common_String14 {
    public static void main(String[] args) {
        String str[] = { "abcd", "abc", "ab" };

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str[0].length(); i++) {
            char c = str[0].charAt(i);
            for (int j = 1; j < str.length; j++) {
                // stop if current string is too short or mismatch found
                if (i >= str[j].length() || str[j].charAt(i) != c) {
                    System.out.println("Longest Common Prefix: " + result.toString());
                    return;
                }
            }
            result.append(c);
        }
        System.out.println("Longest Common Prefix: " + result.toString());
    }
}
